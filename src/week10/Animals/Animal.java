package week10.Animals;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract void greets();
}
