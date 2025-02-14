package pipedstream;
import java.io.*;
public class ReaderThread extends Thread{
    private PipedInputStream inputStream;

    public ReaderThread(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try{
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String receivedMessage = new String(buffer, 0, bytesRead);
            System.out.println("Reader: Received - " + receivedMessage);
            inputStream.close();  // Close stream after reading
        }
        catch (IOException e) {
            System.err.println("Reader: IOException occurred - " + e.getMessage());
        }
    }
}
