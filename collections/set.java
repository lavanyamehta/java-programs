import java.util.*;

public class set {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashSet<Integer> s = new HashSet<>();

        // 🔹 Insertion (User Input)
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            int val = sc.nextInt();
            s.add(val);
        }

        System.out.println("After Insertion: " + s);

        // 🔹 Deletion
        System.out.print("Enter element to delete: ");
        int del = sc.nextInt();
        s.remove(del);
        System.out.println("After Deletion: " + s);

        // 🔹 Update (remove + add)
        System.out.print("Enter element to update: ");
        int oldVal = sc.nextInt();
        System.out.print("Enter new value: ");
        int newVal = sc.nextInt();

        s.remove(oldVal);
        s.add(newVal);
        System.out.println("After Update: " + s);

        // 🔹 Searching
        System.out.print("Enter element to search: ");
        int search = sc.nextInt();

        if(s.contains(search)) {
            System.out.println(search + " found in set");
        } else {
            System.out.println(search + " not found");
        }

        // 🔹 Traversal
        System.out.println("Traversal:");
        for(int i : s) {
            System.out.println(i);
        }

        sc.close();
    }
}