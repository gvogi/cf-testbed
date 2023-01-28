package gr.aueb.gr.ch17;

import gr.aueb.gr.ch17.exercise.Circle;
import gr.aueb.gr.ch17.exercise.Line;
import gr.aueb.gr.ch17.exercise.Rectangle;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Line straightLine = new Line(5);
        // Must put it in the same package, in order for it to work
//        Line clonedStraightLine = straightLine.clone();
//
//        clonedStraightLine.setLength(8);
//
//        System.out.println(straightLine);
//        System.out.println(clonedStraightLine);

        Rectangle rectangle1 = new Rectangle(5, 9);
        Rectangle clonedRectangle1 = new Rectangle();

        clonedRectangle1.setWidth(6);
        clonedRectangle1.setHeight(3);

        System.out.println(rectangle1);
        System.out.println(clonedRectangle1);

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(circle1.getRadius());
        Circle clonedCircle1 = new Circle(circle1);

        clonedCircle1.setRadius(2);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(clonedCircle1);
    }
}
