package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class BeaconProp extends Property{

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getBle_uuid() {
		return ble_uuid;
	}

	public void setBle_uuid(String ble_uuid) {
		this.ble_uuid = ble_uuid;
	}

	public String getBle_vendor_uuid() {
		return ble_vendor_uuid;
	}

	public void setBle_vendor_uuid(String ble_vendor_uuid) {
		this.ble_vendor_uuid = ble_vendor_uuid;
	}

	public String getBle_vendor_id() {
		return ble_vendor_id;
	}

	public void setBle_vendor_id(String ble_vendor_id) {
		this.ble_vendor_id = ble_vendor_id;
	}

	public String getRssi() {
		return rssi;
	}

	public void setRssi(String rssi) {
		this.rssi = rssi;
	}

	public String getIs_mobile() {
		return is_mobile;
	}

	public void setIs_mobile(String is_mobile) {
		this.is_mobile = is_mobile;
	}

	public String getPrevious_rssi() {
		return previous_rssi;
	}

	public void setPrevious_rssi(String previous_rssi) {
		this.previous_rssi = previous_rssi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDwell_time() {
		return dwell_time;
	}

	public void setDwell_time(String dwell_time) {
		this.dwell_time = dwell_time;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getLast_update_time() {
		return last_update_time;
	}

	public void setLast_update_time(String last_update_time) {
		this.last_update_time = last_update_time;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getVisibility() {
		return visibility;
	}

	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}

	public String getBattery_level() {
		return battery_level;
	}

	public void setBattery_level(String battery_level) {
		this.battery_level = battery_level;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHardware() {
		return hardware;
	}

	public void setHardware(String hardware) {
		this.hardware = hardware;
	}

	public PropCategories getPropCategories() {
		return propCategories;
	}

	public void setPropCategories(PropCategories propCategories) {
		this.propCategories = propCategories;
	}

	public PropTags getPropTags() {
		return propTags;
	}

	public void setPropTags(PropTags propTags) {
		this.propTags = propTags;
	}

	private String identifier;
	private String ble_uuid;
    private String ble_vendor_uuid;
    private String ble_vendor_id;
    private String rssi;
    private String is_mobile;
    private String previous_rssi;
    private String name;
    private String dwell_time;
    private String start_time;
    private String last_update_time;
    private String latitude;
    private String longitude;
    private String visibility;
    private String battery_level;
    private String temperature;
private String hardware;
private PropCategories propCategories;
private PropTags propTags;


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
	
	

