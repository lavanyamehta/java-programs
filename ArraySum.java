public class ArraySum{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Enter elements");
            return;
        }
        int sum = 0;
        for(int i = 0; i < args.length; i++){
            int num = Integer.parseInt(args[i]);
            sum =  sum + num;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}