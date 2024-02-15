package by.belhard.Lesson3.HomeWorkArray.Task_4;

import java.util.Random;
import java.util.Scanner;

/*
4.	Создайте массив из N случайных целых чисел из отрезка [A;B],числа N, A и B вводятся с клавиатуры.
 Выведите массив на экран,
 после чего отсортируйте его с помощью сортировки «пузырьком»
 и выведите уже отсортированный массив
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива N - ");
        int length = scanner.nextInt();
        if (length < 0) {
            System.out.println("Размер массива не может быть отрицательным");
            System.out.print("Введите размер массива - ");
            length = scanner.nextInt();
        }

        System.out.print("Введите A - ");
        int min = scanner.nextInt();
        System.out.print("Введите B - ");
        int max = scanner.nextInt();
        if (min >= max) {
            System.out.println("Не верный диапазон, введите диапазон: ");
            System.out.print("Введите A - ");
            min = scanner.nextInt();
            System.out.print("Введите B - ");
            max = scanner.nextInt();
        }

        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(max + 1 - min) + min;
        }

        for (int i : array) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();

        int tmp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i : array) {
            System.out.print("[" + i + "] ");
        }

    }
}
