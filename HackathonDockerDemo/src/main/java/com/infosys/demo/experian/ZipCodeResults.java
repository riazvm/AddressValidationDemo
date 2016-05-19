package com.infosys.demo.experian;

public class ZipCodeResults {
private String input_id;
private int input_index;
private CityState[] citystates;
private ZipCode[] zipcodes;
private String status;
private String reason;

public String getInput_id() {
	return input_id;
}

public void setInput_id(String input_id) {
	this.input_id = input_id;
}

public int getInput_index() {
	return input_index;
}

public void setInput_index(int input_index) {
	this.input_index = input_index;
}

public CityState[] getCitystates() {
	return citystates;
}

public void setCitystates(CityState[] citystates) {
	this.citystates = citystates;
}

public ZipCode[] getZipcodes() {
	return zipcodes;
}

public void setZipcodes(ZipCode[] zipcodes) {
	this.zipcodes = zipcodes;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getReason() {
	return reason;
}

public void setReason(String reason) {
	this.reason = reason;
}

@Override
public String toString() {
	return " ZipCodeResults[input_id=" + input_id + ", input_index=" + input_index  + ", citystates=" + citystates.toString() + ", zipcodes=" + zipcodes.toString() 
	+ ", status="+status+ "]";
}


}
