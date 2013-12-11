package com.github.brunocf.lolapi.structures.summoner;

public class SummonerDto {

	/*
	 * Summoner ID.
	 */
	public long id;

	/*
	 * Summoner name.
	 */
	public String name;

	/*
	 * ID of the summoner icon associated with the summoner.
	 */
	public int profileIconId;

	/*
	 * Date summoner was last modified specified as epoch milliseconds.
	 */
	public long revisionDate;

	/*
	 * Summoner level associated with the summoner.
	 */
	public long summonerLevel;
	
}
