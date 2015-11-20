package com.sudhir.android.fitnessguru.model;

import com.google.android.gms.maps.model.LatLng;

public class MarkerInformation {

	LatLng location;
	String inftitle,infSubtitle;
	
	public MarkerInformation() {
		location = null;
		infSubtitle="";
		inftitle = "";
	}
	
	public MarkerInformation(LatLng loc,String title,String subtitle) {
		this.location = loc;
		this.infSubtitle = subtitle;
		this.inftitle = title;;
	}
	
	public LatLng getLocation() {
		return location;
	}
	public void setLocation(LatLng location) {
		this.location = location;
	}
	public String getInftitle() {
		return inftitle;
	}
	public void setInftitle(String inftitle) {
		this.inftitle = inftitle;
	}
	public String getInfSubtitle() {
		return infSubtitle;
	}
	public void setInfSubtitle(String infSubtitle) {
		this.infSubtitle = infSubtitle;
	}
}
