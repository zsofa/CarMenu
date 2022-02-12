package com.example.CarMenu.Controllers;

import com.example.CarMenu.Services.SPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SPController {

    @Autowired
    private SPService spService;

    @PostMapping("/SportMode_switch")
    public ResponseEntity<Boolean> switchToSportMode(@RequestBody boolean isON) {
        spService.turnOnSportMode(isON);
        return new ResponseEntity<>(isON, HttpStatus.ACCEPTED);
    }
}
