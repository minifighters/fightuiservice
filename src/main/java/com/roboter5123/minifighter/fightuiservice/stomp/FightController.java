package com.roboter5123.minifighter.fightuiservice.stomp;
import com.roboter5123.minifighter.fightuiservice.service.FightService;
import com.roboter5123.minifighter.fightuiservice.stomp.model.FightJoinReply;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

@Controller
@Log
public class FightController {

    private final FightService fightService;

    @Autowired
    public FightController(FightService fightService) {

        this.fightService = fightService;
    }

    @SubscribeMapping("/topic/fight/{fightCode}")
    public FightJoinReply joinFight(@DestinationVariable final String fightCode) {

        log.info("FightController: Started joinFight");
        FightJoinReply reply = fightService.joinFight(fightCode);
        log.info("FightController: Exiting joinFight");
        return reply;
    }
}

