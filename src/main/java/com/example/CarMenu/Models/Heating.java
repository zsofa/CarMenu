package com.example.CarMenu.Models;

import lombok.Getter;

@Getter
public class Heating {
    private int carTemp;
    private int minCarTemp;
    private int maxCarTemp; // car temperature measured in celsius

    public Heating() {
        this.carTemp = 20;
        this.minCarTemp = 10;
        this.maxCarTemp = 30;
    }

    public int setCarTemp(int carTemp) {
        return carTemp;
    }

    public void setMinCarTemp(int minCarTemp) {
        this.minCarTemp = minCarTemp;
    }

    public void setMaxCarTemp(int maxCarTemp) {
        this.maxCarTemp = maxCarTemp;
    }
}
