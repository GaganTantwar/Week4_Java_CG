package queueinterface;
import java.util.*;
public class CircularBuffer {
    private int[] buffer;
    private int head;
    private int tail;
    private int size;
    private int count;

    public CircularBuffer(int size) {
        this.size = size;
        this.buffer = new int[size];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    // Insert an element into the circular buffer
    public void insert(int value) {
        buffer[tail] = value;
        tail = (tail + 1) % size;
        if (count < size) {
            count++;
        } else {
            head = (head + 1) % size; // Overwrite the oldest element
        }
    }

    // Get the current state of the buffer as an array
    public int[] getBuffer() {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = buffer[(head + i) % size];
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        System.out.println(Arrays.toString(cb.getBuffer())); // Output: [1, 2, 3]

        cb.insert(4);
        System.out.println(Arrays.toString(cb.getBuffer())); // Output: [2, 3, 4]
    }
}
