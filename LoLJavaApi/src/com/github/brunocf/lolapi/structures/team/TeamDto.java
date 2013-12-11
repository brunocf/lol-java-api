package com.github.brunocf.lolapi.structures.team;

public class TeamDto {

	public long timestamp;
	public TeamIdDto teamId;
	public String name;
	public String tag;
	public String status;
	public TeamStatSummaryDto teamStatSummary;
	public RosterDto roster;
	public MatchHistorySummaryDto[] matchHistory;
	public long createDate;
	public long modifyDate;
	public long lastJoinDate;
	public long secondLastJoinDate;
	public long thirdLastJoinDate;
	public long lastGameDate;
	public long lastJoinedRankedTeamQueueDate;
	public MessageOfDayDto messageOfDay;
}
