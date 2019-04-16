package com.addressdemo.demo.hack.model;

public class Metadata {

	private String record_type	;
	private String zip_type;
	private String county_fips;
	private String county_name;
	private String carrier_route;
	private String congressional_district	;
	private String building_default_indicator;
	private String rdi;
	private String elot_sequence;
	private String elot_sort;
	private float latitude;
	private float longitude;
	private String precision;
	private String time_zone;
	private float utc_offset;
	private String dst;
	public String getRecord_type() {
		return record_type;
	}
	public void setRecord_type(String record_type) {
		this.record_type = record_type;
	}
	public String getZip_type() {
		return zip_type;
	}
	public void setZip_type(String zip_type) {
		this.zip_type = zip_type;
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
	public String getCarrier_route() {
		return carrier_route;
	}
	public void setCarrier_route(String carrier_route) {
		this.carrier_route = carrier_route;
	}
	public String getCongressional_district() {
		return congressional_district;
	}
	public void setCongressional_district(String congressional_district) {
		this.congressional_district = congressional_district;
	}
	public String getBuilding_default_indicator() {
		return building_default_indicator;
	}
	public void setBuilding_default_indicator(String building_default_indicator) {
		this.building_default_indicator = building_default_indicator;
	}
	public String getRdi() {
		return rdi;
	}
	public void setRdi(String rdi) {
		this.rdi = rdi;
	}
	public String getElot_sequence() {
		return elot_sequence;
	}
	public void setElot_sequence(String elot_sequence) {
		this.elot_sequence = elot_sequence;
	}
	public String getElot_sort() {
		return elot_sort;
	}
	public void setElot_sort(String elot_sort) {
		this.elot_sort = elot_sort;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public String getPrecision() {
		return precision;
	}
	public void setPrecision(String precision) {
		this.precision = precision;
	}
	public String getTime_zone() {
		return time_zone;
	}
	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}
	public float getUtc_offset() {
		return utc_offset;
	}
	public void setUtc_offset(float utc_offset) {
		this.utc_offset = utc_offset;
	}
	public String getDst() {
		return dst;
	}
	public void setDst(String dst) {
		this.dst = dst;
	}
	@Override
	public String toString() {
		return "Metadata [record_type=" + record_type + ", zip_type=" + zip_type + ", county_fips=" + county_fips
				+ ", county_name=" + county_name + ", carrier_route=" + carrier_route + ", congressional_district="
				+ congressional_district + ", building_default_indicator=" + building_default_indicator + ", rdi=" + rdi
				+ ", elot_sequence=" + elot_sequence + ", elot_sort=" + elot_sort + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", precision=" + precision + ", time_zone=" + time_zone + ", utc_offset="
				+ utc_offset + ", dst=" + dst + "]";
	}
	

}