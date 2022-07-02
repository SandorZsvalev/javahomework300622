package com.company;

public class Car {
    private int engineCapacity;
    private int engineHP;
    private String gear;
    private String driveType;
    private String color;
    private String model;

    public Car(int engineCapacity, int engineHP, String gear, String driveType, String color, String model) {
        this.engineCapacity = engineCapacity;
        this.engineHP = engineHP;
        this.gear = gear;
        this.driveType = driveType;
        this.color = color;
        this.model = model;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getEngineHP() {
        return engineHP;
    }

    public String getGear() {
        return gear;
    }

    public String getDriveType() {
        return driveType;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Автомобиль "+ model +" : " +
                "Объем двигателя = " + engineCapacity +
                ", мощность двигателя = " + engineHP +
                ", коробка передач = " + gear +
                ", привод = " + driveType +
                ", цвет = " + color;
    }
}
