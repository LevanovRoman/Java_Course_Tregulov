package Tregulov.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\n" +
                "Непонятного нет для меня под луной.\n" +
                "Мне известно, что мне ничего не известно, —\n" +
                "Вот последний секрет из постигнутых мной.";
        String s = "privet";
        FileWriter writer = null;
        try{
//            writer = new FileWriter("C:\\Users\\10390\\Desktop\\TRY\\JAVA_Course_Tregulov\\test1.txt");
            writer = new FileWriter("test2.txt", true);
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
//            writer.write(rubai);
            writer.write(s);
            System.out.println("DONE!");
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {
            writer.close();
        }


    }
}
