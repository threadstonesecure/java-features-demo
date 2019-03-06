package domain.base;

public abstract class Oviparous extends Animal {

    public Oviparous(String name) {
        super(name);
    }

    public void lay() {
        System.out.println("I lay eggs.");
    }
}
