package by.belhard.Lesson2.HomeWorkCycle.Task_6;

import java.util.Scanner;

/*
6.	Даны положительные числа A, B, C.
На прямоугольнике размера A × B размещено максимально возможное количество квадратов со стороной C (без наложений).
Найти количество квадратов, размещенных на прямоугольнике.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите  длину отрезка A - ");
        int a = scanner.nextInt();
        System.out.print("Введите длину отрезка  B - ");
        int b = scanner.nextInt();
        System.out.print("Введите длину отрезка  C - ");
        int c = scanner.nextInt();

        while (a < c || b < c) {
            System.out.println("C не может быть больше A или B");
            System.out.print("Введите длину отрезка C - ");
            c = scanner.nextInt();
        }

        int counterC = 0;

        for (int i = a; i >= c; i -= c) {
            for (int j = b; j >= c; j -= c) {
                counterC++;
            }
        }
        System.out.println("Количество квадратов со стороной C = " + counterC);
    }
}
