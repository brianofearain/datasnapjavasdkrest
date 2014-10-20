package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class PropUser {

	private PropTags propTags;
    private Propid Propid;
    private PropAudience propAudience;
    private PropUserProperties propUserProperties; 
	
	public PropTags getTags() {
		return propTags;
	}

	public void setTags(PropTags propTags) {
		this.propTags = propTags;
	}

	public Propid getId() {
		return Propid;
	}

	public void setId(Propid Propid) {
		this.Propid = Propid;
	}

	public PropAudience getAudience() {
		return propAudience;
	}

	public void setAudience(PropAudience propAudience) {
		this.propAudience = propAudience;
	}

	public PropUserProperties getUserProperties() {
		return propUserProperties;
	}

	public void setUserProperties(PropUserProperties propUserProperties) {
		this.propUserProperties = propUserProperties;
	}
    
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
	
	
