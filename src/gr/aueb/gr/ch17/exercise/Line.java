package gr.aueb.gr.ch17.exercise;

import java.io.Serializable;

public class Line implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private double length;

    public Line() {
    }

    public Line(double length) {
        this.length = length;
    }

    public Line(Line line) {
        this.length = line.length;
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

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return (Line) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        return Double.compare(line.getLength(), getLength()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getLength());
        return (int) (temp ^ (temp >>> 32));
    }
}
