package com.battleship.game.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQListenerConfig {

    @Value("${spring.rabbitmq.username}")
    String username;

    @Value("${spring.rabbitmq.password}")
    private String password;

    @Value("${battleship.rabbitmq.gameStartQueue}")
    String gameStartQueue;

    @Value("${battleship.rabbitmq.generateFleetQueue}")
    String generateFleetQueue;

    @Value("${battleship.rabbitmq.battleLocationQueue}")
    String battleLocationQueue;

    @Value("${battleship.rabbitmq.positionFleetQueue}")
    String positionFleetQueue;

    @Value("${battleship.rabbitmq.shipsSpeedQueue}")
    String shipsSpeedQueue;

    @Value("${battleship.rabbitmq.moveShipsQueue}")
    String moveShipsQueue;

    @Value("${battleship.rabbitmq.turnShipsQueue}")
    String turnShipsQueue;

    @Value("${battleship.rabbitmq.moveGunsQueue}")
    String moveGunsQueue;

    @Value("${battleship.rabbitmq.fireGunsQueue}")
    String fireGunsQueue;

    @Bean
    Queue gameStartQueue() {
        return new Queue(gameStartQueue, false);
    }

    @Bean
    Queue generateFleetQueue() {
        return new Queue(generateFleetQueue, false);
    }

    @Bean
    Queue battleLocationQueue() {
        return new Queue(battleLocationQueue, false);
    }

    @Bean
    Queue positionFleetQueue() {
        return new Queue(positionFleetQueue, false);
    }

    @Bean
    Queue shipsSpeedQueue() {
        return new Queue(shipsSpeedQueue, false);
    }

    @Bean
    Queue moveShipsQueue() {
        return new Queue(moveShipsQueue, false);
    }

    @Bean
    Queue turnShipsQueue() {
        return new Queue(turnShipsQueue, false);
    }

    @Bean
    Queue moveGunsQueue() {
        return new Queue(moveGunsQueue, false);
    }

    @Bean
    Queue fireGunsQueue() {
        return new Queue(fireGunsQueue, false);
    }
}
