/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_13.AbstractInterface._13_01_Abstract;

/**
 *
 * @author laura
 */
public class ComparingClassVsAbstractClass {
    public static void main(String[] args) {
        GeometricObject go = new GeometricObject();
        System.out.println(go.whoAmI());//Geometric Object

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        go = c;
        System.out.println(go.whoAmI());//Circle

        go = r;
        System.out.println(go.whoAmI());//Rectangle
        
        //Downcasting
        //Circle newCircle = (Circle)go;
    }
}

class GeometricObject{
    String whoAmI() {
      return "Geometric Object";
    }
}

class Circle extends GeometricObject{
    @Override
    String whoAmI() {
      return "Circle";
    }
}

class Rectangle extends GeometricObject{
    @Override
    String whoAmI() {
      return "Rectangle";
    }
}