package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

public class Propid {

	private String mobile_device_bluetooth_identifier;
	private String mobile_device_ios_idfa;
    private String mobile_device_ios_openidfa;
    private String mobile_device_ios_idfv;
    private String mobile_device_ios_udid;
    private String datasnap_uuid;
    private String web_domain_userid;
    private String web_cookie;
    private String domain_sessionid;
    private String web_network_userid;
    private String web_user_fingerprint;
    private String web_analytics_company_z_cookie;
    private String global_distinct_id;
    private String global_user_ipaddress;
    private String mobile_device_fingerprint;
    private String facebook_uid;
    private String mobile_device_google_advertising_id;
    private String mobile_device_google_google_advertising_id_opt_in;
    private String unknown;
    
    
    public String getMobile_device_bluetooth_identifier() {
		return mobile_device_bluetooth_identifier;
	}

	public void setMobile_device_bluetooth_identifier(
			String mobile_device_bluetooth_identifier) {
		this.mobile_device_bluetooth_identifier = mobile_device_bluetooth_identifier;
	}

	public String getMobile_device_ios_idfa() {
		return mobile_device_ios_idfa;
	}

	public void setMobile_device_ios_idfa(String mobile_device_ios_idfa) {
		this.mobile_device_ios_idfa = mobile_device_ios_idfa;
	}

	public String getMobile_device_ios_openidfa() {
		return mobile_device_ios_openidfa;
	}

	public void setMobile_device_ios_openidfa(String mobile_device_ios_openidfa) {
		this.mobile_device_ios_openidfa = mobile_device_ios_openidfa;
	}

	public String getMobile_device_ios_idfv() {
		return mobile_device_ios_idfv;
	}

	public void setMobile_device_ios_idfv(String mobile_device_ios_idfv) {
		this.mobile_device_ios_idfv = mobile_device_ios_idfv;
	}

	public String getMobile_device_ios_udid() {
		return mobile_device_ios_udid;
	}

	public void setMobile_device_ios_udid(String mobile_device_ios_udid) {
		this.mobile_device_ios_udid = mobile_device_ios_udid;
	}

	public String getDatasnap_uuid() {
		return datasnap_uuid;
	}

	public void setDatasnap_uuid(String datasnap_uuid) {
		this.datasnap_uuid = datasnap_uuid;
	}

	public String getWeb_domain_userid() {
		return web_domain_userid;
	}

	public void setWeb_domain_userid(String web_domain_userid) {
		this.web_domain_userid = web_domain_userid;
	}

	public String getWeb_cookie() {
		return web_cookie;
	}

	public void setWeb_cookie(String web_cookie) {
		this.web_cookie = web_cookie;
	}

	public String getDomain_sessionid() {
		return domain_sessionid;
	}

	public void setDomain_sessionid(String domain_sessionid) {
		this.domain_sessionid = domain_sessionid;
	}

	public String getWeb_network_userid() {
		return web_network_userid;
	}

	public void setWeb_network_userid(String web_network_userid) {
		this.web_network_userid = web_network_userid;
	}

	public String getWeb_user_fingerprint() {
		return web_user_fingerprint;
	}

	public void setWeb_user_fingerprint(String web_user_fingerprint) {
		this.web_user_fingerprint = web_user_fingerprint;
	}

	public String getWeb_analytics_company_z_cookie() {
		return web_analytics_company_z_cookie;
	}

	public void setWeb_analytics_company_z_cookie(
			String web_analytics_company_z_cookie) {
		this.web_analytics_company_z_cookie = web_analytics_company_z_cookie;
	}

	public String getGlobal_distinct_id() {
		return global_distinct_id;
	}

	public void setGlobal_distinct_id(String global_distinct_id) {
		this.global_distinct_id = global_distinct_id;
	}

	public String getGlobal_user_ipaddress() {
		return global_user_ipaddress;
	}

	public void setGlobal_user_ipaddress(String global_user_ipaddress) {
		this.global_user_ipaddress = global_user_ipaddress;
	}

	public String getMobile_device_fingerprint() {
		return mobile_device_fingerprint;
	}

	public void setMobile_device_fingerprint(String mobile_device_fingerprint) {
		this.mobile_device_fingerprint = mobile_device_fingerprint;
	}

	public String getFacebook_uid() {
		return facebook_uid;
	}

	public void setFacebook_uid(String facebook_uid) {
		this.facebook_uid = facebook_uid;
	}

	public String getMobile_device_google_advertising_id() {
		return mobile_device_google_advertising_id;
	}

	public void setMobile_device_google_advertising_id(
			String mobile_device_google_advertising_id) {
		this.mobile_device_google_advertising_id = mobile_device_google_advertising_id;
	}

	public String getMobile_device_google_google_advertising_id_opt_in() {
		return mobile_device_google_google_advertising_id_opt_in;
	}

	public void setMobile_device_google_google_advertising_id_opt_in(
			String mobile_device_google_google_advertising_id_opt_in) {
		this.mobile_device_google_google_advertising_id_opt_in = mobile_device_google_google_advertising_id_opt_in;
	}

	public String getUnknown() {
		return unknown;
	}

	public void setUnknown(String unknown) {
		this.unknown = unknown;
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
