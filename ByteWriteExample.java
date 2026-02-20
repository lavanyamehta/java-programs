import java.io.FileOutputStream;
import java.io.IOException;
public class ByteWriteExample {
public static void main(String[] args) {
try {
FileOutputStream fos = new FileOutputStream("bytefile.txt");
String data = "Hello Lav!";
fos.write(data.getBytes());
fos.close();
System.out.println("Data written successfully.");
} catch (IOException e) {
System.out.println(e);
}
}
}
