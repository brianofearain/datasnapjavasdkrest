package com.github.datasnap.propertiesandevents;

public enum GeoFenceEventType {
	
	GEOFENCE_ARRIVE, // - A user has entered a geofence.

	GEOFENCE_SIGHTING, // - A user is still in the geofence after a interval based check of their location.

	GEOFENCE_DEPART // - A user has left the geofence.
	

}
