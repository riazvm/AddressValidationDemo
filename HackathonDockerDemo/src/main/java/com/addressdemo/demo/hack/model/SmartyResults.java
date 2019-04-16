package com.addressdemo.demo.hack.model;

public class SmartyResults {
private String input_id;
private int input_index;
private int candidate_index	;
private String addressee;
private String delivery_line_1;
private String delivery_line_2;
private String last_line;
private String delivery_point_barcode;
private Component components;
private Metadata metadata;
private Analysis analysis;

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

public int getCandidate_index() {
	return candidate_index;
}

public void setCandidate_index(int candidate_index) {
	this.candidate_index = candidate_index;
}

public String getAddressee() {
	return addressee;
}

public void setAddressee(String addressee) {
	this.addressee = addressee;
}

public String getDelivery_line_1() {
	return delivery_line_1;
}

public void setDelivery_line_1(String delivery_line_1) {
	this.delivery_line_1 = delivery_line_1;
}

public String getDelivery_line_2() {
	return delivery_line_2;
}

public void setDelivery_line_2(String delivery_line_2) {
	this.delivery_line_2 = delivery_line_2;
}

public String getLast_line() {
	return last_line;
}

public void setLast_line(String last_line) {
	this.last_line = last_line;
}

public String getDelivery_point_barcode() {
	return delivery_point_barcode;
}

public void setDelivery_point_barcode(String delivery_point_barcode) {
	this.delivery_point_barcode = delivery_point_barcode;
}

public Component getComponents() {
	return components;
}

public void setComponents(Component components) {
	this.components = components;
}

public Metadata getMetadata() {
	return metadata;
}

public void setMetadata(Metadata metadata) {
	this.metadata = metadata;
}

public Analysis getAnalysis() {
	return analysis;
}

public void setAnalysis(Analysis analysis) {
	this.analysis = analysis;
}

@Override
public String toString() {
	return " [input_id=" + input_id + ", input_index=" + input_index + ", candidate_index="
			+ candidate_index + ", addressee=" + addressee + ", delivery_line_1=" + delivery_line_1
			+ ", delivery_line_2=" + delivery_line_2 + ", last_line=" + last_line + ", delivery_point_barcode="
			+ delivery_point_barcode + ", components=" + components.toString() + ", metadata=" + metadata.toString() + ", analysis="
			+ analysis.toString() + "]";
}


}
