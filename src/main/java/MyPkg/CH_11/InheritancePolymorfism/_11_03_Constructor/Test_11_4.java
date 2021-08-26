/**
 *
 * @author laura
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_03_Constructor;

/**
 *
 * @author laura
 */
public class Test_11_4 {
    public static void main(String[] args) {
        Apple apple = new Apple();
    }
}
class Apple extends Fruit {
    public Apple() {super();}
}
class Fruit {
    public Fruit() {}
    public Fruit(String name) {
        System.out.println("Fruit's constructor is invoked");
    }
}