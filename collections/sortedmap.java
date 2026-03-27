import java.util.*;

public class sortedmap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, String> m = new TreeMap<>();

        // 🔹 Insertion
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter key: ");
            int key = sc.nextInt();
            System.out.print("Enter value: ");
            String value = sc.next();

            m.put(key, value);
        }

        System.out.println("After Insertion (Sorted): " + m);

        // 🔹 Deletion
        System.out.print("Enter key to delete: ");
        int delKey = sc.nextInt();
        m.remove(delKey);
        System.out.println("After Deletion: " + m);

        // 🔹 Update
        System.out.print("Enter key to update: ");
        int upKey = sc.nextInt();
        System.out.print("Enter new value: ");
        String newVal = sc.next();

        m.put(upKey, newVal);
        System.out.println("After Update: " + m);

        // 🔹 Searching
        System.out.print("Enter key to search: ");
        int searchKey = sc.nextInt();

        if(m.containsKey(searchKey)) {
            System.out.println("Key found, Value = " + m.get(searchKey));
        } else {
            System.out.println("Key not found");
        }

        // 🔹 Traversal
        System.out.println("Traversal:");
        for(Map.Entry<Integer, String> e : m.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        sc.close();
    }
}