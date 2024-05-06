package jsonpropertyfinder;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;


public class Main {

	public static void main(String[] args) {
		String jsonObject = "{\r\n" + "    \"permanent\": true,\r\n" + "    \"name\": \"Pankaj Kumar\",\r\n"
				+ "    \"id\": 123,\r\n" + "    \"address\": {\r\n" + "        \"zipcode\": 95014,\r\n"
				+ "        \"city\": \"San Jose\",\r\n" + "        \"Street\": \"El Camino Real\"\r\n" + "    },\r\n"
				+ "    \"phoneNumbers\": [\r\n" + "        9988664422,\r\n" + "        1234567890\r\n" + "    ],\r\n"
				+ "    \"role\": \"Developer\",\r\n" + "    \"previous\": [\r\n" + "        {\r\n"
				+ "            \"name\": \"xyz\",\r\n" + "            \"years\": 2\r\n" + "        },\r\n"
				+ "        {\r\n" + "            \"name\": \"avf\",\r\n" + "            \"years\": 3\r\n"
				+ "        }\r\n" + "    ]\r\n" + "}";

		JSONObject jsonOb = new JSONObject(jsonObject);
		System.out.println(jsonOb);
		parseJson(jsonOb);

	}

	public static void parseJson(JSONObject jsonOb) {
		if (null != jsonOb) {

			Iterator<String> keys = jsonOb.keys();
			while (keys.hasNext()) {
				String key = keys.next();
				if (jsonOb.get(key) instanceof JSONObject) {
					parseJson((JSONObject) jsonOb.get(key));
				}
				if (jsonOb.get(key) instanceof JSONArray) {
					JSONArray jsonArray = (JSONArray) jsonOb.get(key);
					for (int i = 0; i < jsonArray.length(); i++) {
						Object jsonObj = jsonArray.get(i);
						if (jsonObj instanceof JSONObject) {
							parseJson((JSONObject) jsonOb.get(key));
						}

						// System.out.println(key);
						checkFormat(key, jsonOb.get(key), jsonOb);

					}
				} // End Of JsonArray
				checkFormat(key, jsonOb.get(key), jsonOb);

			} // while Loop.
		}
	}

	public static void checkFormat(String key, Object obj, JSONObject jsonObject) {
		
		System.out.println("Starting of ");
		if (obj instanceof String) {
			System.out.println("key is :" + key + " and value is :" + jsonObject.getString(key));
		}
		if (obj instanceof Boolean) {
			System.out.println("key is :" + key + " and value is :" + jsonObject.getBoolean(key));
		}
		if (obj instanceof Integer) {
			System.out.println("key is :" + key + " and value is :" + jsonObject.getInt(key));
		}
		if (obj instanceof Long) {
			System.out.println("key is :" + key + " and value is :" + jsonObject.getLong(key));
		}
		if (obj instanceof BigDecimal) {
			System.out.println("key is :" + key + " and value is :" + jsonObject.getBigDecimal(key));
		}
		if (obj instanceof BigInteger) {
			System.out.println("key is :" + key + " and value is :" + jsonObject.getBigInteger(key));
		}

		if (obj instanceof Double) {
			System.out.println("key is :" + key + " and value is :" + jsonObject.getDouble(key));
		}

	}
}
