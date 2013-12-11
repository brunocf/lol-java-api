package com.github.brunocf.lolapi.structures.stats;

public class PlayerStatsSummaryDto {

	/*
	 * List of aggregated stats.
	 */
	public AggregatedStatDto[] aggregatedStats;
	
	/*
	 * Number of losses for this queue type. Returned for ranked queue types only.
	 */
	public int losses;
	
	/*
	 * Date stats were last modified specified as epoch milliseconds.
	 */
	public long modifyDate;
	
	/*
	 * Player stats summary type. (legal values: AramUnranked5x5, CoopVsAI, OdinUnranked, RankedPremade3x3, 
	 * RankedPremade5x5, RankedSolo5x5, RankedTeam3x3, RankedTeam5x5, Unranked, Unranked3x3)
	 */
	public String playerStatSummaryType;
	
	/*
	 * Number of wins for this queue type.
	 */
	public int wins;
	
	
	
}/*
aggregatedStats	List[AggregatedStatDto]	
losses	int	
modifyDate	c	
modifyDateStr	Date	
playerStatSummaryType	string	
wins	int	
*/
