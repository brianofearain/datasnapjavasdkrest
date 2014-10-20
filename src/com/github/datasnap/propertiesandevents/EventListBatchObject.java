package com.github.datasnap.propertiesandevents;

import java.util.List;
import java.util.UUID;

import org.joda.time.DateTime;

public class EventListBatchObject {

	private List<Event> batch;
	// private String messageId;
	private DateTime sentAt;
	
	public EventListBatchObject(List<Event> batch) {
		this.batch = batch;
	//	this.messageId = UUID.randomUUID().toString();
	}
	
	public List<Event> getBatch() {
		return batch;
	}
	
	public void setBatch(List<Event> batch) {
		this.batch = batch;
	}
	
	/* public String getMessageId() {
		return messageId;
	}
	
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	*/
	public DateTime getSentAt() {
		return sentAt;
	}
	
	public void setSentAt(DateTime sentAt) {
		this.sentAt = sentAt;
	}
	
}
