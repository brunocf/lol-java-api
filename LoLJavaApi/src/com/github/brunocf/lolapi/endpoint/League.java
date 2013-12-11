package com.github.brunocf.lolapi.endpoint;

import java.lang.reflect.Type;
import java.util.Map;

import com.github.brunocf.lolapi.connection.HttpConnection;
import com.github.brunocf.lolapi.connection.HttpGetException;
import com.github.brunocf.lolapi.enums.Region;
import com.github.brunocf.lolapi.structures.league.LeagueDto;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

/*
 * Access to "game-v1.1" calls 
 */
public class League {

	private static final String VERSION = "v2.1";
	private static final String ENDPOINT = "http://prod.api.pvp.net/api/{region}/{version}/league/by-summoner/{summonerId}";
	
	private static final Gson gson = new Gson();
	private String apiKey;
	
	public League(String apiKey) {
		this.apiKey = apiKey;
	}
	
	/*
	 * Retrieves leagues data for summoner, including leagues for all of summoner's teams 
	 */
	public Map<String, LeagueDto> getSummonerLeague(Region region, long summonerId) throws HttpGetException {
		
		String url = ENDPOINT;
		url = url.replace("{region}", region.toString().toLowerCase());
		url = url.replace("{version}", VERSION);
		url = url.replace("{summonerId}", summonerId + "");
		
		String resp = HttpConnection.sendGet(url, apiKey, null);
		
		Type t = new TypeToken<Map<String, LeagueDto>>() { }.getType();
		return gson.fromJson(resp, t);
	
	}
	
}
