package com.battleship.game.configuration;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig{

    public static final String GAME_START_QUEUE_NAME = "gameStartQueue";

    public static final String GENERATE_FLEET_QUEUE_NAME = "generateFleetQueue";

    public static final String BATTLE_LOCATION_QUEUE_NAME = "battleLocationQueue";

    public static final String POSITION_FLEET_QUEUE_NAME = "positionFleetQueue";

    public static final String SHIPS_SPEED_QUEUE_NAME = "shipsSpeedQueue";

    public static final String MOVE_SHIPS_QUEUE_NAME = "moveShipsQueue";

    public static final String TURN_SHIPS_QUEUE_NAME = "turnShipsQueue";

    public static final String MOVE_GUNS_QUEUE_NAME = "moveGunsQueue";

    public static final String FIRE_GUNS_QUEUE_NAME = "fireGunsQueue";

    public static final String GAME_START_EXCHANGE_NAME = "gameStartExchange";

    public static final String GENERATE_FLEET_EXCHANGE_NAME = "generateFleetExchange";

    public static final String BATTLE_LOCATION_EXCHANGE_NAME = "battleLocationExchange";

    public static final String POSITION_FLEET_EXCHANGE_NAME = "positionFleetExchange";

    public static final String SHIPS_SPEED_EXCHANGE_NAME = "shipsSpeedExchange";

    public static final String MOVE_SHIPS_EXCHANGE_NAME = "moveShipsExchange";

    public static final String TURN_SHIPS_EXCHANGE_NAME = "turnShipsExchange";

    public static final String MOVE_GUNS_EXCHANGE_NAME = "moveGunsExchange";

    public static final String FIRE_GUNS_EXCHANGE_NAME = "fireGunsExchange";

    public static final String GAME_START_ROUTING_KEY = "gameStart.#";

    public static final String GENERATE_FLEET_ROUTING_KEY = "generateFleet.#";

    public static final String BATTLE_LOCATION_ROUTING_KEY = "battleLocation.#";

    public static final String POSITION_FLEET_ROUTING_KEY = "positionFleet.#";

    public static final String SHIPS_SPEED_ROUTING_KEY = "shipsSpeed.#";

    public static final String MOVE_SHIPS_ROUTING_KEY = "moveShips.#";

    public static final String TURN_SHIPS_ROUTING_KEY = "turnShips.#";

    public static final String MOVE_GUNS_ROUTING_KEY = "moveGuns.#";

    public static final String FIRE_GUNS_ROUTING_KEY = "fireGuns.#";

    @Autowired
    RabbitTemplate rabbitmqTemplate;

    @Bean
    Queue createGameStartQueue() {
        return new Queue(GAME_START_QUEUE_NAME, false);
    }

    @Bean
    TopicExchange exchangeGameStart() {
        return new TopicExchange(GAME_START_EXCHANGE_NAME);
    }

    @Bean
    Binding bindingGameStart(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(GAME_START_ROUTING_KEY);
    }

    @Bean
    Queue createGenerateFleetQueue() {
        return new Queue(GENERATE_FLEET_QUEUE_NAME, false);
    }

    @Bean
    TopicExchange exchangeGenerateFleet() {
        return new TopicExchange(GENERATE_FLEET_EXCHANGE_NAME);
    }

    @Bean
    Binding bindingGenerateFleet(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(GENERATE_FLEET_ROUTING_KEY);
    }

    @Bean
    Queue createBattleLocationQueue() {
        return new Queue(BATTLE_LOCATION_QUEUE_NAME, false);
    }

    @Bean
    TopicExchange exchangeBattleLocation() {
        return new TopicExchange(BATTLE_LOCATION_EXCHANGE_NAME);
    }

    @Bean
    Binding bindingBattleLocation(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(BATTLE_LOCATION_ROUTING_KEY);
    }

    @Bean
    Queue createShipsPositionFleetQueue() {
        return new Queue(POSITION_FLEET_QUEUE_NAME, false);
    }

    @Bean
    TopicExchange exchangePositionFleet() {
        return new TopicExchange(POSITION_FLEET_EXCHANGE_NAME);
    }

    @Bean
    Binding bindingPositionFleet(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(POSITION_FLEET_ROUTING_KEY);
    }

    @Bean
    Queue createShipsSpeedQueue() {
        return new Queue(SHIPS_SPEED_QUEUE_NAME, false);
    }

    @Bean
    TopicExchange exchangeShipsSpeed() {
        return new TopicExchange(SHIPS_SPEED_EXCHANGE_NAME);
    }

    @Bean
    Binding bindingShipsSpeed(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(SHIPS_SPEED_ROUTING_KEY);
    }

    @Bean
    Queue createMoveShipsQueue() {
        return new Queue(MOVE_SHIPS_QUEUE_NAME, false);
    }

    @Bean
    TopicExchange exchangeMoveShips() {
        return new TopicExchange(MOVE_SHIPS_EXCHANGE_NAME);
    }

    @Bean
    Binding bindingMoveShips(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(MOVE_SHIPS_ROUTING_KEY);
    }

    @Bean
    Queue createTurnShipsQueue() {
        return new Queue(TURN_SHIPS_QUEUE_NAME, false);
    }

    @Bean
    TopicExchange exchangeTurnShips() {
        return new TopicExchange(TURN_SHIPS_EXCHANGE_NAME);
    }

    @Bean
    Binding bindingTurnShips(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(TURN_SHIPS_ROUTING_KEY);
    }

    @Bean
    Queue createMoveGunsQueue() {
        return new Queue(MOVE_GUNS_QUEUE_NAME, false);
    }

    @Bean
    TopicExchange exchangeMoveGuns() {
        return new TopicExchange(MOVE_GUNS_EXCHANGE_NAME);
    }

    @Bean
    Binding bindingMoveGuns(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(MOVE_GUNS_ROUTING_KEY);
    }

    @Bean
    Queue createFireGunsQueue() {
        return new Queue(FIRE_GUNS_QUEUE_NAME, false);
    }

    @Bean
    TopicExchange exchangeFireGuns() {
        return new TopicExchange(FIRE_GUNS_EXCHANGE_NAME);
    }

    @Bean
    Binding bindingFireGuns(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(FIRE_GUNS_ROUTING_KEY);
    }

    @Bean
    SimpleMessageListenerContainer container(ConnectionFactory connectionFactory) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setConnectionFactory(connectionFactory);
        return container;
    }
}
