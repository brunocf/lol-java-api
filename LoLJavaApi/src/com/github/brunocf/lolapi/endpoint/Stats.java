package com.github.brunocf.lolapi.endpoint;

import com.github.brunocf.lolapi.connection.HttpConnection;
import com.github.brunocf.lolapi.connection.HttpGetException;
import com.github.brunocf.lolapi.enums.Region;
import com.github.brunocf.lolapi.structures.stats.PlayerStatsSummaryListDto;
import com.github.brunocf.lolapi.structures.stats.RankedStatsDto;
import com.google.gson.Gson;

/*
 * Access to "game-v1.1" calls 
 */
public class Stats {

	private static final String VERSION = "v1.1";
	private static final String ENDPOINT = "http://prod.api.pvp.net/api/lol/{region}/{version}/stats/by-summoner/{summonerId}/{type}";
	
	private static final String TYPE_SUMMARY = "summary";
	private static final String TYPE_RANKED = "ranked";
	
	
	private static final Gson gson = new Gson();
	private String apiKey;
	
	public Stats(String apiKey) {
		this.apiKey = apiKey;
	}
	
	/*
	 * Get player stats summaries by summoner ID. One summary is returned per queue type. (REST)
	 */
	public PlayerStatsSummaryListDto getSummonerSummaryStats(Region region, long summonerId) throws HttpGetException {
		
		String url = ENDPOINT;
		url = url.replace("{region}", region.toString().toLowerCase());
		url = url.replace("{version}", VERSION);
		url = url.replace("{summonerId}", summonerId + "");
		url = url.replace("{type}", TYPE_SUMMARY);
		
		String resp = HttpConnection.sendGet(url, apiKey, null);
		
		return gson.fromJson(resp, PlayerStatsSummaryListDto.class);
	
	}
	
	/*
	 * Get ranked stats by summoner ID. Includes statistics for Twisted Treeline and Summoner's Rift. (REST)
	 */
	public RankedStatsDto getSummonerRankedStats(Region region, long summonerId) throws HttpGetException {
		
		String url = ENDPOINT;
		url = url.replace("{region}", region.toString().toLowerCase());
		url = url.replace("{version}", VERSION);
		url = url.replace("{summonerId}", summonerId + "");
		url = url.replace("{type}", TYPE_RANKED);
		
		String resp = HttpConnection.sendGet(url, apiKey, null);
		
		return gson.fromJson(resp, RankedStatsDto.class);
	
	}
	
}
