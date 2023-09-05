package Exercise2_4;

import java.util.Objects;
import java.util.Optional;
import java.util.Vector;
import Exercise1.Task3;

public class Shop {
    private Vector<Computer> computers = new Vector<Computer>();
    public void addComputer(Computer comp) {
        computers.add(comp);
    }
    public boolean removeComputer(Computer comp) {
        return computers.remove(comp);
    }
    public Optional<Computer> getComputer(String name) {
        for (Computer comp : computers) {
            if (Objects.equals(comp.name, name))
                return Optional.of(comp);
        }
        return Optional.empty();
    }
    public void fillFromConsole() {
        while (true) {
            System.out.println("Enter computer's name (or EXIT to exit):");
            String name = System.console().readLine();
            if (name.equals("EXIT"))
                break;
            System.out.println("Enter computer's price:");
            int price = Task3.readInt();
            computers.add(new Computer(name, price));
        }
    }
    @Override
    public String toString() {
        return "Shop(computers = " + computers + ")\n";
    }
    public static Shop test() {
        Shop shop = new Shop();
        shop.fillFromConsole();
        System.out.println(shop);
        return shop;
    }
}








