package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;


public class CommunicationEvent {
	
	private String event_type;
	 private String  organization_ids;
	 private String  project_ids;
	private PropUser propUser;
	private PropCommunication propCommunication;
	private PropCampaign propCampaign;
	
	public String getEvent_type() {
		return event_type;
	}

	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}

	public String getOrganization_ids() {
		return organization_ids;
	}

	public void setOrganization_ids(String organization_ids) {
		this.organization_ids = organization_ids;
	}

	public String getProject_ids() {
		return project_ids;
	}

	public void setProject_ids(String project_ids) {
		this.project_ids = project_ids;
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

		public PropUser getUser() {
			return propUser;
		}

		public void setUser(PropUser propUser) {
			this.propUser = propUser;
		}

		public PropCommunication getCommunication() {
			return propCommunication;
		}

		public void setCommunication(PropCommunication propCommunication) {
			this.propCommunication = propCommunication;
		}

		public PropCampaign getCampaign() {
			return propCampaign;
		}

		public void setCampaign(PropCampaign propCampaign) {
			this.propCampaign = propCampaign;
		}
	
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		

}
