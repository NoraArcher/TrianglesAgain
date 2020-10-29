public class Triangle {

  private Point v1, v2, v3; //instance variables

  public Triangle(Point a, Point b, Point c) { //constructors
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1,double x2,
                  double y2,double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter() {
    return (v1.distanceTo(v2) + v3.distanceTo(v2) + v1.distanceTo(v3));
  }

  public double getArea() {
    double A = v1.distanceTo(v2);
    double B = v2.distanceTo(v3);
    double C = v3.distanceTo(v1);
    double S = getPerimeter() / 2.0;
    return Math.sqrt(S * (S - A) * (S - B) * (S - C));
  }


  public String classify() {
    int AA = (int) (v1.distanceTo(v2) * 10000);
    double A = AA / 10000.0; //round distances to 4 decimal places
    int BB = (int) (v2.distanceTo(v3) * 10000);
    double B = BB / 10000.0;
    int CC = (int) (v3.distanceTo(v1) * 10000);
    double C = CC / 10000.0;
    if ((A == B) && (B == C)) {
      return "equilateral";
    }
    if ( ( (A == B) || (A == C) ) || (B == C) ) {
      return "isosceles";
    }
    return "scalene";
  }

  public String toString() {
    String ans = "v1(" + v1.getX() + ", " + v1.getY() + ") ";
    ans += "v2(" + v2.getX() + ", " + v2.getY() + ") ";
    ans += "v3(" + v3.getX() + ", " + v3.getY() + ")";
    return ans;
  }

  public void setVertex(int index, Point newP) {
    //replace the specified Point (0,1, or 2) with the new Point
    //System.out.println( "no setVertex()" );
  }

}
