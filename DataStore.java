// Class with the constructor
class DataStore {
    String message;

    // 1. Defining the Constructor
    // It has the same name as the class and no return type
    public DataStore(String input) {
        this.message = input;
        System.out.println("Constructor has been called!");
    }

    void display() {
        System.out.println("Message stored in object: " + message);
    }
}

// Main class to invoke the constructor
public class MainClass {
    public static void main(String[] args) {
        // 2. Invoking the constructor from another class
        // This is done using the 'new' keyword
        DataStore myObj = new DataStore("Hello from Constructor");

        // Calling a method to verify the data was stored
        myObj.display();
    }
}