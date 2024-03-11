package by.belhard.Lesson11.Klass.Task_2;

import java.io.*;

/*
Напишите программу, которая пытается открыть файл с названием «test.txt».
Если такой файл есть, то программа просто выводит содержимое на экран,
если нет, то она его создаёт и записывает туда любой текст
(Можно стандартную строку, можно введенную с клавиатуры).
Используя - BufferedReader и BufferedWriter
*/
public class BuffFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/andrejvoroncov/Andrei/text.txt"))) {

            String s;
            StringBuilder sb = new StringBuilder();
            while ((s = reader.readLine()) != null) {
                sb.append(s);
            }
            System.out.println(sb.toString());
            return;
        } catch (IOException ex) {
            System.out.println("Файл не существует");
        }
        String text = "Some text Buff";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/andrejvoroncov/Andrei/text.txt"))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
