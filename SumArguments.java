public class SumArguments {
    // Instance variable declared above main
    int total = 0; 

    public static void main(String[] args) {
        // Create an object of the class to access the variable
        SumArguments obj = new SumArguments(); 

        // Check if arguments were passed
        if (args.length == 0) {
            System.out.println("Please provide numbers in the terminal.");
            return;
        }

        // Loop to calculate the sum
        for (int i = 0; i < args.length; i++) {
            // Convert string arguments to integers
            obj.total += Integer.parseInt(args[i]); 
        }

        System.out.println("The sum is: " + obj.total);
    }
}