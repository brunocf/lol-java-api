package com.github.brunocf.lolapi.structures.summoner;

public class MasteryPageDto {

	/*
	 * Indicates if the mastery page is the current mastery page.
	 */
	public boolean current;
	
	/*
	 * Mastery page name.
	 */
	public String name;
	
	/*
	 * List of mastery page talents associated with the mastery page.
	 */
	public TalentDto[] talents;
	
}
