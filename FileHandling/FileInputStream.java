import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws IOException {
        
        File f = new File("student.txt");
        
        FileInputStream fis = new FileInputStream(f);
         
        int total = fis.available();
        
        System.out.println(total);
        
        int data;
        
        while((data = fis.read()) != -1)
        {
            System.out.print((char)data);
        }
        
        fis.close();
        
        System.out.println("\n" + f.getName());
    }
}
