package com.github.brunocf.lolapi.endpoint;

import com.github.brunocf.lolapi.connection.HttpConnection;
import com.github.brunocf.lolapi.connection.HttpGetException;
import com.github.brunocf.lolapi.enums.Region;
import com.github.brunocf.lolapi.structures.game.RecentGamesDto;
import com.google.gson.Gson;

/*
 * Access to "game-v1.1" calls 
 */
public class Game {

	private static final String VERSION = "v1.1";
	private static final String ENDPOINT = "http://prod.api.pvp.net/api/lol/{region}/{version}/game/by-summoner/{summonerId}/recent";
	
	private static final Gson gson = new Gson();
	private String apiKey;
	
	public Game(String apiKey) {
		this.apiKey = apiKey;
	}
	
	/*
	 * Get recent games by summoner ID (REST)
	 */
	public RecentGamesDto getSummonerRecentGames(Region region, long summonerId) throws HttpGetException {
		
		String url = ENDPOINT;
		url = url.replace("{region}", region.toString().toLowerCase());
		url = url.replace("{version}", VERSION);
		url = url.replace("{summonerId}", summonerId + "");
		
		String resp = HttpConnection.sendGet(url, apiKey, null);
		
		return gson.fromJson(resp, RecentGamesDto.class);
	
	}
	
}
