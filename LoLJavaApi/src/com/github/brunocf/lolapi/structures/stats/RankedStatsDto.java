package com.github.brunocf.lolapi.structures.stats;

public class RankedStatsDto {

	/*
	 * List of player stats summarized by champion.
	 */
	public ChampionStatsDto[] champions;
	
	/*
	 * Date stats were last modified specified as epoch milliseconds.
	 */
	public long modifyDate;
	
	/*
	 * Summoner ID.
	 */
	public long summonerId;
		
}
