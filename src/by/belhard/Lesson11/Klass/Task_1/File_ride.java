package by.belhard.Lesson11.Klass.Task_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Напишите программу, которая пытается открыть файл с названием «test.txt».
Если такой файл есть, то программа просто выводит содержимое на экран,
если нет, то она его создаёт и записывает туда любой текст
(Можно стандартную строку, можно введенную с клавиатуры).
*/
public class File_ride {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("/Users/andrejvoroncov/Andrei/text.txt")){
            int i;
            StringBuilder sb = new StringBuilder();
            while((i = fis.read())!=-1){
                sb.append((char) i);
            }
            System.out.println(sb.toString());
            return;
        }
        catch(IOException ex) {
            System.out.println("Файл не существует");
        }
        String text = "Some text";
        try(FileOutputStream fos = new FileOutputStream("/Users/andrejvoroncov/Andrei/text.txt")){
            fos.write(text.getBytes(),0,text.getBytes().length);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
