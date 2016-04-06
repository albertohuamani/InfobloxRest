package com.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.model.infoblox.*;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TestGson {

	public static void main(String[] args) {
		
		
	String url="http://localhost/networks.json";	
	ArrayList <Ipv4network> lista = null;
	
	JsonParser parser =new JsonParser();

	try {
		String json = get(url);
		JsonElement element=parser.parse(json);
		Gson gson = new Gson();
		
		JsonArray ja= element.getAsJsonArray();
		
		if (ja != null) { 
			   for (int i=0;i<ja.size();i++){ 
				   JsonElement str = ja.get(i);
				   Ipv4network valor = gson.fromJson(str,Ipv4network.class);
				   String network =valor.getNetwork();
				   
				   String cd="";
				   try {
					cd=valor.getExtattrs().getAsJsonObject().get("CD").getAsJsonObject().get("value").getAsString();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
				   
				   System.out.println(network+ "\t"+cd);
			   // lista.add(valor);
			   } 
			} 

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	
	}
	
//metodos
	
	static String get(String url) throws IOException {
		
		OkHttpClient client = new OkHttpClient(); 
		
		Request request = new Request.Builder()
		      .url(url)
		      .build();

		Response response = client.newCall(request).execute();
		  return response.body().string();
		}	

}
