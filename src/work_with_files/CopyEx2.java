package work_with_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("Image-1.jpeg");
            FileOutputStream outputStream = new FileOutputStream("Test4.jpeg")
        ) {
            int i;
            while((i=inputStream.read()) != -1){
                outputStream.write(i);
            }
            System.out.println("DONE!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
