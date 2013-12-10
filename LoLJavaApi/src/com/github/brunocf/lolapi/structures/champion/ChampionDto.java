package com.github.brunocf.lolapi.structures.champion;

/*
 * Champion Details Object
 */
public class ChampionDto {

	/*
	 * Indicates if the champion is active.
	 */
	public boolean active;
	
	/*
	 * Champion attack rank.
	 */
	public int attackRank;
	
	/*
	 * Bot enabled flag (for custom games).
	 */
	public boolean botEnabled;

	/*
	 * Bot Match Made enabled flag (for Co-op vs. AI games).
	 */
	public boolean botMmEnabled;

	/*
	 * Champion defense rank.
	 */
	public int defenseRank;

	/*
	 * Champion difficulty rank.
	 */
	public int difficultyRank;

	/*
	 * Indicates if the champion is free to play. Free to play champions are rotated periodically.
	 */
	public boolean freeToPlay;

	/*
	 * Champion ID.
	 */
	public long id;

	/*
	 * Champion magic rank.
	 */
	public int magicRank;

	/*
	 * Indicates if the champion is active.Champion name.
	 */
	public String name;
	
	/*
	 * Ranked play enabled flag.
	 */
	public boolean rankedPlayEnabled;
	
}
