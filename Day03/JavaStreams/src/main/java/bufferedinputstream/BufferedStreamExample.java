package bufferedinputstream;

import java.io.*;

public class BufferedStreamExample {
    // Buffer size set to 4KB
    private static final int BUFFER = 4096; // 4KB

    // Method to copy file using buffered streams
    public static long bufferedStreams(String source, String destination1) {
        long start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination1))) {

            // Buffer to store data chunks
            byte[] buffer = new byte[BUFFER];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                // Write buffer content to the output file
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully with buffering.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        return (end - start); // Return the time taken for the operation
    }

    // Method to copy file without using buffered streams
    public static long unbufferedStream(String source, String destination) {
        long start = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            // Buffer to store data chunks
            byte[] buffer = new byte[BUFFER];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                // Write buffer content to the output file
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully with unbuffering.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        return (end - start); // Return the time taken for the operation
    }

    public static void main(String[] args) {
        // File paths for input and output
        String source = "inputlarge.txt";
        String destination1 = "output1.txt";
        String destination2 = "output2.txt";

        // Copy file using buffered streams and measure time taken
        long time1 = BufferedStreamExample.bufferedStreams(source, destination1);
        // Copy file using unbuffered streams and measure time taken
        long time2 = BufferedStreamExample.unbufferedStream(source, destination2);

        // Print the time taken for each operation
        System.out.println(time1);
        System.out.println(time2);
    }
}
