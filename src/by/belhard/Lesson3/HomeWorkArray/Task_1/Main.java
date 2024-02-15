package by.belhard.Lesson3.HomeWorkArray.Task_1;

import java.util.Random;

/*
1.	Создайте массив из 4 случайных целых чисел из отрезка [10;99],
выведите его на экран в строку.
Определить и вывести на экран сообщение о том,
является ли массив строго возрастающей последовательностью
 */
public class Main {

    public static void main(String[] args) {
        int[] array = new int[4];
        boolean ascSeq = true;
        Random rnd = new Random();
        int min = 10;
        int max = 100;

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(max + 1 - min) + min;

            if (i > 0) {
                if (array[i] < array[i - 1]) {
                    ascSeq = false;
                }
            }
        }

        for (int i : array) {
            System.out.print("[" + i + "] ");

        }

        System.out.println();
        if (ascSeq) {
            System.out.println("строго возрастающая последовательность");
        } else {
            System.out.println(" не строго возрастающая последовательность");
        }
    }
}
