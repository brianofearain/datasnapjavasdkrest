package com.github.datasnap.propertiesandevents;

import java.util.UUID;

import org.joda.time.DateTime;

import com.github.datasnap.gson.JsonFormatter;
import com.github.datasnap.utils.Defaults;


/**
 * The base model for a Segment.io API payload
 */

	
public class Event extends BEventSuperTest {
		
		public Event(String eventType, PropPlace propPlace,
				PropUser propUser, BeaconProp beacon, PropDeviceInfo propDeviceInfo) {
			super(eventType);
			this.eventType = eventType;
			this.propPlace = propPlace;
			this.propUser = propUser;
			this.beacon = beacon;
			this.propDeviceInfo = propDeviceInfo;
			
			
			// segment stuff
		
		//		will need some nullchecks here
			//  this.segmentType = type;
		//		if (segmentOptions == null) segmentOptions = new SegmentOptions();
	
			}
			
	
		private String eventType;
		 private String  organization_ids;
		 private String  project_ids;
			private PropPlace propPlace;
			private PropUser propUser;
		private BeaconProp beacon;
		// for now
	    private PropDeviceInfo propDeviceInfo;

		
		public String getEvent_type() {
			return eventType;
		}

		public void setEvent_type(String event_type) {
			this.eventType = event_type;
		}

		public String getOrganization_ids() {
			return organization_ids;
		}

		public void setOrganization_ids() {
			this.organization_ids = super.getOrganisationid();
		}

		public String getProject_ids() {
			return project_ids;
		}

		public void setProject_ids() {
			this.project_ids = super.getProjectid();
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

			public BeaconProp getBeacon() {
				return beacon;
			}

			public void setBeacon(BeaconProp beacon) {
				this.beacon = beacon;
			}

			public PropPlace getPlace() {
				return propPlace;
			}

			public void setPlace(PropPlace propPlace) {
				this.propPlace = propPlace;
			}

			public PropUser getUser() {
				return propUser;
			}

			public void setUser(PropUser propUser) {
				this.propUser = propUser;
			}
		
}
