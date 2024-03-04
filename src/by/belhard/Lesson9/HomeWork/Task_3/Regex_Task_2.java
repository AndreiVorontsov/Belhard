package by.belhard.Lesson9.HomeWork.Task_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
3.	Дана строка 'ahb acb aeb aeeb adcb axeb'.
Напишите регулярное выражение,
которое найдет строки ahb, acb, aeb по шаблону: буква 'a', любой символ, буква 'b'.
 */
public class Regex_Task_2 {
    public static void main(String[] args) {

        String str = "ahb acb aeb aeeb adcb axeb ab";

        Pattern pattern = Pattern.compile("a.b");

        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
