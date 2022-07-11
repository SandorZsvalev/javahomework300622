package com.company;

public class SportCar extends Car{

    protected final String CAR_CLASS = "Sport car";
    private String typeOfUse;

    public SportCar(int engineCapacity, int engineHP, String driveType, String gear, String color, String typeOfUse) {
        super(engineCapacity, engineHP, driveType, gear, color);
        this.typeOfUse = checkTypeOfUse(typeOfUse) ? typeOfUse : "other type";

    }

    public String getTypeOfUse() {
        return typeOfUse;
    }

    private boolean checkTypeOfUse(String gear) {
        return gear.matches("racing car|luxury car");
    }

    protected void fastDrive (){
        System.out.println("The car can goes faster than other");
    }

    @Override
    public String toString() {
        return  "< -- СВОЙСТВО СПОРТ КАР Класс машины = " + CAR_CLASS +
                ", тип использования = " + typeOfUse + ", СВОЙСТВО СПОРТ КАР --> "+
                super.toString();

    }
}
