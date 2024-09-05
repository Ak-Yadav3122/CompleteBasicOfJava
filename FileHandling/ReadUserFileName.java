package FileHandling;

import java.util.*;
import java.io.*;
public class ReadUserFileName {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Enter Your file Name: ");
        String fileName = userInput.next();

        try (FileReader reader = new FileReader(fileName)) {

            int read;
            do{
                read = reader.read();
                System.out.print((char)read);
            }while(read != -1);
    
        } catch (Exception e) {
            System.out.print(e.getMessage()+" \nPlease enter the write path");
        }

        userInput.close();
    }
}
