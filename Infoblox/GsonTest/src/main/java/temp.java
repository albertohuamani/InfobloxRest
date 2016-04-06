import java.util.HashMap;
import java.util.Map;

import com.google.gson.*;

public class temp {
	public static void main(String[] args) {
		

		String demo ="{\"CAR\": {\"value\": \"256\"},\"CD\": {\"value\": \"70832\"},\"NODO\": {\"value\": \"CHIPE2\"},\"PERSONA DE CONTACTO\": {\"value\": \"JAIME DELGADO\"},\"RAZON SOCIAL\": {\"value\": \"ASPERSUD\"},\"TELEFONO\": {\"value\": \"4310091\"},\"TIPO DE SERVICIO\": {\"value\": \"UNIRED\"},\"UBICACION GEOGRAFICA\": {\"value\": \"CHICLAYO\"}}";
        
		String demo2= "{\"CAR\": {\"value\": \"1M\"},\"CD\": {\"value\": \"90676\"},\"NODO\": {\"value\": \"TRUPENG1\"},\"RAZON SOCIAL\": {\"value\": \"COOP AH Y CRED NS ROSARIO\"},\"TIPO DE SERVICIO\": {\"value\": \"UNIRED\"}}";
		
		
		
		
      System.out.println(demo2+"\n");


       Extattr extattr =new Extattr();
       extattr.recursivo(demo2);
       
        

	}


}

class Extattr{

	Map<String, String> map = new HashMap<String, String>();
	
	Extattr(){

	}

	
	
	void recursivo (String s){
		
		
		if (s == null) 
			return;

		if (s.charAt(0)=='{'&& s.charAt(s.length()-1)=='}')
		     s= s.substring(1, s.length()-1);
			
		
			String key="";
			String temp_string="";
			String value="";
			
			try {
				key = s.substring(1, s.indexOf("\": {"));

			
			
			temp_string= s.substring(key.length()+15);
			value=temp_string.substring(0,temp_string.indexOf("\""));
			System.out.print(key);
			System.out.println("\t"+value);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				return;
			}
			
			map.put(key,value);
			
			
			
			try {
					String nuevo = temp_string.substring(value.length()+3);
					recursivo(nuevo);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}

			
			
				
				
		
			

			
			//System.out.println(nuevo);
			
		}
	
	}

	
