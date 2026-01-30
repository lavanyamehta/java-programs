import java.util.Scanner;

class static1 {
    static int n; // Static variable
    int m_n;      // Instance variable (renamed slightly to avoid conflict)

    public static void main(String[] args) {
        // 'Scanner' must be capitalized
        Scanner s = new Scanner(System.in);
        
        // Use 'static1' because that is the name of your class
        static1 m = new static1();
        
        int n; // Local variable
        
        // Reading input for the instance variable
        m.m_n = s.nextInt();
        
        // Reading input for the local variable
        n = s.nextInt();
        
        // Printing the results
        System.out.println(n);
        System.out.println(m.m_n);
    }
}