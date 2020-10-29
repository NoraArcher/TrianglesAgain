public class PointDriver {

  public static void main(String[] args) {

    Point p1 = new Point(3.0, 0.0);
    Point p2 = new Point(3.0, 4.0);
    Point p3 = new Point(0.0, 0.0);
    Point p12 = new Point(p1);

    boolean test = ( ( p1.getX() == p12.getX() ) && ( p1.getY() == p12.getY() ) );
    System.out.println("testing copy constructor:\n" + test);

    test = p1.equals(p12);
    System.out.println("testing equals:\n" + test);
    test = !(p1.equals(p2));
    System.out.println("testing equals Again:\n" + test);


    test = ( p3.distanceTo(p2) == 5.0 );
    System.out.println("testing distanceTo:\n" + test);


  }

}
