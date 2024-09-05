package FileHandling;

import java.io.FileReader;
public class FileReaderUse {
    public static void main(String[] args) {
          String fileName = "All_About_Java.txt";

    try(FileReader reader = new FileReader(fileName)){
        int read;
        do{
            read = reader.read();
            System.out.print((char)read);
        }while(read != -1);

    }
    catch (Exception e) {
        System.out.println(e.getMessage() + "exception occured");
    }
    }
  
}
