package com.minifighters.fightuiservice.service;
import com.minifighters.fightuiservice.rest.model.MatchmakingSlot;
import com.minifighters.fightuiservice.stomp.model.FightJoinReply;
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
