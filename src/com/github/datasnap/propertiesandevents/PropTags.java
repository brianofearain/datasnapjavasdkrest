package com.github.datasnap.propertiesandevents;

import java.util.ArrayList;

import com.github.datasnap.gson.JsonFormatter;

public class PropTags<E> {
	private ArrayList<E> tags;
	
	/**
	 * Returns a JSON string corresponding to object state
	 *
	 * @return JSON representation
	 */
	public String toJSON() {
		return JsonFormatter.toJSON(this);
	}

	@Override
	public String toString() {
		return toJSON();
	}

	public ArrayList<E> getTags() {
		return tags;
	}

	public void setTags(ArrayList<E> tags) {
		this.tags = tags;
	}
	

}
