public class variable {
    // 1. Instance variable declared above main
    int totalSum = 0;

    public static void main(String[] args) {
        // 2. Create an object of the class 'variable'
        variable obj = new variable();

        if (args.length == 0) {
            System.out.println("Please provide numbers as arguments.");
            return;
        }

        // 3. Access totalSum through the object 'obj'
        for (int i = 0; i < args.length; i++) {
            obj.totalSum += Integer.parseInt(args[i]);
        }

        System.out.println("Sum using object: " + obj.totalSum);
    }
}