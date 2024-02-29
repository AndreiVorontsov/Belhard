package by.belhard.Lesson2.HomeWork1.Task_8;

import java.util.Scanner;

/*
8.	Мастям игральных карт присвоены порядковые номера:
1 — пики,
2 — трефы,
3 — бубны,
4 — червы.
Достоинству карт, старших десятки, присвоены номера:
11 — валет,
12 — дама,
13 — король,
14 — туз.
Даны два целых числа:
N — достоинство (6 ≤ N ≤ 14) и
M — масть карты (1 ≤ M ≤ 4).
Вывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Достоинство карты - ");
        int n = scanner.nextInt();
        if (n < 6 || n > 14) {
            System.out.println("не верное Достоинство карты");
            System.out.print("Введите Достоинство карты - ");
            n = scanner.nextInt();
        }

        System.out.print("Введите номер масти - ");
        int m = scanner.nextInt();
        if (m < 1 || m > 4) {
            System.out.println("не верный номер масти");
            System.out.print("Введите номер масти - ");
            m = scanner.nextInt();
        }

        switch (n) {
            case 11:
                System.out.print("Валет ");
                break;
            case 12:
                System.out.print("Дама ");
                break;
            case 13:
                System.out.print("Король ");
                break;
            case 14:
                System.out.print("Туз ");
                break;
            default:
                System.out.print(n + " ");
        }
        switch (m) {
            case 1:
                System.out.println("пик");
                break;
            case 2:
                System.out.println("треф");
                break;
            case 3:
                System.out.println("бубен");
                break;
            case 4:
                System.out.println("червей");
                break;
        }

    }
}
