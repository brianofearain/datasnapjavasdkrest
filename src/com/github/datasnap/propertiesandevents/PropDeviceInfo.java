package com.github.datasnap.propertiesandevents;

public class PropDeviceInfo extends Property{
	
	public String created;
    public PropDevice propDevice;
	
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public PropDevice getPropDevice() {
		return propDevice;
	}
	public void setPropDevice(PropDevice propDevice) {
		this.propDevice = propDevice;
	}

}
