package javaCollection;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("Dheli");
        cityList.add("Kolkata");
        cityList.add("Hyderabab");
        cityList.add("Chennai");
        cityList.add("LuckDown");

        System.out.println("The size of the array list: is: " + cityList.size());

        for (String city : cityList) {
            System.out.println(city);
        }

        cityList.add(2, "Islamabab");

        System.out.println("Cities: " +  cityList);
    }
}
