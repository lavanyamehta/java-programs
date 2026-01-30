public class CommandLineArray{
    public static void main(String[] args){
        if (args.length == 0){
            System.out.println("No arguments provided.Enter some values");
            return;
        }
        System.out.println("The array elements from command line are:");
        for(int i = 0; i< args.length; i++){
            System.out.println("Index " + i + ": " + args[i]);
        }
    }
}