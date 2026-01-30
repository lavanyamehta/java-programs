class Parent {
    // Variable in the parent class
    String value = "Parent Class Value";
}

class Child extends Parent {
    // Variable in the child class with the same name (shadowing)
    String value = "Child Class Value";

    void display() {
        // 'this.value' refers to the variable in this Child class
        System.out.println("Using this: " + this.value);

        // 'super.value' refers to the variable in the Parent class
        System.out.println("Using super: " + super.value);
    }
}

public class KeywordExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}