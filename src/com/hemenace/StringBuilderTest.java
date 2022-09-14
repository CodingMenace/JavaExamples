package com.hemenace;

public class StringBuilderTest {

    public static void main(String[] args) {
        String[] cities = {"Tokyo", "Delhi", "Shanghai", "Mexico City", "São Paulo"};
        StringBuilder sb = new StringBuilder();
        // loop through all the cities
        for(int i = 0; i < cities.length; i++){
            // concatenate the city names
            sb.append(cities[i]);
            // concatenate a comma between each city name for increased readability
            sb.append(", ");
        }
        System.out.println(sb);


    }


}
