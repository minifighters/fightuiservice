package com.roboter5123.minifighter.fightuiservice.service;
import com.roboter5123.minifighter.fightuiservice.rest.model.MatchmakingSlot;
import com.roboter5123.minifighter.fightuiservice.stomp.model.FightJoinReply;
import org.springframework.stereotype.Service;

@Service
public class FightServiceImpl implements FightService {

    @Override
    public FightJoinReply joinFight(String fightCode) {

        return null;
    }

    @Override
    public MatchmakingSlot getMatchmakingSlot(String userId) {

        return null;
    }
}
