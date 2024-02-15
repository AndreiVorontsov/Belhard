package by.belhard.Lesson2.HomeWork1.Task_5;

import java.util.Scanner;

/*
Арифметические действия над числами пронумерованы следующим образом:
1 — сложение,
2 — вычитание,
3 — умножение,
4 — деление.
Дан номер действия N (целое число в диапазоне 1–4) и вещественные числа A и B (В не равно 0).
Выполнить над числами указанное действие и вывести результат.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("номер действия N - ");
        int n = scanner.nextInt();
        System.out.print("Введите вещественные числа A - ");
        double a = scanner.nextDouble();
        System.out.print("Введите вещественные числа B - ");
        double b = scanner.nextDouble();

        if (b == 0) {
            System.out.print("B - не может быть 0, Введите вещественные числа B - ");
            b = scanner.nextDouble();
        }
        switch (n) {
            case 1:
                System.out.print("a + b = ");
                System.out.println(a + b);
                break;
            case 2:
                System.out.print("a - b = ");
                System.out.println(a - b);
                break;
            case 3:
                System.out.print("a * b = ");
                System.out.println(a * b);
                break;
            case 4:
                System.out.print("a / b = ");
                System.out.println(a / b);
                break;
            default:
                System.out.println("Нет такого действия");
        }

    }
}

