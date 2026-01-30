import java.util.Scanner;

public class ElementFrequency {
    // 1. Variable declared above main (Instance Variable)
    int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 2. Create an object of the class
        ElementFrequency obj = new ElementFrequency();

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input the element to search for
        System.out.print("Enter the element to find frequency of: ");
        int target = sc.nextInt();

        // 3. Logic: Loop and increment the object's variable
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                obj.count++;
            }
        }

        System.out.println("Frequency of " + target + " is: " + obj.count);
        sc.close();
    }
}