package Tregulov.work_with_files.programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SerializationEx1 {
    public static void main(String[] args) {
        ArrayList employees;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees1.bin")))
        {
            employees = (ArrayList) inputStream.readObject();
            System.out.println(employees);
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
