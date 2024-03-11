package by.belhard.Lesson11.HomeWork.Task_1;

import java.io.*;

/*
Задача 1:
У вас есть каталог, в котором находится произвольное количество текстовых файлов.
Нужно написать программу, которая имея путь к этому каталогу по очереди проходится и считывает информацию из каждого файла,
 при этом дозаписывая её в новый файл (result.txt).
 Таким образом в файле result.txt в результате работы программы должен быть собран текст из всех файлов в каталоге.
 Например, в файле «some file 1.txt» записано «hello », а в файле «some file 2.txt» записано «world!»,
 таким образом в файле result.txt будет записано «hello world!»
*/
public class Task_1 {
    public static void main(String[] args) {

        File files = new File("/Users/andrejvoroncov/Andrei/Belhard/test/");
        String s;
        StringBuilder sb = new StringBuilder();

        for (File file : files.listFiles()) {
            if (file.isHidden()) {
            } else {
                if (file.getName().equals("result.txt")) {
                    System.out.println("\"result.txt\" - уже существует");
                    return;
                }
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

                    while ((s = reader.readLine()) != null) {
                        sb.append(s);
                    }

                } catch (IOException ex) {
                    System.out.println("Файл не существует");
                }

            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/andrejvoroncov/Andrei/Belhard/test/result.txt"))) {
            writer.write(sb.toString());
            System.out.println("Содержимое файлов записано в \"result.txt\"");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
