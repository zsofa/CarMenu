package com.example.CarMenu.Services;

import com.example.CarMenu.Models.InformationalPanel;
import com.example.CarMenu.Models.SportMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SPService {

    @Autowired
    private SportMode SP;
    private IPService ipService;
    private InformationalPanel IP;

    public boolean turnOnSportMode(boolean isON) {
        if (ipService.getFuelLevel() <= IP.getConsumption()) {
            System.out.println("The sport mode can not be turned on under 6 l/100km consumption!");
            return SP.isOff();
        } else {
            return SP.setOff(false);
        }
    }

    public boolean turnOffSportMode() {
       return SP.setOff(true);
    }




}
