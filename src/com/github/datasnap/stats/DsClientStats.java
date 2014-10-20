package com.github.datasnap.stats;

public class DsClientStats extends Stats {

	private static final long serialVersionUID = 5469315718941515883L;

	private static String DROPPED_KEY = "Dropped";
	private static String EVENT_KEY = "Event";
	private static String FAILED_KEY = "Failed";
	private static String FLUSHED_ATTEMPTS_KEY = "Flushed Attempts";
	private static String INSERTED_KEY = "Inserted";
	private static String QUEUED_KEY = "Queued";
	private static String REQUEST_TIME_KEY = "Request Time";
	private static String SUCCESSFUL_KEY = "Successful";


	public Stat getDropped() {
		return ensure(DROPPED_KEY);
	}

	public void updateDropped(double val) {
		update(DROPPED_KEY, val);
	}
	
	public Stat getEvents() {
		return ensure(EVENT_KEY);
	}
	

	public void updateEvents(double val) {
		update(EVENT_KEY, val);
	}

	
	public Stat getFailed() {
		return ensure(FAILED_KEY);
	}

	public void updateFailed(double val) {
		update(FAILED_KEY, val);
	}

	public Stat getFlushAttempts() {
		return ensure(FLUSHED_ATTEMPTS_KEY);
	}

	public void updateFlushAttempts(double val) {
		update(FLUSHED_ATTEMPTS_KEY, val);
	}

	public Stat getInserted() {
		return ensure(INSERTED_KEY);
	}

	public void updateInserted(double val) {
		update(INSERTED_KEY, val);
	}
	

	public Stat getRequestTime() {
		return ensure(REQUEST_TIME_KEY);
	}

	public void updateRequestTime(double val) {
		update(REQUEST_TIME_KEY, val);
	}


	public Stat getSuccessful() {
		return ensure(SUCCESSFUL_KEY);
	}

	public void updateSuccessful(double val) {
		update(SUCCESSFUL_KEY, val);
	}
	public Stat getQueued() {
		return ensure(QUEUED_KEY);
	}

	public void updateQueued(double val) {
		update(QUEUED_KEY, val);
	}


}