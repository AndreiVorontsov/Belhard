package by.belhard.Lesson2.HomeWork1.Task_1;
import java.util.Scanner;

/*
	Создать программу,
	проверяющую и сообщающую на экран,
	является ли целое число,
	записанное в переменную n,
	чётным либо нечётным
	 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число - ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " - четное число");
        } else {
            System.out.println(n + " - нечетное число");
        }

    }
}
