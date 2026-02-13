class A {
    int sum(int a, int b) {
        return a + b;
    }
}

class B extends A {

    @Override
    int sum(int a, int b) {
        return a + b + 10;
    }

    void show() {
        System.out.println("Super Sum = " + super.sum(2, 3));
        System.out.println("This Sum = " + this.sum(3, 4));
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}

