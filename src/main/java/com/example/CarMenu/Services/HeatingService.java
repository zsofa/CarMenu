package com.example.CarMenu.Services;

import com.example.CarMenu.Helper.OutsideTemperatureGenerator;
import com.example.CarMenu.Models.Heating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeatingService {

    @Autowired
    private OutsideTemperatureGenerator OTG;
    private Heating heating;

    public int setHeating(int temp) {
        if (temp >= heating.getMinCarTemp() && temp <= heating.getMaxCarTemp()) {
           return heating.setCarTemp(temp);
        } else {
            return heating.getCarTemp();
        }
    }


}
