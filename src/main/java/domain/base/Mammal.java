package domain.base;

public abstract class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public void lay() {
        System.out.println("I lay babies.");
    }

}
