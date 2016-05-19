package com.infosys.demo.experian;

public class ZipCode {

	private String zipcode	;
	private String zipcode_type;
	private String county_fips;
	private String county_name;
	private String state_abbreviation;
	private String state;
	private String latitude;
	private String longitude;
	private String precision;
	private AlternateCounties[] alternate_counties;
	

	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getZipcode_type() {
		return zipcode_type;
	}


	public void setZipcode_type(String zipcode_type) {
		this.zipcode_type = zipcode_type;
	}


	public String getCounty_fips() {
		return county_fips;
	}


	public void setCounty_fips(String county_fips) {
		this.county_fips = county_fips;
	}


	public String getCounty_name() {
		return county_name;
	}


	public void setCounty_name(String county_name) {
		this.county_name = county_name;
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


	public String getPrecision() {
		return precision;
	}


	public void setPrecision(String precision) {
		this.precision = precision;
	}


	public AlternateCounties[] getAlternate_counties() {
		return alternate_counties;
	}


	public void setAlternate_counties(AlternateCounties[] alternate_counties) {
		this.alternate_counties = alternate_counties;
	}


	@Override
	public String toString() {
		return "ZipCode [zipcode=" + zipcode + ", zipcode_type=" + zipcode_type + ", state=" + state
				+ "]";
	}
	

}