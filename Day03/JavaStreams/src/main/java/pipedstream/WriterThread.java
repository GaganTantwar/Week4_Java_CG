package pipedstream;
import java.io.*;
public class WriterThread extends Thread{
    private PipedOutputStream outputStream;

    public WriterThread(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer Thread!";
            outputStream.write(message.getBytes());
            System.out.println("Writer: Data written to the pipe.");
            outputStream.close();  // Close stream after writing
        } catch (IOException e) {
            System.err.println("Writer: IOException occurred - " + e.getMessage());
        }
    }
}
