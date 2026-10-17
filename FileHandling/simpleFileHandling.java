import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class Main
{
	public static void main(String[] args) throws IOException {
	    
	    File f = new File("student.txt");
	    
	    //f.createNewFile();
	    
	   // BufferedWriter bf = new BufferedWriter(new FileWriter(f ,true));
	    
	   // bf.write("\nI am a java full stack developer");
	    
	   // bf.close();
	    
	    
	    BufferedReader br = new BufferedReader(new FileReader(f));
	    
	   // String line;
	    
	   // while((line = br.readLine()) != null)
	   // {
	   //     System.out.println(line);
	   // }
	    
	    char[] ch = new char[100];
        int temp;
        StringBuilder sb = new StringBuilder();

        while ((temp = br.read(ch)) != -1) {
            sb.append(ch, 0, temp);
        }

        System.out.println(sb.toString());
	    
	    br.close();
		System.out.println(f.getName());
	}
}
