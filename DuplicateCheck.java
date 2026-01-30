public class DuplicateCheck {
    // 1. Variable declared above main (Instance Variable)
    boolean hasDuplicate = false;

    public static void main(String[] args) {
        // 2. Create an object to access instance variables
        DuplicateCheck obj = new DuplicateCheck();

        // Taking input from command-line arguments as per previous flow
        if (args.length == 0) {
            System.out.println("Please provide array elements as arguments.");
            return;
        }

        // 3. Nested Loop Logic to check for duplicates
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                // Comparing elements at index i and j
                if (args[i].equals(args[j])) {
                    obj.hasDuplicate = true;
                    break; // Exit inner loop if duplicate found
                }
            }
            if (obj.hasDuplicate) break; // Exit outer loop
        }

        // Output the result
        if (obj.hasDuplicate) {
            System.out.println("The array contains duplicate elements.");
        } else {
            System.out.println("The array contains all unique elements.");
        }
    }
}