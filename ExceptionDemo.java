import java.util.Scanner;

// Custom Exception Class
class InvalidDataException extends Exception {
    InvalidDataException(String msg) {
        super(msg);
    }
}

class Person {
    String name;
    int age;
    float salary;

    void getData() throws InvalidDataException {
        // Using a single scanner for the method
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name (max 20 chars): ");
        name = sc.nextLine();

        if (name.length() > 20) {
            throw new InvalidDataException("Name should not exceed 20 characters!");
        }

        System.out.print("Enter Age (>5): ");
        // Check if input is actually an integer to prevent InputMismatchException
        if (sc.hasNextInt()) {
            age = sc.nextInt();
            // Clear the buffer after nextInt()
            sc.nextLine(); 
        } else {
            throw new InvalidDataException("Age must be a valid number!");
        }

        if (age <= 5) {
            throw new InvalidDataException("Age must be greater than 5!");
        }

        System.out.print("Enter Salary: ");
        if (sc.hasNextFloat()) {
            salary = sc.nextFloat();
            // Clear the buffer after nextFloat()
            sc.nextLine(); 
        } else {
            throw new InvalidDataException("Salary must be a valid decimal number!");
        }
    }

    void display() {
        System.out.println("\n--- Entered Data ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Salary : " + salary);
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        Person p = new Person();

        try {
            p.getData();
            p.display();
        } 
        catch (InvalidDataException e) {
            // Printing to err makes the error message stand out (usually red in IDEs)
            System.err.println("Validation Error: " + e.getMessage());
        } 
        catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.toString());
        }
        finally {
            System.out.println("\nProgram execution finished.");
        }
    }
}