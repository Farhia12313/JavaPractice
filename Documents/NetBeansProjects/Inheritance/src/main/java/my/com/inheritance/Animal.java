/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.com.inheritance;
interface Animal{
    void bark();
}
class Dog implements Animal{
    @Override
    public void bark(){
        System.out.print("Dog is barking");
    }
}
/**
 *
 * @author Pc
 */

