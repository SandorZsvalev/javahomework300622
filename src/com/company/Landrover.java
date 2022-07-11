package com.company;

public class Landrover extends OffRoadCar{

    private static final String FIRM_NAME = "Landrover";

    private String [] landRoverModels = {"defender", "freelander", "discovery", "range rover"};

    public Landrover(int engineCapacity, int engineHP, String driveType, String gear, String color, int weightOfCar, String model) {
        super(engineCapacity, engineHP, driveType, gear, color, weightOfCar);
        this.model = checkModel(landRoverModels,model) ? model : UNDEFINED_MODEL;
    }

    public void transferCaseIsOn(){
        System.out.println("Enable "+FIRM_NAME+" "+model+" transfer case");
    }

    @Override
    public String toString() {
        return  "Автомобиль: " + model +
                ", фирма производитель " +FIRM_NAME + ", " +
                super.toString();
    }

}
