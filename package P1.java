package P1;

public abstract class A {
    public void f1() {
        System.out.println("Hello");
    }

    public abstract void f2();
}

class B extends A {
    @Override
    public void f2() {
        System.out.println("World");
    }
}