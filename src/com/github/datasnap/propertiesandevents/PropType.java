package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class PropType {
  private String id;
  private String name;
  
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

	public PropType(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
