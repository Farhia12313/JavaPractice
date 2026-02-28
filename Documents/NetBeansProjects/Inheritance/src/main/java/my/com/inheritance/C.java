package my.com.inheritance;
class C implements A,B{
    public void display(){
        A.super.display();
        B.super.display();
        System.out.println("class C display");
        
    }
}
