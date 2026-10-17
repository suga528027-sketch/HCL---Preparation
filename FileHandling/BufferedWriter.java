package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	public static void main(String[] args) throws IOException {
		
		File folder = new File("C:/Users/IT LAB II/Desktop/MyFiles/student.txt");
		
		BufferedWriter bf = new BufferedWriter(new FileWriter(folder , true));
		
		bf.write("Name: Suga");
    	bf.newLine();
    	bf.write("Department: CSE");
        bf.newLine();
        bf.write("Skill: Java");

		bf.close();
		
		System.out.println("File updated");
	}

}
