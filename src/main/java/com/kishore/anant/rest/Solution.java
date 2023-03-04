package com.kishore.anant.rest;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.net.*;


class Result {

    /*
     * Complete the 'finestFoodOutlet' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING city
     *  2. INTEGER votes
     * API URL: https://jsonmock.hackerrank.com/api/food_outlets?page={page_no}
     */

    public static String finestFoodOutlet(String city, int votes) throws IOException {
        String URL =  "https://jsonmock.hackerrank.com/api/food_outlets";
        List<JsonElement> titles = new ArrayList<>();
        int page = 1;
        int totalPage = 1;
        String response;

        while (page <= totalPage) {
            URL obj = new URL(URL + "?page=" + page);

            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

            while ((response = in.readLine()) != null) {
                System.out.println(response);

                JsonObject jsonResponse = new Gson().fromJson(response, JsonObject.class);
                totalPage = jsonResponse.get("total_pages").getAsInt();
                JsonArray data = jsonResponse.getAsJsonArray("data");

                for (JsonElement e : data) {
                    titles.add(e);
                }

            }

            page++;
        }
        System.out.println("123");

        System.out.println(titles.get(0).getAsJsonObject().get("city").getAsString());

        String result = titles.stream().filter(e -> e.getAsJsonObject().get("city").getAsString().equalsIgnoreCase(city))
                .filter(e->e.getAsJsonObject().get("user_rating").getAsJsonObject().get("votes").getAsInt() >= votes)
                .max((e1,e2) -> Double.compare(e1.getAsJsonObject().get("user_rating").getAsJsonObject().get("average_rating").getAsDouble(),
                        e2.getAsJsonObject().get("user_rating").getAsJsonObject().get("average_rating").getAsDouble())).get()
                .getAsJsonObject().get("name").getAsString();

        //System.out.println(result1.size());

        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        String result = Result.finestFoodOutlet("Miami", 1000);
        System.out.println(result);

    }
}

