package by.belhard.Lesson3.HomeWorkArray.Task_5;

import java.util.Random;
import java.util.Scanner;

/*
5.	Создать и проинициализировать массив из 20 элементов.
Ввести с клавиатуры число n и найти, есть ли оно в массиве,
и, если есть, вывести его индекс на экран.
Использовать линейный поиск
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 20;
        int min = 1;
        int max = 30;
        int[] array = new int[length];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(max + 1 - min) + min;
            System.out.print("[" + array[i] + "]");
        }

        System.out.print('\n' + "Введите число N - " );
        int n = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                System.out.println("В массиве число " + n + " с индексом - " + i);
            }
        }

    }
}
