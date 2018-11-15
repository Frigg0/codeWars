package com.company.kyu8.trafficLight;

public class TrafficLights {
    public static String updateLight(String current) {
        return (current == "green") ? "yellow" : (current == "yellow") ? "red" : (current == "red") ? "green" : "error";
    }
}

/*
    return (current.equals("red") ? "green" : current.equals("yellow") ? "red" : "yellow");
 */