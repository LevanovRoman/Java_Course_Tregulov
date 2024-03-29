package Tregulov.work_with_files.programmer2;

import Tregulov.work_with_files.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee bestEmployee;
        try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin")))
        {
            bestEmployee = (Employee) inputStream.readObject();
            System.out.println(bestEmployee);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
