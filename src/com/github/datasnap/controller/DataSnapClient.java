package com.github.datasnap.controller;

import java.util.List;

import com.github.datasnap.flush.DataSnapThread;
import com.github.datasnap.flush.ICreateEventListBatch;
import com.github.datasnap.propertiesandevents.Event;
import com.github.datasnap.propertiesandevents.EventListBatchObject;
import com.github.datasnap.stats.DsClientStats;

/**
 * The DataSnap.io Client - Instantiate this to use the DataSnap.io API.
 * Creates a new Datasnap.io client- a HTTP wrapper over the Datasnap.io REST API.
 * It is designed to be be thread-safe, using batching to efficiently send
 * requests on a separate resource-constrained thread pool.
 * 
 */
public class DataSnapClient {

	private RetryingRequester requester;
	private DsClientStats statistics;
	private DataSendingConfig config;
	private DataSnapThread dataSnapThread;

	public DataSnapClient(DataSendingConfig config) {
		this.config = config;
		this.statistics = new DsClientStats();
	    this.requester = new RetryingRequester(this);		
		this.dataSnapThread = new DataSnapThread(this, factory, requester);
		this.dataSnapThread.start();
	}
	
	private ICreateEventListBatch factory = new ICreateEventListBatch() {		
		public EventListBatchObject create(List<Event> batch) {
			return new EventListBatchObject(batch);
		}
	};

	public void addEvent(Event event) {
		dataSnapThread.enqueue(event);
		statistics.updateEvents(1);
	}

	public void flush() {
		this.dataSnapThread.flush();
	}

	public void close() {
		this.dataSnapThread.close();
		this.requester.close();
	}

	public DataSendingConfig getOptions() {
		return config;
	}

	public DsClientStats getStatistics() {
		return statistics;
	}

}
