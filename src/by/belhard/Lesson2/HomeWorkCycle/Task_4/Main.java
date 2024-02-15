package by.belhard.Lesson2.HomeWorkCycle.Task_4;

import java.util.Scanner;

/*
4.	Даны два целых числа A и B (A < B).
Вывести в порядке убывания все целые числа,
расположенные между A и B (не включая числа A и B),
а также количество N этих чисел
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите A - ");
        int a = scanner.nextInt();
        System.out.print("Введите B - ");
        int b = scanner.nextInt();
        if (a > b){
            System.out.println("B не может быть меньше A");
            System.out.print("Введите B - ");
            b = scanner.nextInt();
        }
        int n = 0;

        for (int i = b - 1; i > a ; i--) {
            System.out.print(i + ", ");
            n++;
        }
        System.out.println();
        System.out.println("количемтво чисел - " + n);

    }
}
