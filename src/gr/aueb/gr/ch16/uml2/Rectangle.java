package gr.aueb.gr.ch16.uml2;

public class Rectangle extends AbstractShape implements IRectangle{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double getDiameter() {
        return 0;
    }

    @Override
    public Long getCircumference() {
        return 0L;
    }

    @Override
    public double getArea() {
        return (width * height);
    }
}

