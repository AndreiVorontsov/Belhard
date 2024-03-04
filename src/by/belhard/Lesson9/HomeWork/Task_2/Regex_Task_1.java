package by.belhard.Lesson9.HomeWork.Task_2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2.	Регулярное выражение, описывающее ссылку
Создать программу, которая, используя регулярное выражение,
умеет в тексте распознавать ссылку, заканчивающуюся на .com.
Текст можно вводить с клавиатуры
*/
public class Regex_Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку - ");
        String str = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\S+\\.com");

        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
