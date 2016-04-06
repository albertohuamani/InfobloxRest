package com.model.infoblox;


import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

public class Ipv4address {

	
	@SerializedName("_ref")
	String ref;
	
	@SerializedName("discovered_data")
	DiscoveredData discovered_data;
	
	@SerializedName("network")
	String network;
	
	@SerializedName("network_view")
	String network_view;
	
	@SerializedName("extattrs")
	JsonElement extattrs;

}
