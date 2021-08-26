/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_13.AbstractInterface._13_09_ComparableInterfaceSort;
import MyPkg.CH_11.InheritancePolymorfism._11_01_Inheritance.*;
import java.util.ArrayList;
        
public class SortRectangles {
    public static void main(String[] args) {
        ArrayList<ComparableRectangle> rectangles = new ArrayList();
        rectangles.add(new ComparableRectangle(1, 3));
        rectangles.add(new ComparableRectangle(1, 4));
        rectangles.add(new ComparableRectangle(1, 1));
        rectangles.add(new ComparableRectangle(1, 2));
        
        java.util.Collections.sort(rectangles);
        for (Rectangle rectangle: rectangles) {
            System.out.print(rectangle + " ");
            System.out.println();
        }
    }
}