package by.belhard.Lesson9.HomeWork.Task_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
4.	Дана строка 'ab abab abab abababab abea'.
Напишите регулярное выражение,
которое найдет строки по шаблону: строка 'ab' повторяется 1 или более раз.
 */
public class Regex_Task_3 {
    public static void main(String[] args) {
        String str = "ab abab abab abababab abea asdf";

        Pattern pattern = Pattern.compile("\\w*ab+\\w*");

        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
