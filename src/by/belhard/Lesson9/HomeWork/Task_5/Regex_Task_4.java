package by.belhard.Lesson9.HomeWork.Task_5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
5.	Выбрать существующие даты между 1000 и 2012 годом.
Секунды могут быть опущены.
В каждом месяце 30 дней.
То есть дата в определённом формате вводится с клавиатуры, после чего, с помощью регулярного выражения, определяется, существует такая дата, или нет. Пример:
2012/09/18 12:10 – существует
2012/24/18 12:10 – не существует
*/
public class Regex_Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату и время в формате yyyy/MM/dd HH:mm - между 1000 и 2012 годом");
        String dayTime = scanner.nextLine();
//        String dayTime = "2012/07/30 04:59";

        Pattern pattern = Pattern.compile("^(1[0-9]{3}|20(0[0-9]|1[0-2]))/(0[1-9]|1[0-2])/([0-2][0-9]|30)\\s([0-1][0-9]|2[0-3]):[0-5][0-9]$");

        Matcher matcher = pattern.matcher(dayTime);
        if (matcher.find()){
            System.out.println(matcher.group() + " – существует");
        }else{
            System.out.println(dayTime + " – не существует");
        }
    }
}
