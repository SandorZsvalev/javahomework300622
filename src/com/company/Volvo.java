package com.company;

public class Volvo extends Truck{

    private static final String FIRM_NAME = "Volvo";

    private String [] volvoTruckModels = {"FH16", "FL7", "FE II"};

    public Volvo(int engineCapacity, int engineHP, String driveType, String gear, String color, String trailer, String model) {
        super(engineCapacity, engineHP, driveType, gear, color, trailer);
        this.model = checkModel(volvoTruckModels,model) ? model : UNDEFINED_MODEL;
    }

    public void upgradeTheEngine(){
        System.out.println("Can upgrade "+FIRM_NAME+" "+model+" engine");
    }

    @Override
    public String toString() {
        return  "Автомобиль: " + model +
                ", фирма производитель " + FIRM_NAME + ", "+
                super.toString();
    }


}
