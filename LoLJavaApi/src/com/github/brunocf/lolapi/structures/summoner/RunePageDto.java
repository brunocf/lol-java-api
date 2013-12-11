package com.github.brunocf.lolapi.structures.summoner;

public class RunePageDto {

	/*
	 * Indicates if the page is the current page.
	 */
	public boolean current;
	
	/*
	 * Rune page ID.
	 */
	public long id;
	
	/*
	 * Rune page name.
	 */
	public String name;
	
	/*
	 * List of rune slots associated with the rune page.
	 */
	public RuneSlotDto[] slots;

	
}
