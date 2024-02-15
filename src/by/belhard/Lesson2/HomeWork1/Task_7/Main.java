package by.belhard.Lesson2.HomeWork1.Task_7;

import java.util.Scanner;

/*
7.	Даны два целых числа: D (день) и M (месяц), определяющие правильную дату.
Вывести знак Зодиака, соответствующий этой дате:
«Водолей» (20.1–18.2),
«Рыбы» (19.2–20.3),
«Овен» (21.3–19.4),
«Телец» (20.4–20.5),
«Близнецы» (21.5–21.6),
«Рак»(22.6-22.7),
«Лев» (23.7–22.8),
«Дева» (23.8–22.9),
«Весы» (23.9–22.10),
«Скорпион» (23.10–22.11),
«Стрелец» (23.11–21.12),
«Козерог» (22.12–19.1).
*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число в месяце- ");
        int d = scanner.nextInt();
        if (d <= 0 || d > 31) {
            System.out.println("не верное число");
            System.out.print("Введите число в месяце- ");
            d = scanner.nextInt();
        }

        System.out.print("Введите номер месяца - ");
        int m = scanner.nextInt();
        if (m < 1 || m > 12) {
            System.out.println("не верный номер месяца");
            System.out.print("Введите номер месяца- ");
            m = scanner.nextInt();
        }

        switch (m) {
            case 1:
                if (d < 20) {
                    System.out.println("«Козерог»");
                } else {
                    System.out.println("«Водолей»");
                }
                break;
            case 2:
                if (d < 19) {
                    System.out.println("«Водолей»");
                } else {
                    System.out.println("«Рыбы»");
                }
                break;
            case 3:
                if (d < 21) {
                    System.out.println("«Рыбы»");
                } else {
                    System.out.println("«Овен»");
                }
                break;
            case 4:
                if (d < 20) {
                    System.out.println("«Овен»");
                } else {
                    System.out.println("«Телец»");
                }
                break;
            case 5:
                if (d < 21) {
                    System.out.println("«Телец»");
                } else {
                    System.out.println("«Близнецы»");
                }
                break;
            case 6:
                if (d < 22) {
                    System.out.println("«Близнецы»");
                } else {
                    System.out.println("«Рак»");
                }
                break;
            case 7:
                if (d < 23) {
                    System.out.println("«Рак»");
                } else {
                    System.out.println("Лев");
                }
                break;
            case 8:
                if (d < 23) {
                    System.out.println("Лев");
                } else {
                    System.out.println("«Дева»");
                }
                break;
            case 9:
                if (d < 23) {
                    System.out.println("«Дева»");
                } else {
                    System.out.println("«Весы»");
                }
                break;
            case 10:
                if (d < 23) {
                    System.out.println("«Весы» ");
                } else {
                    System.out.println("«Скорпион»");
                }
                break;
            case 11:
                if (d < 23) {
                    System.out.println("«Скорпион»");
                } else {
                    System.out.println("«Стрелец» ");
                }
                break;
            case 12:
                if (d < 22) {
                    System.out.println("«Стрелец» ");
                } else {
                    System.out.println("«Козерог»");
                }
                break;

        }
    }
}

