package Exercise2_3;

public class Tester {
    private Circle[] circles;
    public final int capacity;
    private int len = 0;
    public Tester(int cap) {
        capacity = cap;
        circles  = new Circle[capacity];
    }
    public void addCircle(Circle c) {
        if (len + 1 >= capacity)
            throw new RuntimeException("Tester's capacity is exceeded");
        circles[len++] = c;
    }
    public Circle getCircle(int index) {
        if (index >= len || index < 0)
            throw new RuntimeException("index exceeds length of Tester");
        return circles[index];
    }
    public void setCircle(int index, Circle c) {
        if (index >= len || index < 0)
            throw new RuntimeException("index exceeds length of Tester");
        circles[index] = c;
    }
    public int length() {
        return len;
    }
}
