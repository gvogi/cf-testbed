package gr.aueb.gr.ch15;

/**
 * Defines a Point from any given point <br>
 * Includes {@link #x} <br>
 * With <i>accessor</i> methods:
 * {@link #getX()} <br>
 * With <i>mutator</i> methods:
 * {@link #setX(double)} <br>
 * Public Methods:
 * {@link #getDistanceFromOrigin()}
 */
public class Point {
    private double x;

    public Point() {}

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    /**
     * Calculates the distance of a point,
     * from the start of the axes (origin)
     * which is point 0.
     *
     * @return The distance of a point
     * from the point of origin.
     */
    public double getDistanceFromOrigin() {
        return (x - 0);
    }
}
