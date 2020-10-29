public class TriangleDriver {

  public static void main(String[] args) {

    Point p1 = new Point(3.0, 0.0);
    Point p2 = new Point(3.0, 4.0);
    Point p3 = new Point(0.0, 0.0);

    Point p4 = new Point(-3.7320, 2.3);
    Point p5 = new Point(-3.7320, -5.7);
    Point p6 = new Point(3.19620323, -1.7);

    Triangle T1 = new Triangle(p1, p2, p3); //3-4-5 right triangle
    Triangle T2 = new Triangle(p4, p5, p6); //equilateral
    Triangle T3 = new Triangle(-5.0, 2.0, -1.0, 2.0, -3.0, -4.0); //isosceles

    if (T1.getPerimeter() == 12.0) {
      System.out.println("perimeter test: SUCCESS");
    } else {
      System.out.println("perimeter test: FAIL");
      System.out.println("12.0 != " + T1.getPerimeter());
    }
    if (T2.getPerimeter() == 23.999999999522807) {
      System.out.println("perimeter test: SUCCESS");
    } else {
      System.out.println("perimeter test: FAIL");
      System.out.println("24.0 != " + T2.getPerimeter());
    }
    if (T3.getPerimeter() == 16.64911064067352) {
      System.out.println("perimeter test: SUCCESS");
    } else {
      System.out.println("perimeter test: FAIL");
      System.out.println("16.64911064067352 != " + T3.getPerimeter());
    }

    System.out.println();

    if (T1.getArea() == 6.0) {
      System.out.println("area test: SUCCESS");
    } else {
      System.out.println("area test: FAIL");
      System.out.println("6.0 != " + T1.getArea());
    }
    if (T2.getArea() ==  27.712812920000008) {
      System.out.println("area test: SUCCESS");
    } else {
      System.out.println("area test: FAIL");
      System.out.println("27.7128129211 != " + T2.getArea());
    }
    if (T3.getArea() == 12.000000000000007) {
      System.out.println("area test: SUCCESS");
    } else {
      System.out.println("area test: FAIL");
      System.out.println("12.0 != " + T3.getArea());
    }

    System.out.println();

    if (T1.classify() == "scalene") {
      System.out.println("classify test: SUCCESS");
    } else {
      System.out.println("classify test: FAIL");
      System.out.println("Should be scalene, not " + T1.classify());
    }
    if (T2.classify() == "equilateral") {
      System.out.println("classify test: SUCCESS");
    } else {
      System.out.println("classify test: FAIL");
      System.out.println("Should be equilateral, not " + T2.classify());
    }
    if (T3.classify() == "isosceles") {
      System.out.println("classify test: SUCCESS");
    } else {
      System.out.println("classify test: FAIL");
      System.out.println("Should be isosceles, not " + T3.classify());
    }

    System.out.println();

    if ( T1.toString().equals("v1(3.0, 0.0) v2(3.0, 4.0) v3(0.0, 0.0)") ) {
      System.out.println( "string test: SUCCESS" );
    } else {
      System.out.println( "string test: FAIL" );
      System.out.println( T1.toString() );
    }
    if ( T2.toString().equals("v1(-3.732, 2.3) v2(-3.732, -5.7) v3(3.19620323, -1.7)") ) {
      System.out.println( "string test: SUCCESS" );
    } else {
      System.out.println( "string test: FAIL" );
      System.out.println( T2.toString() );
    }
    if ( T3.toString().equals("v1(-5.0, 2.0) v2(-1.0, 2.0) v3(-3.0, -4.0)") ) {
      System.out.println( "string test: SUCCESS" );
    } else {
      System.out.println( "string test: FAIL" );
      System.out.println( T3.toString() );
    }



  }

}
