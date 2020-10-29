public class Point {

  private double x, y;

  public Point(double X, double Y) { //constructor 1
    x = X;
    y = Y;
  }

  public Point(Point p) { //constructor 2
    x = p.x;
    y = p.y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public double distanceTo (Point other) {
    double diffx = Math.pow((other.x - x), 2);
    double diffy = Math.pow((other.y - y), 2);
    return Math.sqrt(diffx + diffy);
  }

  public boolean equals(Point other) {
    return (( ( x == other.x ) && ( y == other.y ) ));
  }



}
