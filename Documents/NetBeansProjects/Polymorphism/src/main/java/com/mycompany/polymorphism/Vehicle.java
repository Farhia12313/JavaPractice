package com.mycompany.polymorphism;

class Vehicle {
    int speed = 0;
public void speedUp() {
        speed += 5;
        System.out.println("Vehicle speed increased to: " + speed + " km/h");
    }
}
class Car extends Vehicle {
    @Override
    public void speedUp() {
        // Cars accelerate faster
        speed += 20;
        System.out.println("Car accelerates! New speed: " + speed + " km/h");
    }
}
class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        speed += 2;
        System.out.println("Bicycle pedals harder! New speed: " + speed + " km/h");
        Animal myBird = new Bird();
        Animal myCat = new Cat();
        System.out.println("Tasting animal sound");
        myBird.sound();
        myCat.sound();
           
    }
}