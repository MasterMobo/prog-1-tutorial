package week10.Animals;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("woof");
    }

    void greets(Dog another) {
        System.out.println("woooof");
    }
}
