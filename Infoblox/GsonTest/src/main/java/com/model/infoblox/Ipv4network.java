package com.model.infoblox;


import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

public class Ipv4network {

	
	@SerializedName("_ref")
	String ref;
	
	@SerializedName("extattrs")
	JsonElement extattrs;
	
	@SerializedName("network")
	String network;
	
	@SerializedName("network_view")
	String network_view;

	@Override
	public String toString() {
		return "Ipv4network [" + "network=" + network+ ",\n extattrs=" + extattrs  + "]";
	}

	public String getRef() {
		return ref;
	}

	public JsonElement getExtattrs() {
		return extattrs;
	}

	public String getNetwork() {
		return network;
	}

	public String getNetwork_view() {
		return network_view;
	}
	
	
	
}
