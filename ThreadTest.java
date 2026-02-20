class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 (1-5): " + i);
            try { 
                Thread.sleep(100); 
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("Thread 2 (6-10): " + i);
            try { 
                Thread.sleep(100); 
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        
        try {
            // As your notes say: 'Jabtak t1 print ni ho jata tabtak t2 start nhi hoga'
            t1.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();
    }
}