package com.github.datasnap.propertiesandevents;

import java.util.ArrayList;

import com.github.datasnap.gson.JsonFormatter;

public class Event2 {
	
	
	
	ArrayList<Property> geofences = new ArrayList<Property> ();

	 private String event_type;
	 private String  organization_ids;
	 private String  project_ids;
	
	 
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
