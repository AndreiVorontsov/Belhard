package by.belhard.Lesson2.HomeWork1.Task_2;
/*
Создать программу,
в которой проинициализировать переменную типа int,
после чего вывести на экран день недели,
соответствующий этому числу (1 – понедельник, 3 – среда и тд),
если такого дня нет, вывести надпись, что такого дня нет.
Сделать реализацию через if-else и через switch

 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер дня недели - ");
        int day = scanner.nextInt();

        System.out.println("if-else");
        if (day == 1) {
            System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        } else if (day == 4) {
            System.out.println("Четверг");
        } else if (day == 5) {
            System.out.println("Пятница");
        } else if (day == 6) {
            System.out.println("Суббота");
        } else if (day == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Нет такого дня");
        }

        System.out.println("switch");
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Нет такого дня");
        }
    }
}

