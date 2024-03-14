package Tregulov.work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("student.txt", "rw")){
            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();
            System.out.println(s1);

//            установить курсор на позицию 101
            file.seek(101);
            String s2 = file.readLine();
            System.out.println(s2);
//            найти позицию курсора
            long position = file.getFilePointer();
            System.out.println(position);

//            file.seek(0);
//            file.writeBytes("privet");

            file.seek(file.length());
            file.writeBytes("\n\t\t\t\t\tWilliam Yeats");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
