package Exercise2_5;

public class Dog {
    private String name;
    private int age;
    public Dog(String name, int age) {
        if (name.isBlank()) throw new RuntimeException("a dog must have a name");
        if (age < 0)        throw new RuntimeException("an age can't be a negative number");
        this.age = age;
        this.name = name;
    }
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
    public void setAge(int age) {this.age = age;}
    public int getAge() {return age;}
    public int getHumanAge() {return age * 7;}

    @Override
    public String toString() {
        return "Dog(name = " + name + ", age = " + age + ")\n";
    }
}
