package com.company;

/**
 * Created by bradford on 8/7/16.
 */
public class Car {

    int modelYear;
    boolean isItFun;

    public Car(int carModelYear, boolean fun) {
        modelYear = carModelYear;
        isItFun = fun;
    }

    public void startCar() {
        System.out.println("Vrrroooommm!");
    }

}
