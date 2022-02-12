package com.example.CarMenu.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class InformationalPanel {

    private String warning;

    public InformationalPanel(String warning) {
        this.warning = "The fuel level is under: ";
    }
}
