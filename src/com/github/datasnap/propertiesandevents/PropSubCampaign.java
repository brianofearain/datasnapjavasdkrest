package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class PropSubCampaign {
private String id;

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
