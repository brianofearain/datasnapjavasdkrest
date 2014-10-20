package com.github.datasnap.controller;

import com.github.datasnap.propertiesandevents.Event;
import com.github.datasnap.stats.DsClientStats;


public class DataSnap {

  private static DataSnapClient defaultClient;

  /**
   * Creates a new Datasnap.io client- a HTTP wrapper over the Datasnap.io REST API.
   * It is designed to be be thread-safe, using batching to efficiently send
   *  requests on a separate resource-constrained thread pool.
   */
  public static synchronized void initialize() {
    if (defaultClient == null) {
      defaultClient = new DataSnapClient(new DataSendingConfig());
    }
  }

  public static synchronized void initialize(DataSendingConfig options) {
    if (defaultClient == null) {
      defaultClient = new DataSnapClient(options);
    }
  }

  private static synchronized void checkInitialized() {
    if (defaultClient == null) {
      throw new IllegalStateException("DataSnap client is "
          + "not initialized. Please call DataSnap.iniitalize(..); "
          + "before calling identify / track / or flush.");
    }
  }

  public void addEvent(Event event) {
    checkInitialized();
    defaultClient.addEvent(event);
  }

  public static void flush() {
    checkInitialized();
    defaultClient.flush();
  }

  public static void close() {
    checkInitialized();
    defaultClient.close();
  }


  public synchronized static DsClientStats getStatistics() {
    checkInitialized();
    return defaultClient.getStatistics();
  }

  public synchronized static DataSnapClient getDefaultClient() {
    checkInitialized();
    return defaultClient;
  }
}
