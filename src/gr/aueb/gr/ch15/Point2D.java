package gr.aueb.gr.ch15;

/**
 * Defines a 2D Point, from any 2 given points,
 * utilizing Method Point.
 * Includes {@link #y} <br>
 * With <i>accessor</i> methods:
 * {@link #getY()} <br>
 * With <i>mutator</i> methods:
 * {@link #setY(double)} <br>
 * Public Methods:
 * {@link #getDistanceFromOrigin()}
 */
public class Point2D extends Point {
    private double y;

    public Point2D() {
    }

    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Calculates the distance of a 2D point,
     * from the start of the axes (origin)
     * which is point (0, 0).
     *
     * @return The distance of a 2D point
     * from the point of origin.
     */
    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(super.getDistanceFromOrigin(), 2) + Math.pow(y, 2));
    }
}
