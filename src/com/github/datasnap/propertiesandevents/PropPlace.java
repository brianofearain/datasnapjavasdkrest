package com.github.datasnap.propertiesandevents;

import java.util.ArrayList;

import com.github.datasnap.gson.JsonFormatter;

public class PropPlace {
	private String placeId;
	private String name;
    private PropTags propTags;
	private PropAddress propAddress;
    private String last_place;
	private ArrayList<String> geofences;
	private ArrayList<String> beacons;
	
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

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PropTags getTags() {
		return propTags;
	}

	public void setTags(PropTags propTags) {
		this.propTags = propTags;
	}

	public PropAddress getAddress() {
		return propAddress;
	}

	public void setAddress(PropAddress propAddress) {
		this.propAddress = propAddress;
	}

	public String getLast_place() {
		return last_place;
	}

	public void setLast_place(String last_place) {
		this.last_place = last_place;
	}

	public ArrayList<String> getGeofences() {
		return geofences;
	}

	public void setGeofences(ArrayList<String> geofences) {
		this.geofences = geofences;
	}

	public ArrayList<String> getBeacons() {
		return beacons;
	}

	public void setBeacons(ArrayList<String> beacons) {
		this.beacons = beacons;
	}

}
