import java.io.FileInputStream;
import java.io.IOException;
public class ByteReadExample {
public static void main(String[] args) {
try {
FileInputStream fis = new FileInputStream("bytefile.txt");
int i;
while((i = fis.read()) != -1) {
System.out.print((char)i);
}
fis.close();
} catch (IOException e) {
System.out.println(e);
}
}
}
