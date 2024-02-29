package by.belhard.Lesson2.HomeWork1.Task_3;

import java.util.Scanner;

/*
Даны три числа,
каждое в своей переменной.
Найти сумму двух наибольших из них
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a - ");
        int a = scanner.nextInt();
        System.out.print("Введите число b - ");
        int b = scanner.nextInt();
        System.out.print("Введите число c - ");
        int c = scanner.nextInt();

        if (a <= b && a <= c) {
            System.out.print("b + c = ");
            System.out.println(b + c);
        } else if (b <= a && b <= c) {
            System.out.print("a + c = ");
            System.out.println(a + c);
        } else {
            System.out.print("b + a = ");
            System.out.println(b + a);
        }
    }
}
