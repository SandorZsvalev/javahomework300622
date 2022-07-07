package com.company;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car(1600,116,"front wheel","manual","white", "golf");
        Car car2 = new Car(3500,210,"four wheel","auto","black", "hatchback");
        Car car3 = new Car(2200,180,"rear wheel","manual","green", "coupe");
        Car car4 = new Car(5600,350,"four wheel","auto","red", "jeep");
        Car car5 = new Car(800,90,"front wheel","auto","blue","compact");

        // сделали конструктором с некорректными значениями
        Car car6 = new Car(0,0,"aaa","aaa",null,"zzz");
        // сеттерами задаем корректные значения
        car6.setEngineCapacity(1400);
        car6.setEngineHP(110);
        car6.setDriveType("front wheel");
        car6.setGear("manual");
        car6.setColor("white");
        car6.setModel("hatchback");

        // делаем дубликаты с помощью конструктора копирования
        Car car7 = new Car (car1);
        Car car8 = new Car (car2);

        Car [] cars = {car1,car2,car3,car4,car5,car6,car7,car8};

        // вывод с помощью переопределенного метода toString
//        for (Car car : cars) {
//            System.out.println(car);
//       }

        // вывод с помощью геттеров через массив c помощью отдельного метода
        printCars(cars);

        System.out.println("___________________");

        // заменяем первую машину на вторую, оставляем не тронутым только первый параметр - модель
        Car.changeCars (car1,car2);

        printCars(cars);

    }

    public static void printCars (Car [] cars){
        for (Car car : cars) {
            System.out.println( "Автомобиль "+car.getModel() +
                    ", объем двигателя "+car.getEngineCapacity() +
                    ", мощность "+car.getEngineHP() +
                    ", коробка передач "+car.getGear() +
                    ", привод "+car.getDriveType() +
                    ", цвет "+car.getColor()
            );
        }
    }

}
