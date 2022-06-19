package _08_California_Weather;

import java.util.HashMap;

import javax.swing.JOptionPane;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 * 
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api
 */

public class CaliforniaWeather {
    
    void start() {
        HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
        String Choice;
        String cityName="";
        String Weather="";
        String Temperature;
        Choice = JOptionPane.showInputDialog("Enter a place, weather, or temperature");
   
        if(Choice.equals("place")) {
        	cityName = Utilities.capitalizeWords(JOptionPane.showInputDialog("Which city do you want to enter?"));
        	   WeatherData datum = weatherData.get(cityName);
        	if( datum == null ) {
                System.out.println("Unable to find weather data for: " + cityName);
            } else {
                System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
            }
        }
        else if(Choice.equals("weather")) {
        	String weatherList = "";
        	Weather = JOptionPane.showInputDialog("What weather are you looking for?");
        	for(String city: weatherData.keySet()) {
        		if(weatherData.get(city).weatherSummary.equals(Weather)) {
        			weatherList= weatherList + city + " ";
        		}
        	}
        	System.out.println("The cities with the weather of " + Weather + " is " + weatherList);
        }
        else if(Choice.equals("temperature")) {
        	String temperatureList = "";
   
        	Double temp1 = Double.parseDouble(JOptionPane.showInputDialog("What is the lowest temperature you are looking for?"));
        	Double temp2 = Double.parseDouble(JOptionPane.showInputDialog("What is the highest temperature you are looking for?"));
        	for(String city: weatherData.keySet()) {
        		
        		if(weatherData.get(city).temperatureF >= (temp1) && weatherData.get(city).temperatureF <= (temp2)) {
        			temperatureList = temperatureList + city + " ";
        		}
        	}
        	System.out.println("The cities between the temperature " + temp1 + " and " +temp2 + " are " + temperatureList);
        }
        
        
        // All city keys have the first letter capitalized of each word
        //String cityName = Utilities.capitalizeWords( "National City" );
        
        
        
    }
}
