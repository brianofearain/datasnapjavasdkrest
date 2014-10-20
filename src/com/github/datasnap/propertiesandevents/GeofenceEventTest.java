package com.github.datasnap.propertiesandevents;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import com.google.gson.Gson;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;

public class GeofenceEventTest {
	
	// todo - array data types & change data types..
	
	
	public static void main(String[]args) throws ClientProtocolException, IOException{
		
		EventGeoFence event = new EventGeoFence();
		event.setEvent_type("eventtype1");
		event.setOrganization_ids("organisationidnumber");
		event.setProject_ids("Project_id_number");
		
		PropGeofence geo = new PropGeofence();
		
		ArrayList<String> geofences = new ArrayList<String> ();
		geofences.add("sdaf");
		geofences.add("sdaf");

		PropAddress propAddress = new PropAddress();
		// add.set 
		
		ArrayList<String> beacons = new ArrayList<String> ();
		beacons.add("sdaf");
		beacons.add("sdaf");
		
		
		ArrayList<String> tags = new ArrayList<String> ();
		tags.add("sdaf");
		tags.add("sdaf");
		
		PropTags tag = new PropTags();
		tag.setTags(tags);
		PropPlace propPlace = new PropPlace();
		propPlace.setGeofences(geofences);
		propPlace.setAddress(propAddress);
		propPlace.setBeacons(beacons);
		propPlace.setLast_place("over there");
		propPlace.setName("some place");
		propPlace.setPlaceId("the places Id");
		propPlace.setTags(tag);
		PropUser propUser = new PropUser();
		
		
		
		PropAudience propAudience = new PropAudience();
		propAudience.setAge("12");
		propAudience.setCollege("college");
		propAudience.setEducation("edukation");
		propAudience.setEthnicity("african");
		propAudience.setGender("female");
		propAudience.setIncome("24");
		propAudience.setInterests("stuff");
		propAudience.setKids("kidzz");
		propUser.setAudience(propAudience);
		//user.setId("qweq")
		event.setUser(propUser);

		event.setPlace(propPlace);
		event.setProject_ids("proj_ids");
		
		System.out.println(event.toJSON());
		

		 CloseableHttpClient httpclient = HttpClients.createDefault();
	        		
			String postUrl="https://private-anon-ce4604103-datasnapio.apiary-mock.com/v1.0/events/?api_key=$E9NZuB6A91e2J03PKA2g7wx0629czel8&data=$%2520WERF%2520&redirect=$http%3A%2F%2Fwww.apple.com";// put in your url
			Gson gson= new Gson();
			HttpPost post = new HttpPost(postUrl);
			StringEntity  postingString = new StringEntity(event.toJSON());//convert your pojo to   json
			post.setEntity(postingString);
			post.setHeader("PropContent-PropType", "application/json");
			 post.addHeader("Authorization", "Basic E9NZuB6A91e2J03PKA2g7wx0629czel8");
			// postingString.setContentEncoding(contentEncoding);
		//	post.setHeader("PropContent-type", "text/plain");
			// httpclient.
			HttpResponse  response = httpclient.execute(post);
			System.out.println(response.toString());

	
		
		
	}
/**	public static EventGeoFence GeofenceEventTest() {
		GeofenceEvent geofenceEvent = new GeofenceEvent();
		geofenceEvent.setBillingAddress(BILLINGADDRESS).setExpireMonth(EXPMONTH)
				.setExpireYear(EXPYEAR).setFirstName(FIRSTNAME)
				.setLastName(LASTNAME).setNumber(NUMBER).setType(TYPE)
				.setCvv2(CVV2).setBillingAddress(BILLINGADDRESS).setId(ID)
				.setPayerId(PAYERID).setState(STATE).setValidUntil(VALIDUNTIL);
		return creditCard;
	}*/
	
	

}
