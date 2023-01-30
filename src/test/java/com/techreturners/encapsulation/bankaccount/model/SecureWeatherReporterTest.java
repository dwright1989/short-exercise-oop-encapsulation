package com.techreturners.encapsulation.bankaccount.model;


import org.junit.Test;



import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class SecureWeatherReporterTest {
    @Test
    public void checkFahrenheitFromTemperatureConversion(){
        SecureWeatherReporter secureWR = new SecureWeatherReporter("London", 6.0);
        assertThat(42.8, equalTo(secureWR.getFahrenheitFromTemperature(6)));
    }

    @Test
    public void checkFahrenheitFromTemperatureConversionFromObject(){
        SecureWeatherReporter secureWR = new SecureWeatherReporter("London", 6.0);
        assertThat(42.8, equalTo(secureWR.getFahrenheitFromTemperature(secureWR.getTemperature())));
    }

    @Test
    public void checkGetLocationMethod() {
        SecureWeatherReporter secureWR = new SecureWeatherReporter("London", 6.0);
        assertEquals("London", secureWR.getLocation());

        SecureWeatherReporter secureWR2 = new SecureWeatherReporter("", 6.0);
        assertEquals("", secureWR2.getLocation());
    }

    @Test
    public void checkGetTempMethod() {
        SecureWeatherReporter secureWR = new SecureWeatherReporter("London", 6.0);
        assertThat(6.0, equalTo(secureWR.getTemperature()));
    }

    @Test
    public void checkGetLocationIcon(){
        SecureWeatherReporter secureWR = new SecureWeatherReporter("London", 6.0);
        assertEquals("🌦", secureWR.getLocationIcon());

        SecureWeatherReporter secureWR2 = new SecureWeatherReporter("California", 6.0);
        assertEquals("🌅", secureWR2.getLocationIcon());

        SecureWeatherReporter secureWR3 = new SecureWeatherReporter("Cape Town", 6.0);
        assertEquals("🌤", secureWR3.getLocationIcon());

        SecureWeatherReporter secureWR4 = new SecureWeatherReporter("Glasgow", 6.0);
        assertEquals("🔆", secureWR4.getLocationIcon());

    }

    @Test
    public void checkTemperatureFeeling(){
        SecureWeatherReporter secureWR = new SecureWeatherReporter("London", 6.0);
        assertEquals("It's too cold 🥶!", secureWR.getTemperatureFeeling());

        SecureWeatherReporter secureWR2 = new SecureWeatherReporter("California", 35.0);
        assertEquals("It's too hot 🥵!", secureWR2.getTemperatureFeeling());

        SecureWeatherReporter secureWR3 = new SecureWeatherReporter("Cape Town", 15.0);
        assertEquals("Ahhh...it's just right 😊!", secureWR3.getTemperatureFeeling());


    }




}