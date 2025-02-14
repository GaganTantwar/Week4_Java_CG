package pipedstream;
import java.io.*;
public class PipedStreamReader {
    public static void main(String[] args) {
        try {
            // Create piped streams
            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream(outputStream);

            // Create and start threads
            Thread writerThread = new WriterThread(outputStream);
            Thread readerThread = new ReaderThread(inputStream);

            writerThread.start();
            readerThread.start();

            // Ensure both threads finish execution
            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            System.err.println("Main: Exception occurred - " + e.getMessage());
        }
    }
}
