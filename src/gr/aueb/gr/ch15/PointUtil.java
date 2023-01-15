package gr.aueb.gr.ch15;

public class PointUtil {

    public static void main(String[] args) {
        Point p1 = new Point(5.5);
        Point2D p2 = new Point2D(6, 6);
        Point3D p3 = new Point3D(7, 7, 7);
        Point2D p4 = new Point2D(12, 5);
        Point3D p5 = new Point3D(5, 9, 14);

        distanceFromOrigin(p1);
        distanceFromOrigin(p2);
        distanceFromOrigin(p3);
        distanceFromOrigin(p4);
        distanceFromOrigin(p5);

        printDistanceFromOrigin(p1);
        printDistanceFromOrigin(p2);
        printDistanceFromOrigin(p3);
        printDistanceFromOrigin(p4);
        printDistanceFromOrigin(p5);
    }

    public static void distanceFromOrigin(Point point) {
        point.getDistanceFromOrigin();
    }

    public static void printDistanceFromOrigin(Point point) {
        System.out.println(point.getDistanceFromOrigin());
    }
}
