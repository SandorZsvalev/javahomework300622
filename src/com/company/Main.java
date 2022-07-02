package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(1600,116,"front wheel","manual","white", "golf");
        Car car2 = new Car(3500,210,"four wheel","auto","black", "hatchback");
        Car car3 = new Car(2200,180,"rear wheel","manual","green", "coupe");
        Car car4 = new Car(5600,350,"four wheel","auto","red", "jeep");
        Car car5 = new Car(800,90,"front wheel","auto","blue","compact");

        Car [] cars = {car1,car2,car3,car4,car5};

        for (Car car : cars) {
            System.out.println(car);
        }

    // но если менее очевидным путем, то так:
/*
        for (Car car : cars) {
            System.out.println( "Автомобиль "+car.getModel() +
                    ", объем двигателя "+car.getEngineCapacity() +
                    ", мощность "+car.getEngineHP() +
                    ", коробка передач "+car.getGear() +
                    ", привод "+car.getDriveType() +
                    ", цвет "+car.getColor()
            );
        }
*/

    }
}
