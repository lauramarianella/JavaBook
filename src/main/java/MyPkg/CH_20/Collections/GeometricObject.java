/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_20.Collections;

import MyPkg.CH_11.InheritancePolymorfism._11_01_Inheritance.*;

public abstract class GeometricObject implements Comparable<GeometricObject>{
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;


   /** Construct a default geometric object */
  public GeometricObject() {
    dateCreated = new java.util.Date();
    //System.out.println("\nI was called 1st");
  }

  /** Construct a geometric object with the specified color 
    *  and filled value */
  public GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean, 
     its get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }
  
  public abstract double getArea();
  public abstract double getPerimeter();

  /** Return a string representation of this object */
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color + 
      " and filled: " + filled;
  }
  
  @Override
  public int compareTo(GeometricObject go){
      if(this.getArea() > go.getArea()){
          return 1;
      }else if(this.getArea() < go.getArea()){
          return -1;
      }else{
          return 0;
      }
  }
}
