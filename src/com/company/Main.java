package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Car subaru = new Car(2011, true);
        System.out.println("This Subaru is from " + subaru.modelYear + ". It's a fun car: " + subaru.isItFun);
        subaru.startCar();

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Subaru");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Porsche");

        for (int j = 0; j < cars.size(); j++) {
            System.out.println("Car " + (j + 1) + ": " + cars.get(j));
        }

        HashMap<String, String> tracks = new HashMap<String, String>();

        tracks.put("Germany", "Nurburgring");
        tracks.put("United States", "Circuit of the Americas");
        tracks.put("Singapore", "Marina Bay Street Circuit");
        tracks.put("France", "Bugatti Circuit");

        for (String track : tracks.keySet()) {
            System.out.println("In " + track + " there is " + tracks.get(track) + ".");
        }


    }
}
