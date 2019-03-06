public class DiamondProblemDemo {

    public static void main(String[] args) {
        new ADImpl().meth();
        new ABImpl().meth();
        new ACImpl().meth();
    }
}

interface A {

    default void meth() {
        System.out.println("A");
    }
}

interface B {
    default void meth() {
        System.out.println("B");
    }
}

interface C {
    void meth();
}

interface D extends A {

    @Override
    default void meth() {
        System.out.println("D");
    }
}

class ADImpl implements A, D {

}

class ABImpl implements A, B {

    @Override
    public void meth() {
        System.out.println("ABImpl");
    }
}

class ACImpl implements A, C {

    @Override
    public void meth() {
        System.out.println("ACImpl");
    }
}