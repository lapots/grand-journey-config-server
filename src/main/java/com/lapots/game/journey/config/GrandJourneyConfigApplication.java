package com.lapots.game.journey.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GrandJourneyConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrandJourneyConfigApplication.class, args);
    }

}
