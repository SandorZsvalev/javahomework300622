package com.company;

import java.util.HashSet;

public class Car {

    private static final int DEFAULT_ENGINE_CAPACITY = 50;
    private static final int DEFAULT_ENGINE_HP = 0;

    private int engineCapacity;
    private int engineHP;
    private String gear;
    private String driveType;
    private String color;
    private String model;

    public Car(int engineCapacity, int engineHP, String driveType, String gear, String color, String model) {
        this.engineCapacity = checkEngineCapacity (engineCapacity) ? engineCapacity : DEFAULT_ENGINE_CAPACITY;
        this.engineHP = checkEngineHP (engineHP) ? engineHP : DEFAULT_ENGINE_HP;
        this.gear = checkGear(gear) ? gear : "not specified";
        this.driveType = checkDriveType(driveType) ? driveType : "not specified";
        this.color = checkColor(color) ? color : "null value";
        this.model = checkModel(model) ? model : "unknown model";
    }

    public Car(Car car) {
        this.engineCapacity = car.engineCapacity;
        this.engineHP = car.engineHP;
        this.gear = car.gear;
        this.driveType = car.driveType;
        this.color = car.color;
        this.model = car.model;
        }

    public int getEngineCapacity() { return engineCapacity; }

    public int getEngineHP() { return engineHP; }

    public String getGear() { return gear; }

    public String getDriveType() { return driveType; }

    public String getColor() { return color; }

    public String getModel() { return model; }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = checkEngineCapacity (engineCapacity) ? engineCapacity : 50;
    }

    public void setEngineHP(int engineHP) {
        this.engineHP = checkEngineHP (engineHP) ? engineHP : 0;
    }

    public void setGear(String gear) {
        this.gear = checkGear(gear) ? gear : "not specified";
    }

    public void setDriveType(String driveType) {
        this.driveType = checkDriveType(driveType) ? driveType : "not specified";
    }

    public void setColor(String color) {
        this.color = checkColor(color) ? color : "null value";
    }

    public void setModel(String model) {
        this.model = checkModel(model) ? model : "unknown model";
    }

    // методы проверок данных
    private boolean checkEngineCapacity(int engineCapacity){
        return engineCapacity > 50;
    }

    private boolean checkEngineHP(int engineHP){
        return engineHP > 0;
    }

    private boolean checkGear(String gear) {
        //здесь использую регулярные выражения для проверки строкового значения
        return gear.matches("manual|auto");
    }

    private boolean checkDriveType (String driveType) {
        //просто чтобы потренироваться, использую здесь хэшсет
        //не уверен, что мои знания в работе hashSet достаточно глубоки, но понимаю, что поиск нужного элемента в
        //HashSet быстрее, чем например в ArrayList, т.к. arraylist по сути массив и поиск осуществляется
        //перебором элементов, а в случае с HashSet у нас набор уникальных значений, и поиск происходит по ключу,
        //который в HashSet является хэшкодом объекта.
        //в любом случае, для поиска среди трех значений это не имеет никакой практической разницы. Можно было сделать
        //просто if (...equals()), или сделать массив и пройти по нему циклом, или, как выше, использовать регулярные выражения
        HashSet <String> driveTypes = new HashSet<>();
        driveTypes.add("front wheel");
        driveTypes.add("rear wheel");
        driveTypes.add("four wheel");

        return driveTypes.contains(driveType);
    }

    private boolean checkColor (String color) {
        if (color != null) {
            return !color.equals("");
        } else {
            return false;
        }
    }

    private boolean checkModel (String model) {
        // здесь проверяем циклом по массиву
        String [] str = {"golf", "hatchback",  "coupe", "jeep", "compact"};
        for (String s : str) {
            if (s.equals(model)){
                return true;
            }
        }
        return false;
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

    // метод меняет поля двух объектов (кроме поля "модель")
    public static void changeCars(Car car1, Car car2){
        int bufferEngineCap = car2.engineCapacity;
        car2.engineCapacity=car1.engineCapacity;
        car1.engineCapacity=bufferEngineCap;

        int bufferEngineHP=car2.engineHP;
        car2.engineHP=car1.engineHP;
        car1.engineHP=bufferEngineHP;

        String bufferGear = car2.gear;
        car2.gear = car1.gear;
        car1.gear = bufferGear;

        String bufferDriveType = car2.driveType;
        car2.driveType = car1.driveType;
        car1.driveType = bufferDriveType;

        String bufferColor = car2.color;
        car2.color = car1.color;
        car1.color = bufferColor;
    }


}
