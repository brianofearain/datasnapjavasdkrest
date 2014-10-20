package com.github.datasnap.propertiesandevents;

import java.util.ArrayList;

import com.github.datasnap.gson.JsonFormatter;

public class PropGeofencePolygon {
	private ArrayList<PropLocation> propLocations;
	
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

}
