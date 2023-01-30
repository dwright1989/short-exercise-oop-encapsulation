package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class SecureWeatherReporter {
    private String location;
    private double temperature;

    private final int HOTTEMP = 30;
    private final int COLDTEMP = 10;

    public SecureWeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String getLocation() {
        return location;
    }

    public double getTemperature() {
        return temperature;
    }

    public String printWeatherInformation() {

        double newTemp = getFahrenheitFromTemperature(temperature);
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, checkLocation(), checkTemperature(), newTemp);

    }

    private double getFahrenheitFromTemperature(double temp){
        return  (9.0/5.0) * temp + 32;
    }

    public String checkLocation() {
        if (location.equals("London")) {
            return "🌦";

        } else if (location.equals("California")) {

            return "🌅";

        } else if (location.equals("Cape Town")) {

            return "🌤";

        }
        return "🔆";
    }

    public String checkTemperature() {
        if (temperature > HOTTEMP) {
            return "It's too hot 🥵!";

        } else if (temperature < COLDTEMP) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }
}
