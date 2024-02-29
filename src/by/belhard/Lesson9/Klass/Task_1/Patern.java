package by.belhard.Lesson9.Klass.Task_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку - ");
        String str = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");

        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

        if (matcher.find()){
            System.out.println("адрес введен верно");
        }else {
            System.out.println("адрес введен неверно!");
        }


    }
}
