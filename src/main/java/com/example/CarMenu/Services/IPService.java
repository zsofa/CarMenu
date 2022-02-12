package com.example.CarMenu.Services;

import com.example.CarMenu.Models.InformationalPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IPService {

    private RestTemplate restTemplate = new RestTemplate();
    public Random random = new Random();

    @Autowired
    private InformationalPanel IP;

    @Value("${simulator.url}")
    private String serverUrl;

    public List<Integer> getSpeedsFromRound() {


        return restTemplate.getForObject(serverUrl + "/round_speeds", ArrayList.class);
    }

    public Integer getActualSpeed() {
        return getSpeedsFromRound().get(random.nextInt(getSpeedsFromRound().size()));
    }

    public Integer getFuelLevel() {
        return restTemplate.getForObject(serverUrl + "/fuel_level", Integer.class);
    }

    public String warning() {
        if (getFuelLevel() <= IP.getConsumption()) {
            return IP.getWarning() + getFuelLevel();
        } else {
            return "You have enough fuel for at least 100 km!";
        }
    }
}
