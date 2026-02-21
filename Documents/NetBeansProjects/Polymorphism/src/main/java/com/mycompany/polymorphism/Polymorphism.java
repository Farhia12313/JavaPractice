
package com.mycompany.polymorphism;
public class Polymorphism {

    public static void main(String[] args) {
        Animal myBird = new Bird();
        Animal myCat = new Cat();

        System.out.println("Testing Animal Sounds:");
        System.out.println("-----------------------");
        
        // Calling the overridden methods
        myBird.sound();
        myCat.sound();
       Shape myCircle = new Circle(5);
        Shape myRect = new Rectangle(4, 6);
        Shape myTri = new Triangle(3, 8);

        System.out.println("Area of Circle: " + myCircle.calculateArea());
        System.out.println("Area of Rectangle: " + myRect.calculateArea());
        System.out.println("Area of Triangle: " + myTri.calculateArea());
     
    }
}
