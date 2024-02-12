package work_with_files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyTest {
    public static void main(String[] args) throws IOException {
        try(FileReader reader = new FileReader("test.txt")){
            while(reader.ready()){
                System.out.print((char) reader.read());
            }
        }
    }
}
