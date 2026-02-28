package my.com.inheritance;
public class Inheritance {

    public static void main(String[] args) {
        C obj = new C();
        obj.display();
        //animal problem
        Animal myDog = new Dog();
        myDog.bark();
        //Rectangle interface
        Rectangle myRect = new Rectangle(10,20);
        myRect.displaySize();
        myRect.resizeWidth(50);
        myRect.resizeHeight(80);
        myRect.displaySize();
        }
    }

