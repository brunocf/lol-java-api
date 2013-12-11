package com.github.brunocf.lolapi.endpoint;

import java.util.Hashtable;

import com.github.brunocf.lolapi.connection.HttpConnection;
import com.github.brunocf.lolapi.connection.HttpGetException;
import com.github.brunocf.lolapi.enums.Region;
import com.github.brunocf.lolapi.structures.champion.ChampionListDto;
import com.google.gson.Gson;

/*
 * Access to "champion-v1.1"
 */
public class Champion {

	private static final String VERSION = "v1.1";
	private static final String ENDPOINT = "http://prod.api.pvp.net/api/lol/{region}/{version}/champion?";
	
	private static final Gson gson = new Gson();
	private String apiKey;
	
	public Champion(String apiKey) {
		this.apiKey = apiKey;
	}
	
	
	public ChampionListDto getChampionList(Region region) throws HttpGetException {
		
		String url = ENDPOINT;
		url = url.replace("{region}", region.toString().toLowerCase());
		url = url.replace("{version}", VERSION);
		
		String resp = HttpConnection.sendGet(url, apiKey, null);
		
		return gson.fromJson(resp, ChampionListDto.class);
	
	}
	
	public ChampionListDto getFeeWeekChampionList(Region region) throws HttpGetException {
		
		String url = ENDPOINT;
		url = url.replace("{region}", region.toString().toLowerCase());
		url = url.replace("{version}", VERSION);
		
		Hashtable<String, String> parameters = new Hashtable<>();
		parameters.put("freeToPlay", "true");
		
		String resp = HttpConnection.sendGet(url, apiKey, parameters);
		
		return gson.fromJson(resp, ChampionListDto.class);
		
	}
	
}
