package by.belhard.Lesson3.HomeWorkString.Task_1;
import java.util.Scanner;

/*
1.	Написать программу, в которой вводятся с клавиатуры сперва строка, а потом символ.
После чего в консоль выводится количество вхождений символа в строку.
Например, строка «Java 11», символ «a», результат: 2
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку - ");
        String str = scanner.nextLine();

        System.out.print("Введите символ - ");
        String symbol = scanner.next();
        char symbolChar = symbol.charAt(0);

        int counter = 0;
        char[] charArray = str.toCharArray();
        for (char i : charArray) {
            if (i == symbolChar) {
                counter++;
            }
        }
        System.out.println("результат: " + counter);
    }
}
