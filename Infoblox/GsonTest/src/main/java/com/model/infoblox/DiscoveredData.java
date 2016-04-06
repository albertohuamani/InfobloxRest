package com.model.infoblox;

import com.google.gson.annotations.SerializedName;

public class DiscoveredData {
	
	@SerializedName("device_type")
	String device_type;	
	
	@SerializedName("mac_address")
	String mac_address;
	
	@SerializedName("open_ports")
	String open_ports;

	
}
