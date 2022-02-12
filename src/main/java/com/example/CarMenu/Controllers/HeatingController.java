package com.example.CarMenu.Controllers;

import com.example.CarMenu.Helper.OutsideTemperatureGenerator;
import com.example.CarMenu.Models.Heating;
import com.example.CarMenu.Services.HeatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HeatingController {

    @Autowired
    private HeatingService heatingService;
    private OutsideTemperatureGenerator OTG;

    @PostMapping("/setHeating")
    public ResponseEntity<Integer> setHeating(@RequestBody Integer temp) {
        Integer heating = heatingService.setHeating(temp);
        return new ResponseEntity<>(heating, HttpStatus.ACCEPTED);
    }

    @GetMapping("/outside_temp")
    public ResponseEntity<Integer> getOutsideTemp() {
        Integer outside = OTG.getOutsideTemp();
        if (outside < -10 || outside > 35) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(outside, HttpStatus.OK);
        }
    }
}
