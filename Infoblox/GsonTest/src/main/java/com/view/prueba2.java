package com.view;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String json ="{\"CAR\": {\"value\": \"256\"},\"CD\": {\"value\": \"70832\"},\"NODO\": {\"value\": \"CHIPE2\"},\"PERSONA DE CONTACTO\": {\"value\": \"JAIME DELGADO\"},\"RAZON SOCIAL\": {\"value\": \"ASPERSUD\"},\"TELEFONO\": {\"value\": \"4310091\"},\"TIPO DE SERVICIO\": {\"value\": \"UNIRED\"},\"UBICACION GEOGRAFICA\": {\"value\": \"CHICLAYO\"}}";
		
		JsonParser parser =new JsonParser();
		
		JsonElement element=parser.parse(json);
		
		//System.out.println(element.toString());
	
		if (element.isJsonObject())
		{
			System.out.println("verdad");
			JsonObject ea = element.getAsJsonObject();
			
			//System.out.println(ea.get("CAR").getAsString());
		}
			
		

	}

}
