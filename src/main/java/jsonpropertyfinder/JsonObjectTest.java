package jsonpropertyfinder;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonObjectTest {

	public static void main(String[] args) {
		String a = "{\r\n"
				+ "    \"permanent\": true,\r\n"
				+ "    \"name\": \"Pankaj Kumar\",\r\n"
				+ "    \"id\": 123,\r\n"
				+ "    \"address\": {\r\n"
				+ "        \"zipcode\": 95014,\r\n"
				+ "        \"city\": \"San Jose\",\r\n"
				+ "        \"Street\": \"El Camino Real\"\r\n"
				+ "    },\r\n"
				+ "    \"phoneNumbers\": [\r\n"
				+ "        9988664422,\r\n"
				+ "        1234567890\r\n"
				+ "    ],\r\n"
				+ "    \"role\": \"Developer\",\r\n"
				+ "    \"previous\": [\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"xyz\",\r\n"
				+ "            \"years\": 2\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"avf\",\r\n"
				+ "            \"years\": 3\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		
	    Object obj=JSONValue.parse(a);  
		
	    JSONObject jsonObject = (JSONObject) obj;  
		String a1 = (String) jsonObject.get("address");
	    System.out.println(a1);	

	}

}
