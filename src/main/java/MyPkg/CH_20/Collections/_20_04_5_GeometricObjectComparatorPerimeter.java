package MyPkg.CH_20.Collections;

import java.util.Comparator;

public class _20_04_5_GeometricObjectComparatorPerimeter implements Comparator<GeometricObject>{
  @Override
  public int compare(GeometricObject o1, GeometricObject o2) {
    return o1.getPerimeter()> o2.getPerimeter() ? 1 : o1.getPerimeter() == o2.getPerimeter() ? 0 : -1;
  }
}