package com.company;

public class OffRoadCar extends Car {
    static final String CAR_CLASS = "OffRoad Car";
    private final int DEFAULT_WEIGHT = 3500;
    private int weightOfCar;

    public OffRoadCar(int engineCapacity, int engineHP, String driveType, String gear, String color, int weightOfCar) {
        super(engineCapacity, engineHP, driveType, gear, color);
        this.weightOfCar = checkWeightOfCar(weightOfCar) ? weightOfCar : DEFAULT_WEIGHT;
    }

    private boolean checkWeightOfCar(int weightOfCar) {
        return weightOfCar > 1000;
    }

    protected void fourWheelDrive() {
        System.out.println("The car can goes off road");
    }

    @Override
    public String toString() {
        return "<-- СВОЙСТВО ОФФРОАД Класс машины = " + CAR_CLASS +
                ", полная массса автомобиля = " + weightOfCar + ", СВОЙСТВО ОФФРОАД --> " +
                super.toString();
    }
}
