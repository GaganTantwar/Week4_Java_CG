package readandwritefile;
import java.io.*;
public class FileReadAndWrite {
    public static boolean fileReadWrite(String sourceFile,String destinationFile){
        // Create File objects for both files
        File inputFile = new File(sourceFile);
        File outputFile = new File(destinationFile);
        boolean ans=false;
        // Check if the source file exists
        if (!inputFile.exists()) {
            System.out.println("Error: Source file does not exist.");
            return false;
        }
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.println(byteData);
                fos.write(byteData);
            }
            System.out.println("File copied successfully.");
            ans=true;
        }
        catch (IOException e) {
            ans=false;
            e.printStackTrace();
        }
        return ans;
    }

    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destinationFile = "output.txt";
        FileReadAndWrite.fileReadWrite(sourceFile,destinationFile);
    }
}

