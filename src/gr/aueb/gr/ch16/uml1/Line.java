package gr.aueb.gr.ch16.uml1;

public class Line extends AbstractShape {
    private double length;

    public Line() {
    }

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }
}
