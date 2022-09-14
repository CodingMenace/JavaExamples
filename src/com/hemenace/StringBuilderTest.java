package com.hemenace;

public class StringBuilderTest {

    public static void main(String[] args) {
        String[] cities = {"Tokyo", "Delhi", "Shanghai", "Mexico City", "São Paulo"};
        StringBuilder sb = new StringBuilder();
        // loop through all the cities
        for (String city : cities) {
            // concatenate the city names
            sb.append(city);
            // concatenate a comma between each city name for increased readability
            sb.append(", ");
        }
        System.out.println(sb);


    }


}
