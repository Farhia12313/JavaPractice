
package com.mycompany.polymorphism;

class Animal {
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}
class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("The bird chirps: Tweet Tweet!");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows: Meow Meow!");
    }
}

