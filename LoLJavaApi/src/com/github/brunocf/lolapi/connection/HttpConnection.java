package com.github.brunocf.lolapi.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Dictionary;
import java.util.Enumeration;

 
public class HttpConnection {
 
 
	// HTTP GET request
	public static String sendGet(String url, String apiKey, Dictionary<String, String> parameters) throws HttpGetException {
 
		try {
		
			// Setting URL Parameters
			url += "api_key=" + apiKey;
			if(parameters != null){
				Enumeration<String> keyList = parameters.keys();
				while(keyList.hasMoreElements()){
					String key = keyList.nextElement();
					String value = parameters.get(key);
					if(key != null && value != null) {
						url += "&" + key + "=" + value;
					}
				}
				
			}
			
			URL obj;
			obj = new URL(url);
			
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	 
			con.setRequestMethod("GET");
	 
			int responseCode = con.getResponseCode();
			switch (responseCode) {
			case 400:
				throw new HttpGetException("Bad Request", responseCode);
			case 500:
				throw new HttpGetException("Internal server error", responseCode);
			case 404:
				throw new HttpGetException("Summoner not found", responseCode);
			default:
				if(responseCode != 200) {
					throw new HttpGetException("Response Error", responseCode);
				}
			}
	 
			BufferedReader in = new BufferedReader(
			        new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
	 
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
	
			return response.toString();
		
		} catch (MalformedURLException e) {
			throw new HttpGetException("Malformed URL", e, 0);
		} catch (IOException e) {
			throw new HttpGetException("IO Exception", e, 0);
		}
	}
 
 
}
