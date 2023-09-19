package week10.Animals;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Meow ^uwu^");
    }
}
