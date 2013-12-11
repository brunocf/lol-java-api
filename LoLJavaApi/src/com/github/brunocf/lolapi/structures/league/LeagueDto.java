package com.github.brunocf.lolapi.structures.league;

public class LeagueDto {

	public LeagueItemDto[] entries;
	
	public String name;
	
	/*
	 * (legal values: RANKED_SOLO_5x5, RANKED_TEAM_3x3, RANKED_TEAM_5x5)
	 */
	public String queue;
	
	/*
	 * (legal values: CHALLENGER, DIAMOND, PLATINUM, GOLD, SILVER, BRONZE)
	 */
	public String tier;
	
	public long timestamp;
	

	
}
