import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main (String[] args) throws IOException {
        
        File f = new File("student.txt");
        
        FileOutputStream fos = new FileOutputStream(f , true);
         
        String temp = "I am Suga";
        byte[] data = temp.getBytes(StandardCharsets.UTF_8);

        
        fos.write(data, 0, data.length);
        fos.flush();
        fos.close();
        
        System.out.println("\n" + f.getName());
    }
}
