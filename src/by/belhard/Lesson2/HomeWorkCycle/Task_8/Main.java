package by.belhard.Lesson2.HomeWorkCycle.Task_8;

import java.util.Scanner;

/*
8.	Начальный вклад в банке равен 1000 руб.
Через каждый месяц размер вклада увеличивается на P процентов от имеющейся суммы (P — вещественное число, 0<P< 25).
По данному P определить, через сколько месяцев размер вклада превысит 1100 руб.,
и вывести найденное количество месяцев K (целое число) и итоговый размер вклада S (вещественное число).
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите процент по вкладу - ");
        double p = scanner.nextDouble();

        while (p <= 0 || p > 25) {
            System.out.println("Ввели не верный процент - допустимо (0<P< 25) ");
            System.out.print("Введите процент по вкладу - ");
            p = scanner.nextDouble();
        }

        double s = 1000;
        int k = 0;

        for (; s <= 1100; s = s + s * p / 100) {
            k++;
        }

        System.out.println("количество месяцев - " + k);
        System.out.println("итоговый размер вклада - " + s);
    }
}
