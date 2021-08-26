package MyPkg.CH_20.Collections;

import java.util.Comparator;

public class _20_04_6_TestComparator {
  public static void main(String[] args) {
    GeometricObject g1 = new Rectangle(5, 5);//A=25; P=20
    GeometricObject g2 = new Circle(5);//A=5^2 *PI=78.54; C=2PIr=31.42

    GeometricObject ga = max(g1, g2);    
    System.out.println("The area of the larger object is " + ga.getArea());
    
    /*GeometricObject ga = max(g1, g2, new _20_04_5_GeometricObjectComparatorArea());    
    System.out.println("The area of the larger object is " + ga.getArea());*/
    
    GeometricObject gp = max(g1, g2, new _20_04_5_GeometricObjectComparatorPerimeter());    
    System.out.println("The perimeter of the larger object is " + gp.getPerimeter());
  }
  
  public static GeometricObject max(GeometricObject g1, GeometricObject g2) {
      /*if(g1.compareTo(g2) > 0){
          return g1;
      }else{
          return g2;
      }*/
      
    return g1.compareTo(g2) > 0 ? g1 : g2;
  }
  
  public static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator<GeometricObject> c) {
  	return c.compare(g1, g2) > 0 ? g1 : g2;
  } 
  
}