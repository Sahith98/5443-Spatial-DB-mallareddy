package com.battleship.game.controller;

import com.battleship.game.response.BattleShipResponse;
import com.battleship.game.service.ShipLocationGenerateService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.io.IOException;

@RestController
@RequestMapping("/ship")
public class ShipLocationGenResource {

    @Autowired
    ShipLocationGenerateService shipLocationGenerateService;

    @PostMapping("/generate/location")
    public ResponseEntity<BattleShipResponse> generateShipLocation() throws IOException, ParseException {
        FileWriter file = new FileWriter("src/main/resources/json/output/final_product.json");
        BattleShipResponse battleShipResponse = shipLocationGenerateService.generateShipLocation();

        String jsonstr = new Gson().toJson(battleShipResponse);
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(jsonstr);
        file.write(jsonObject.toJSONString());
        file.close();

        return new ResponseEntity(battleShipResponse, HttpStatus.OK);
    }
}
