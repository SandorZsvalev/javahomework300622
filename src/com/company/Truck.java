package com.company;

public class Truck extends Car {
    static final String CAR_CLASS = "Truck";
    private boolean withTrailer;

    public Truck(int engineCapacity, int engineHP, String driveType, String gear, String color, String trailer) {
        super(engineCapacity, engineHP, driveType, gear, color);
        this.withTrailer = checkTrailerIsOn(trailer);
    }

    private boolean checkTrailerIsOn(String trailer) {
        return "yes".equals(trailer);
    }

    private String ifTrailerIsOn() {
        if (withTrailer) {
            return "Yes";
        }
        return "No";
    }

    protected void carryCargo() {
        System.out.println("The car can goes with a cargo");
    }

    protected void goToLoad() {
        System.out.println("Goes to load");
    }

    @Override
    public String toString() {
        return " <-- СВОЙСТВА ГРУЗОВИКА Класс машины = " + CAR_CLASS +
                ",  с прицепом = " + ifTrailerIsOn() + ", СВОЙСТВА ГРУЗОВИКА --> " +
                super.toString();
    }
}
