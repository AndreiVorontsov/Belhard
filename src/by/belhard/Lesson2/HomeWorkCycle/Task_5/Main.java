package by.belhard.Lesson2.HomeWorkCycle.Task_5;

import java.util.Scanner;

/*
5.	Даны положительные числа A и B (A > B).
На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
Не используя операции умножения и деления, найти длину незанятой части отрезка A.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  длину отрезка A - ");
        int a = scanner.nextInt();
        System.out.print("Введите длину отрезка  B - ");
        int b = scanner.nextInt();

        while (a < b) {
            System.out.println("B не может быть больше A");
            System.out.print("Введите длину отрезка B - ");
            b = scanner.nextInt();
        }

        do {
            a = a - b;
        } while (a >= b);

        System.out.println("Длина незанятой части отрезка A = " + a);
    }
}
