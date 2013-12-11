package com.github.brunocf.lolapi.enums;

public enum MatchMakingQueues {

	NOMAL_5V5_BLIND_PICK(2),
	RANKED_SOLO_5V5(4),
	COOP_VS_AI_5V5(7),
	NORMAL_3V3(8),
	NORMAL_5V5_DRAFTPICK(14),
	DOMINION_5V5_BLIND_PICK(16),
	DOMINION_5V5_DRAFT_PICK(17),
	DOMINION_5V5_COOP_VS_AI(25),
	RANKED_TEAM_3V3(41),
	RANKED_TEAM_5V5(42),
	TWISTED_TREELINE_COOP_VS_AI(52),
	ARAM(65),
	ARAM_COOP_VS_AI(67);
	  
	private int value;
    private MatchMakingQueues(int value) {
    	this.value = value;
    }
    public int getValue() {
    	return this.value;
    }
}
