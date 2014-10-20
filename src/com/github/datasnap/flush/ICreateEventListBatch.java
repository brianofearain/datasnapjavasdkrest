package com.github.datasnap.flush;

import java.util.List;

import com.github.datasnap.propertiesandevents.EventListBatchObject;
import com.github.datasnap.propertiesandevents.Event;

/**
 * A Factory that creates EventListBatchObject objects
 *
 */
public interface ICreateEventListBatch {

	/**
	 * Creates a batch model around a list of items
	 * @param batch A list of items that represents the batch
	 * @return {@link EventListBatchObject}
	 */
	public EventListBatchObject create(List<Event> batch);
	
}
