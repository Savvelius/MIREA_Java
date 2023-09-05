package Exercise2_3;

public class Point {
    public double x = 0;
    public double y = 0;
    public Point(double _x, double _y) {
        x = _x;
        y = _y;
    }
    @Override
    public String toString() {
        return "Point(x = " + x + ", y = " + y + ")";
    }
}
