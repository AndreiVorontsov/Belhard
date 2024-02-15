package by.belhard.Lesson2.HomeWork1.Task_4;

import java.util.Scanner;

/*
Дан номер года (положительное целое число).
Определить количество дней в этом году,
учитывая,
что обычный год насчитывает 365 дней,
а високосный — 366 дней.
Високосным считается год, делящийся на 4,
за исключением тех годов, которые делятся на 100 и не делятся на 400
(например, годы 300, 1300 и 1900 не являются високосными, а 1200 и 2000 — являются).
*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год - ");
        int age = scanner.nextInt();

        if (age % 4 == 0) {
            if (age % 100 == 0 & age % 400 != 0) {
                System.out.println("Количество дней в году - 365");
            } else {
                System.out.println("Количество дней в году - 366");
            }
        } else {
            System.out.println("Количество дней в году - 365");
        }
    }
}

