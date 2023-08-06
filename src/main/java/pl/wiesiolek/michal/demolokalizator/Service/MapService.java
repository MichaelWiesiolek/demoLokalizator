package pl.wiesiolek.michal.demolokalizator.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

import static java.util.Locale.US;

public class MapService {
    public static void main(String[] args){
    try{

        String address = "Jarzębinowa , Łężyce, PL";
        String encodeAddress = URLEncoder.encode(address, StandardCharsets.UTF_8);
        String apiKey = "AIzaSyAJ8ur2AWSfGRQ4pp4t9fOYdYzT3apB00A";
        String apiUrl = "https://maps.googleapis.com/maps/api/geocode/json?address=" + encodeAddress + "&key=" + apiKey;
        URL url = new URL(apiUrl);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        System.out.println("Response Code: " + responseCode);
        System.out.println("Response Body: " + response.toString());
        Locale locale = US;//? PL;

        connection.disconnect();
    } catch (IOException e) {
        e.printStackTrace();
    }
}}
