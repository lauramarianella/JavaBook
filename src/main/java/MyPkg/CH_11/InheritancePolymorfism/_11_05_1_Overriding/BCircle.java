/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_11.InheritancePolymorfism._11_05_1_Overriding;

/**
 *
 * @author laura
 */
class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    System.out.println("Circle area: " + radius * radius * Math.PI);
    return radius * radius * Math.PI;
  }

}

public class BCircle extends Circle {
    private double length;
    public BCircle(double radius, double length){
        super(radius);
        this.length = length;
    }
    //@Override
    public double getArea(){
        double bCircleArea = super.getArea()* this.length;
        
        System.out.println("BCircle area: " + bCircleArea);
        return bCircleArea;
    }
    
    public static void main(String[] args) {
        Circle b = new BCircle(1,5);
        b.getArea();
    }
}