
package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AllFileWriting {

    public static void main(String[] args) throws IOException {

        // Create a folder to store all files
        File folder = new File("C:/Users/IT LAB II/Desktop/MyFiles");

        if (!folder.exists()) {
            folder.mkdirs();
        }

        String path = folder.getPath() + File.separator;  // instead of File.seperator we also use / is possible

        // 1. TXT file
        writeFile(path + "student.txt",
                "Name: Suga\nAge: 21");

        // 2. JAVA file
        writeFile(path + "Hello.java",
                "public class Hello {\n" +
                "    public static void main(String[] args) {\n" +
                "        System.out.println(\"Hello Java\");\n" +
                "    }\n" +
                "}");

        // 3. HTML file
        writeFile(path + "index.html",
                "<html><body><h1>Hello World</h1></body></html>");

        // 4. CSV file
        writeFile(path + "students.csv",
                "Name,Age,Department\n" +
                "Suga,21,CSE\n" +
                "Ravi,22,IT");

        // 5. JSON file
        writeFile(path + "student.json",
                "{ \"name\": \"Suga\", \"age\": 21 }");

        // 6. XML file
        writeFile(path + "student.xml",
                "<student><name>Suga</name><age>21</age></student>");

        // 7. PDF file - NOT a valid PDF
        writeFile(path + "report.pdf",
                "This is plain text, not a valid PDF document.");

        // 8. JPG file - NOT a valid image
        writeFile(path + "photo.jpg",
                "This is plain text, not JPG image data.");

        // 9. PNG file - NOT a valid image
        writeFile(path + "image.png",
                "This is plain text, not PNG image data.");

        // 10. DOCX file - NOT a valid Word document
        writeFile(path + "document.docx",
                "This is plain text, not a valid DOCX document.");

        System.out.println("All 10 files have been created.");

        // Display the created files
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }

    // Common method for writing text into a file
    public static void writeFile(String filePath, String content)
            throws IOException {

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        }
    }
}
