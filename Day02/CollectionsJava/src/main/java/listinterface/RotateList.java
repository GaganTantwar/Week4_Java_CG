package listinterface;
import java.util.*;

public class RotateList {

    // This method rotates a list of integers by a given index
    public static List<Integer> rotatedList(List<Integer> list, int index) {
        List<Integer> rotated = new ArrayList<>(); // Create a new list to store the rotated elements

        // Add elements from the index to the end of the list
        for (int i = index; i < list.size(); i++) {
            rotated.add(list.get(i));
        }

        // Add elements from the start of the list to the index
        for (int i = 0; i < index; i++) {
            rotated.add(list.get(i));
        }

        return rotated; // Return the rotated list
    }

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>(); // Create a new list to store integers
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Array List Before Rotation: " + list); // Print the original list

        // Rotate the list by index 2
        List<Integer> rotated = rotatedList(list, 2);
        System.out.println("Array List After Rotation: " + rotated); // Print the rotated list
    }
}
