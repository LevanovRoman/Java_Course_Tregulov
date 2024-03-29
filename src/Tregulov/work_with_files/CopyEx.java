package Tregulov.work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("list.txt"))){
//            int character;
//            while((character= reader.read()) != -1){
//                writer.write(character);

            String line;
            while ((line= reader.readLine()) != null){
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("DONE!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
