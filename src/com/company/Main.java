package com.company;

public class Main {

    public static void main(String[] args) {

        Lamborghini urus = new Lamborghini(4000,650,"rear wheel","manual","yellow","luxury car","urus");
        Landrover rangeRover = new Landrover(3500,300,"four wheel","auto","green",4000,"range rover");
        Volvo fh16 = new Volvo(16000,650,"front wheel","manual","white","yes","FH16");

        Car [] cars = {urus,rangeRover,fh16};

        SportCar [] sportCars = {urus};
        OffRoadCar [] offRoadCars = {rangeRover};
        Truck [] trucks = {fh16};

        Lamborghini [] lambos = {urus};
        Landrover [] landrovers = {rangeRover};
        Volvo [] volvos = {fh16};

        for (Car car : cars) {
            // здесь выводятся полные сведения о полях объектов, т.к. метод toString переопределен в каждом классе
            // Если бы метод не переопределялся в дочерних классах, то данные выводились бы в соответствии с методом toString
            // из того родительского класса, где он переопределялся.
            System.out.println(car);
        }
        System.out.println("---------------------");

        printCars(cars);

        System.out.println("---------------------");

        for (Car car : cars) {
            car.drive();
        }

        System.out.println();

        for (SportCar sportCar : sportCars) {
            System.out.println("This " + sportCar.CAR_CLASS+ " is used as "+sportCar.getTypeOfUse());
            sportCar.fastDrive();
        }

        System.out.println();

        for (Lamborghini lambo : lambos) {
            System.out.println("This " + lambo.CAR_CLASS+ " is used as "+lambo.getTypeOfUse());
            lambo.fastDrive();
            lambo.goToLamboService();

        }

        System.out.println();

    }

    public static void printCars (Car [] cars){
        for (Car car : cars) {
            System.out.println( "Автомобиль " + car.getModel() +
                    ", объем двигателя "+car.getEngineCapacity() +
                    ", мощность "+car.getEngineHP() +
                    ", коробка передач "+car.getGear() +
                    ", привод "+car.getDriveType() +
                    ", цвет "+car.getColor()
            );
        }
    }


}
