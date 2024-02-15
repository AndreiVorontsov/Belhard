package by.belhard.Lesson2.HomeWorkCycle.Task_7;

import java.util.Random;

/*
7.	Дано целое число N (> 0).
С помощью операций деления нацело и взятия остатка от деления:
определить имеется ли в записи числа N цифра «2»;
найти число, полученное при прочтении числа N справа налево;
найти количество и сумму его цифр.
Использовать можно любое количество циклов, но чем меньше, тем лучше
 */
public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(10000);
        System.out.println("N = " + n);
        boolean availableTwo = false;
        int two = 0;
        int summa = 0;
        int refers = 0;
        int counter = 0;

        for (int i = n; i / 10 >= 0; i /= 10) {
            if (i / 10 < 1) {
                two = i;
                if (two == 2) {
                    availableTwo = true;
                }
                summa += two;
                refers = refers * 10 + two;
                counter++;
                break;
            }
            two = i % 10;
            if (two == 2) {
                availableTwo = true;
            }
            summa += two;
            refers = refers * 10 + two;
            counter++;
        }

        if (availableTwo) {
            System.out.println("В числе N имеется число - 2");
        } else {
            System.out.println("В числе N нет числа - 2");
        }
        System.out.println("число N справа налево - " + refers);
        System.out.println("Количество цифр - " + counter);
        System.out.println("Сумма чисел - " + summa);


    }
}
