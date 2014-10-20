package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class PropGeofence {
	
   private String id;
   private String name;
   private String visibility;

   private PropTags propTags;
   private PropGeofenceCircle geofence_circle; 
    

   
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
