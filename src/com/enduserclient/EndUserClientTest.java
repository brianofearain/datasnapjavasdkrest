package com.enduserclient;
import com.github.datasnap.controller.*;
import com.github.datasnap.propertiesandevents.*;

import datasnap.pojos.Beacon;

public class EndUserClientTest {

	public static void main(String[] args) {
		DataSnap dataSnap = new DataSnap();
		dataSnap.initialize();
		
		String eventType = "beacon_depart";
		PropPlace propPlace= new PropPlace();
		propPlace.setPlaceId("placeId");
		propPlace.setLast_place("placeid-3");
		PropUser propUser= new PropUser();
		Propid propId = new Propid();
		propId.setMobile_device_ios_idfa("1a847de9f24b18eee3fac634b833b7887b32dea3");
		propId.setGlobal_distinct_id("userid1234");
		BeaconProp beaconProp = new BeaconProp();
		String beaconid = "SHDG-28AHD";
		beaconProp.setIdentifier(beaconid);
		PropDeviceInfo propDeviceInfo = new PropDeviceInfo();
        propDeviceInfo.setCreated("2014-08-22 14:48:02 +0000");        
		PropDevice propDevice = new PropDevice();
		propDevice.setUserAgent("Mozilla/5.0 (Linux; U; Android 4.0.3; ko-kr; LG-L160L Build/IML74K) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30");
		propDevice.setIp_address("127.1.1.1");  
		propDevice.setPlatform("ios");  
		propDevice.setOs_version("7.0");   
		propDevice.setModel("iPhone5");  
		propDevice.setManufacturer("Apple");  
		propDevice.setName("hashed device name");  
		propDevice.setVendor_id("63A7355F-5AF2-4E20-BE55-C3E80D0305B1");  
		propDevice.setCarrier_name("Verizon");   
		propDevice.setCountry_code("1");   
		propDevice.setNetwork_code("327");   
								
		Event event = new Event(eventType,propPlace,propUser,beaconProp,propDeviceInfo);	
		dataSnap.addEvent(event);
	}

}
