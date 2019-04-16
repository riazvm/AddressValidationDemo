package com.addressdemo.demo.hack.model;

public class CityState {

	private String city	;
	private String state_abbreviation;
	private String state;
	private String mailable_city;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState_abbreviation() {
		return state_abbreviation;
	}

	public void setState_abbreviation(String state_abbreviation) {
		this.state_abbreviation = state_abbreviation;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getMailable_city() {
		return mailable_city;
	}

	public void setMailable_city(String mailable_city) {
		this.mailable_city = mailable_city;
	}

	@Override
	public String toString() {
		return "CityState [city=" + city + ", state_abbreviation=" + state_abbreviation + ", state=" + state
				+ ", mailable_city=" + mailable_city + "]";
	}
	

}