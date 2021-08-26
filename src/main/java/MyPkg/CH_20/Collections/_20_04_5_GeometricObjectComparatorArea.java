package MyPkg.CH_20.Collections;

import java.util.Comparator;

public class _20_04_5_GeometricObjectComparatorArea implements Comparator<GeometricObject>{
  @Override
  public int compare(GeometricObject o1, GeometricObject o2) {
    return o1.getArea() > o2.getArea() ? 1 : o1.getArea() == o2.getArea() ? 0 : -1;
  }
}