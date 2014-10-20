package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class PropGlobalPosition {

	
  
  private String location;
  /**    "coordinates": [
            -88.21337,
            40.11041
        ]
    }, */
    private String altitude;
    private String accuracy;
    private String course;
    private String speed;
    
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
	

