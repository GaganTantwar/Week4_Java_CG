package bytearraystreams;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

public class ImageByteArray {

    // Method to convert an image file to a byte array and then back to an image file
    public String imageFiles() {
        String ans = "";
        try {
            // Read the input image file
            BufferedImage image = ImageIO.read(new File("hanumanandram.jpg"));
            // Create an output stream to store the byte array
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            // Write the image to the output stream in JPG format
            ImageIO.write(image, "jpg", outStream);
            // Convert the output stream to a byte array
            byte[] byteArray = outStream.toByteArray();
            // Create an input stream from the byte array
            ByteArrayInputStream inStream = new ByteArrayInputStream(byteArray);
            // Read the byte array into a BufferedImage
            BufferedImage newImage = ImageIO.read((inStream));
            // Write the BufferedImage to a new output image file
            ImageIO.write(newImage, "jpg", new File("OutputImage.jpg"));
            System.out.println("Image Generated from Byte Array");
            ans = "Success";
        } catch (Exception e) {
            ans = "Error";
            e.printStackTrace();
        }
        return ans;
    }

    public static void main(String args[]) {
        ImageByteArray image = new ImageByteArray();
        // Call the imageFiles method and print the result
        String answer = image.imageFiles();
        System.out.println(answer);
    }
}
