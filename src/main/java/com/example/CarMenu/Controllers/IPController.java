package com.example.CarMenu.Controllers;

import com.example.CarMenu.Services.IPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IPController {

    @Autowired
    private IPService IPService;

    @GetMapping("/actual_speed")
    public ResponseEntity<Integer> getActualSpeed(Model model) {
        Integer speed = IPService.getActualSpeed();
        model.addAttribute("/round_speeds", speed);
        return new ResponseEntity<>(speed, HttpStatus.OK);
    }

    @GetMapping("actual_fuel")
    public ResponseEntity<Integer> getActualFuelLevel(Model model) {
        Integer fuel = IPService.getFuelLevel();
        model.addAttribute("/fuel_level", fuel);
        return new ResponseEntity<>(fuel, HttpStatus.OK);
    }

    @GetMapping("/warning")
    public ResponseEntity<String> getWarning() {
        String sign = IPService.warning();
        return new ResponseEntity<>(sign, HttpStatus.OK);
    }
}
