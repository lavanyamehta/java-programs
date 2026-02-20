class Subject {
    int sum(int a, int b){
        return a+b;
    }
    // int sum(int c, int d, int e){
    //     return c+d+e;
    // }
}

class BMW extends Subject {

    int sum(int a, int b){
        return a+b;
    }
    int display(){
        int a = super.sum(4,5);
        return a;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
    Subject ob1 = new Subject();
    BMW ob2 = new BMW();
    // System.out.println(ob1.sum(2, 3));
    // System.out.println(ob1.sum(2, 3,4));
    System.out.println(ob2.sum(3, 4));
    System.out.print(ob2.display());
    }
}
