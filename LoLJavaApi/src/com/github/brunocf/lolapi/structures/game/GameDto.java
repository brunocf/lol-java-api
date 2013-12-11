package com.github.brunocf.lolapi.structures.game;

public class GameDto {

	/*
	 * Champion ID associated with game.
	 */
	public int championId;
	
	/*
	 * Date game was played specified as epoch milliseconds.
	 */
	public long createDate;
	
	/*
	 * Game ID
	 */
	public long gameId;

	/*
	 * Invalid flag
	 */
	public boolean invalid;

	/*
	 * Game mode.
	 */
	public String gameMode;

	/*
	 * Game type.
	 */
	public String gameType;

	/*
	 * Game sub-type.
	 */
	public String subType;

	/*
	 * Map ID
	 */
	public int mapId;

	/*
	 * Team ID associated with game
	 */
	public int teamId;

	/*
	 * ID of first summoner spell.
	 */
	public int spell1;

	/*
	 * ID of second summoner spell.
	 */
	public int spell2;

	/*
	 * Level
	 */
	public int level;

	/*
	 * Other players associated with the game.
	 */
	public PlayerDto[] fellowPlayers;

	/*
	 * Statistics associated with the game for this summoner.
	 */
	public RawStatDto[] statistics;	
	
}
