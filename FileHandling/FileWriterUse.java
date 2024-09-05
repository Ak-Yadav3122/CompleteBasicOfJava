package FileHandling;

import java.io.FileWriter;

public class FileWriterUse {

    public static void main(String[] args) {

        String fileName = "All_About_Java.txt";

        try (FileWriter writer = new FileWriter(fileName);) { // here we use try with resource block.by using this java take full responsibility 

            writer.write("This is java developement.\n");
            // Write a * 1000 times
            for (int i = 0; i < 1000; i++) {
                 writer.write("*");
            }
            writer.flush();
            System.out.println("File Written Successfully");

        } catch (Exception e) {

            System.out.println(e.getMessage() + "Exception occured");

        }
    }
}
