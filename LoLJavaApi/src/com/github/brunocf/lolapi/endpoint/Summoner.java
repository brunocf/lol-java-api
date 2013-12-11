package com.github.brunocf.lolapi.endpoint;

import com.github.brunocf.lolapi.connection.HttpConnection;
import com.github.brunocf.lolapi.connection.HttpGetException;
import com.github.brunocf.lolapi.enums.Region;
import com.github.brunocf.lolapi.structures.summoner.MasteryPagesDto;
import com.github.brunocf.lolapi.structures.summoner.RunePagesDto;
import com.github.brunocf.lolapi.structures.summoner.SummonerDto;
import com.github.brunocf.lolapi.structures.summoner.SummonerNameListDto;
import com.google.gson.Gson;


public class Summoner {

	private static final String VERSION = "v1.1";
	private static final String MASTERIES_ENDPOINT = "http://prod.api.pvp.net/api/lol/{region}/{version}/summoner/{summonerId}/masteries";
	private static final String RUNES_ENDPOINT = "http://prod.api.pvp.net/api/lol/{region}/{version}/summoner/{summonerId}/runes";
	private static final String BY_NAME_ENDPOINT = "http://prod.api.pvp.net/api/lol/{region}/{version}/summoner/by-name/{name}";
	private static final String NAMES_BY_IDS_ENDPOINT = "http://prod.api.pvp.net/api/lol/{region}/{version}/summoner/{summonerIds}/name";
	private static final String BY_ID_ENDPOINT = "http://prod.api.pvp.net/api/lol/{region}/{version}/summoner/{summonerId}";
	
	
	
	private static final Gson gson = new Gson();
	private String apiKey;
	
	public Summoner(String apiKey) {
		this.apiKey = apiKey;
	}
	
	/*
	 * Get mastery pages by summoner ID 
	 */
	public MasteryPagesDto getSummonerMasteries(Region region, long summonerId) throws HttpGetException {
		
		String url = MASTERIES_ENDPOINT;
		url = url.replace("{region}", region.toString().toLowerCase());
		url = url.replace("{version}", VERSION);
		url = url.replace("{summonerId}", summonerId + "");
		
		String resp = HttpConnection.sendGet(url, apiKey, null);
		
		return gson.fromJson(resp, MasteryPagesDto.class);
	
	}
	
	/*
	 * Get rune pages by summoner ID 
	 */
	public RunePagesDto getSummonerRunes(Region region, long summonerId) throws HttpGetException {
		
		String url = RUNES_ENDPOINT;
		url = url.replace("{region}", region.toString().toLowerCase());
		url = url.replace("{version}", VERSION);
		url = url.replace("{summonerId}", summonerId + "");
		
		String resp = HttpConnection.sendGet(url, apiKey, null);
		
		return gson.fromJson(resp, RunePagesDto.class);
	
	}
	
	/*
	 * Get summoner by name 
	 */
	public SummonerDto getSummonerByName(Region region, String name) throws HttpGetException {
		
		String url = BY_NAME_ENDPOINT;
		url = url.replace("{region}", region.toString().toLowerCase());
		url = url.replace("{version}", VERSION);
		url = url.replace("{name}", name);
		
		String resp = HttpConnection.sendGet(url, apiKey, null);
		
		return gson.fromJson(resp, SummonerDto.class);
	
	}
	
	
	/*
	 * Get list of summoner names by summoner IDs
	 */
	public SummonerNameListDto getSummonerNames(Region region, long[] summonerIds) throws HttpGetException {
		
		String strSummonerIds = "";
		boolean first = true;
		for(long id: summonerIds){
			if(first) {
				first = false;
			} else {
				strSummonerIds = strSummonerIds + ",";
			}
			strSummonerIds = strSummonerIds + id;
		}
		
		
		
		String url = NAMES_BY_IDS_ENDPOINT;
		url = url.replace("{region}", region.toString().toLowerCase());
		url = url.replace("{version}", VERSION);
		url = url.replace("{summonerIds}", strSummonerIds);
		
		
		String resp = HttpConnection.sendGet(url, apiKey, null);
		
		return gson.fromJson(resp, SummonerNameListDto.class);
	
	}
	
	/*
	 * Get summoner by summoner ID
	 */
	public SummonerDto getSummonerById(Region region, long summonerId) throws HttpGetException {
		
		
		String url = BY_ID_ENDPOINT;
		url = url.replace("{region}", region.toString().toLowerCase());
		url = url.replace("{version}", VERSION);
		url = url.replace("{summonerId}", summonerId + "");
		
		
		String resp = HttpConnection.sendGet(url, apiKey, null);
		
		return gson.fromJson(resp, SummonerDto.class);
	
	}
	
	
	
}
