package com.company;

import java.util.Arrays;

public class Lamborghini extends SportCar{

    private static final String FIRM_NAME = "Lamborghini";

    private String [] lamboModels = {"aventador", "centenario", "gallardo","urus"};

    public Lamborghini(int engineCapacity, int engineHP, String driveType, String gear, String color, String typeOfUse, String model) {
        super(engineCapacity, engineHP, driveType, gear, color, typeOfUse);
        this.model=checkModel(lamboModels,model) ? model : UNDEFINED_MODEL;

    }

    public void goToLamboService(){
        System.out.println("Car " + model+" can go to Lamborghini service");
    }

    @Override
    public String toString() {
        return  "Автомобиль: "+model +
                ", фирма производитель " + FIRM_NAME + ", " +
                super.toString();
    }
}
