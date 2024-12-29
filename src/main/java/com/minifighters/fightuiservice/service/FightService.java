package com.minifighters.fightuiservice.service;
import com.minifighters.fightuiservice.rest.model.MatchmakingSlot;
import com.minifighters.fightuiservice.stomp.model.FightJoinReply;

public interface FightService {

    /**
     * Joins the user to the given fight session
     *
     * @param fightCode fightcode for the fight to join. Retrieved from getMatchmakingSlot()
     * @return a reply to be sent to all users in the fight
     */
    FightJoinReply joinFight(String fightCode);

    /**
     * @param userId of the user who wants to join the matchmaking queue
     * @return a matchmaking slot for a fight
     */
    MatchmakingSlot getMatchmakingSlot(String userId);
}
