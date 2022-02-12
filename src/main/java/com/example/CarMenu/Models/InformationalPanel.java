package com.example.CarMenu.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class InformationalPanel {

    private String warning;
    private int consumption;

    public InformationalPanel() {
        this.warning = "The fuel level is under: ";
        this.consumption = 6;
    }
}
