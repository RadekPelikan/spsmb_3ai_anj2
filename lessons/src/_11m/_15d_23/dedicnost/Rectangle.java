package _11m._15d_23.dedicnost;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
