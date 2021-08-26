/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_10_2_Object;

/**
 *
 * @author laura
 */
public class _11_10_2 {
    public static void main(String[] args) {
        //11.10.2
        Object circle1 = new Circle();
        Object circle2 = new Circle();
        System.out.println(circle1.equals(circle2));
        //System.out.println( ((Circle)circle1).equals((Circle)circle2));
        
//        Circle circle1 = new Circle();
//        Circle circle2 = new Circle();
//        System.out.println(circle1.equals(circle2));
    }
}

class Circle {
    double radius;
    public boolean equals(Circle circle) {
        return this.radius == circle.radius;
    }
}

//class Circle {
//    double radius;
//    public boolean equals(Object circle) {
//        return this.radius == ((Circle)circle).radius;
//    }
//}
