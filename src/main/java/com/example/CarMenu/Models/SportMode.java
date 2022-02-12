package com.example.CarMenu.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class SportMode {

    private boolean isOff;

    public boolean setOff(boolean off) {
        return isOff = true;
    }
}
