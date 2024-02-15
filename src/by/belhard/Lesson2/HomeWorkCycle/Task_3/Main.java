package by.belhard.Lesson2.HomeWorkCycle.Task_3;

import java.util.Scanner;

/*
3.	Реализовать подсчет факториала используя цикл for. Результат вывести на экран
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число - ");
        int a = scanner.nextInt();
        int b = 1;

        for (int i = 1; i <= a; i++) {
            b *= i;
        }
        System.out.println( a + "! = " + b);
    }
}
