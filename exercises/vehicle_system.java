class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void print() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}

class Car extends Vehicle {
    int wheels;
    int doors;
    
    public Car(String make, String model, int year, int doors, int wheels) {
        super(make, model, year);
        this.doors = doors;
        this.wheels = wheels;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Doors: " + doors + ". Wheels: " + wheels);
    }
}

class Bike extends Vehicle {
    String saddleModel;
    int pedals;
    
    public Bike(String make, String model, int year, String saddleModel, int pedals) {
        super(make, model, year);
        this.saddleModel = saddleModel;
        this.pedals = pedals;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Saddle Model: " + saddleModel + ". Pedals: " + pedals);
    }
}

public class Main {
    public static void main(String[] args) {
        Car exampleCar = new Car("Toyota", "Corolla", 2020, 4, 4);
        exampleCar.print();

        Bike exampleBike = new Bike("Honda", "CBR 1000RR", 2021, "Corbin", 2);
        exampleBike.print();
    }
}
