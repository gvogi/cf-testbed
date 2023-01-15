package gr.aueb.gr.ch15;

/**
 * Defines a 3D Point, from any 3 given points,
 * utilizing Methods Point & Point2D.
 * Includes {@link #z} <br>
 * With <i>accessor</i> methods:
 * {@link #getZ()} <br>
 * With <i>mutator</i> methods:
 * {@link #setZ(double)} <br>
 * Public Methods:
 * {@link #getDistanceFromOrigin()}
 */
public class Point3D extends Point2D {
    private  double z;

    public Point3D() {
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Calculates the distance of a 3D point,
     * from the start of the axes (origin)
     * which is point (0, 0, 0).
     *
     * @return The distance of a 3D point
     * from the point of origin.
     */
    @Override
    public double getDistanceFromOrigin() {
        return Math.sqrt(Math.pow(super.getDistanceFromOrigin(), 2) + Math.pow(z, 2));
    }
}
