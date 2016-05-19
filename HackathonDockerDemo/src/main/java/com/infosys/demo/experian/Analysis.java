package com.infosys.demo.experian;

public class Analysis {

	private String dpv_match_code	;
	private String dpv_footnotes;
	private String dpv_cmra;
	private String dpv_vacant;
	private String active;
	private String ews_match;
	private String footnotes;
	private String lacslink_code;
	private String lacslink_indicator;
	private String suitelink_match;
	public String getDpv_match_code() {
		return dpv_match_code;
	}
	public void setDpv_match_code(String dpv_match_code) {
		this.dpv_match_code = dpv_match_code;
	}
	public String getDpv_footnotes() {
		return dpv_footnotes;
	}
	public void setDpv_footnotes(String dpv_footnotes) {
		this.dpv_footnotes = dpv_footnotes;
	}
	public String getDpv_cmra() {
		return dpv_cmra;
	}
	public void setDpv_cmra(String dpv_cmra) {
		this.dpv_cmra = dpv_cmra;
	}
	public String getDpv_vacant() {
		return dpv_vacant;
	}
	public void setDpv_vacant(String dpv_vacant) {
		this.dpv_vacant = dpv_vacant;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getEws_match() {
		return ews_match;
	}
	public void setEws_match(String ews_match) {
		this.ews_match = ews_match;
	}
	public String getFootnotes() {
		return footnotes;
	}
	public void setFootnotes(String footnotes) {
		this.footnotes = footnotes;
	}
	public String getLacslink_code() {
		return lacslink_code;
	}
	public void setLacslink_code(String lacslink_code) {
		this.lacslink_code = lacslink_code;
	}
	public String getLacslink_indicator() {
		return lacslink_indicator;
	}
	public void setLacslink_indicator(String lacslink_indicator) {
		this.lacslink_indicator = lacslink_indicator;
	}
	public String getSuitelink_match() {
		return suitelink_match;
	}
	public void setSuitelink_match(String suitelink_match) {
		this.suitelink_match = suitelink_match;
	}
	@Override
	public String toString() {
		return "Analysis [dpv_match_code=" + dpv_match_code + ", dpv_footnotes=" + dpv_footnotes + ", dpv_cmra="
				+ dpv_cmra + ", dpv_vacant=" + dpv_vacant + ", active=" + active + ", ews_match=" + ews_match
				+ ", footnotes=" + footnotes + ", lacslink_code=" + lacslink_code + ", lacslink_indicator="
				+ lacslink_indicator + ", suitelink_match=" + suitelink_match + "]";
	}
	
}
