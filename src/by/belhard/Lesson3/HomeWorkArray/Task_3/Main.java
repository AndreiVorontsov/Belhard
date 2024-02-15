package by.belhard.Lesson3.HomeWorkArray.Task_3;

import java.util.Random;
import java.util.Scanner;

/*
3.	Создайте массив из N случайных целых чисел из отрезка [A;B],
числа N, A и B вводятся с клавиатуры.
Определите какой элемент является в этом массиве максимальным и сообщите его индекс
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
        int maxIndex = 0;
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(max + 1 - min) + min;
            if (i > 0) {
                if (array[i] > array[i - 1]) {
                    maxIndex = i;
                    maxElement = array[i];
                }
            }
        }

        for (int i : array) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();
        System.out.println("Индекс максимального элемента - " + maxIndex);
        System.out.println("Максимальный элемент массива - " + maxElement);
    }
}
