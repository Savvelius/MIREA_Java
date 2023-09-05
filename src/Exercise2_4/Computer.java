package Exercise2_4;

public class Computer {
    public final String name;
    public final int price;
    public Computer(String name, int price) {
        if (price < 0)
            throw new RuntimeException("computer can't cost less than zero");
        if (name.isBlank())
            throw new RuntimeException("computer must have a name");
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Computer(name = " + name + ", price = " + price + ")";
    }
}
