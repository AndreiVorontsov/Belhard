package by.belhard.Lesson2.klasss.Exercice3;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива - ");
        int length = scanner.nextInt();

        Random rnd = new Random();
        int[] array = new int[length];

        int min = 10;
        int max = 100;

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(min) + max;
        }

        for (int i: array) {
            System.out.println(i);
        }

    }
}
