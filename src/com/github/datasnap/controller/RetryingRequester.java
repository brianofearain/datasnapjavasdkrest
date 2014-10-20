package com.github.datasnap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.datasnap.propertiesandevents.EventListBatchObject;
import com.github.datasnap.utils.Defaults;

public class RetryingRequester extends Requester {

	private static final Logger logger = LoggerFactory
			.getLogger(Defaults.LOGGER);
	
	private int retries;
	private int backoff;
	
	public RetryingRequester(DataSnapClient client) {
		super(client);
		retries = client.getOptions().getRetries();
		backoff = client.getOptions().getBackoff();
	}
	
	@Override
	public boolean send(EventListBatchObject eventListBatchObject) {
		int attempts = 0;
		boolean success = super.send(eventListBatchObject);
		while (!success && attempts < retries) {
			attempts += 1;
			try {
				Thread.sleep(backoff);
			} catch (InterruptedException e) {
				logger.warn("Interrupted during backoff", e);
			}
			logger.info("Retrying request [attempt " + attempts + "] ..");
			success = super.send(eventListBatchObject);
		}
		return success;
	}
	
}
