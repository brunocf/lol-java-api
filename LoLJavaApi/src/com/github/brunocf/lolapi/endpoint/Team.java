package com.github.brunocf.lolapi.endpoint;

import com.github.brunocf.lolapi.connection.HttpConnection;
import com.github.brunocf.lolapi.connection.HttpGetException;
import com.github.brunocf.lolapi.enums.Region;
import com.github.brunocf.lolapi.structures.team.TeamDto;
import com.google.gson.Gson;


public class Team {

	private static final String VERSION = "v2.1";
	private static final String ENDPOINT = "http://prod.api.pvp.net/api/{region}/{version}/team/by-summoner/{summonerId}";
	
	private static final Gson gson = new Gson();
	private String apiKey;
	
	public Team(String apiKey) {
		this.apiKey = apiKey;
	}
	
	/*
	 * Retrieves teams for given summoner ID (REST)
	 */
	public TeamDto[] getSummonerTeams(Region region, long summonerId) throws HttpGetException {
		
		String url = ENDPOINT;
		url = url.replace("{region}", region.toString().toLowerCase());
		url = url.replace("{version}", VERSION);
		url = url.replace("{summonerId}", summonerId + "");
		
		String resp = HttpConnection.sendGet(url, apiKey, null);
		
		return gson.fromJson(resp, TeamDto[].class);
	
	}
	
}
