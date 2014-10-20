package com.github.datasnap.propertiesandevents;

import com.github.datasnap.gson.JsonFormatter;

/**
 * @author brianferan
 *
 */
public class PropAudience extends Property{

	
	private String 	Education;
private String College;
private String  Age;
private String  Ethnicity;
private String Kids;
private String Gender;
private String Interests;
private String  Income;
	
	
	
	public String getEducation() {
		return Education;
	}

	public void setEducation(String education) {
		Education = education;
	}

	public String getCollege() {
		return College;
	}

	public void setCollege(String college) {
		College = college;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String age) {
		Age = age;
	}

	public String getEthnicity() {
		return Ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		Ethnicity = ethnicity;
	}

	public String getKids() {
		return Kids;
	}

	public void setKids(String kids) {
		Kids = kids;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getInterests() {
		return Interests;
	}

	public void setInterests(String interests) {
		Interests = interests;
	}

	public String getIncome() {
		return Income;
	}

	public void setIncome(String income) {
		Income = income;
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
