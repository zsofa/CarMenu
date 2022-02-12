package com.example.CarMenu.Helper;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class OutsideTemperatureGenerator {

    private Random random = new Random();
    private int minOutsideTemp = -10;
    private int maxOutsideTemp = 35; // outside temperature measured in Celsius

    public int getOutsideTemp() {
        return random.nextInt(maxOutsideTemp - minOutsideTemp) + minOutsideTemp;
    }
}
