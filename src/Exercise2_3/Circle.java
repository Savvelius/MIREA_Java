package Exercise2_3;

public class Circle {
    private Point center;
    public final double radius;
    public Circle(Point p, double r) {
        center = p;
        radius = r;
    }
    public void setCenter(Point p) {
        center = p;
    }
    public Point getCenter(Point p) {
        return center;
    }
    @Override
    public String toString() {
        return "Circle(center = " + center + ", radius = " + radius +  ")\n";
    }
}

