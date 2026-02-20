import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt")))
{
            bw.write("Hello Aryan");
            bw.newLine();
            bw.write("This is BufferedWriter example.");
            bw.newLine();
            bw.write("Efficient file handling in Java.");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }    }    }