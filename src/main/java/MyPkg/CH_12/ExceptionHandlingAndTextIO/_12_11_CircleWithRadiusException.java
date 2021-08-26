package MyPkg.CH_12.ExceptionHandlingAndTextIO;

public class _12_11_CircleWithRadiusException {
  /** The radius of the circle */
  private double radius;

  /** The number of the objects created */
  private static int numberOfObjects = 0;

  /** Construct a circle with radius 1 */
  public _12_11_CircleWithRadiusException() {
    this(1.0);
  }

  /** Construct a circle with a specified radius */
  public _12_11_CircleWithRadiusException(double newRadius) {
    try {
      setRadius(newRadius);
      numberOfObjects++;
    }catch (_12_10_InvalidRadiusException ex) {
      ex.printStackTrace();
    }
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double newRadius) throws _12_10_InvalidRadiusException {
    if (newRadius >= 0)
      radius =  newRadius;
    else
      throw new _12_10_InvalidRadiusException(newRadius);
  }

  /** Return numberOfObjects */
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  /** Return the area of this circle */
  public double findArea() {
    return radius * radius * 3.14159;
  }
}