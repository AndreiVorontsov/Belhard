package by.belhard.Lesson3.HomeWorkArray.Task_7;

import java.util.Random;
import java.util.Scanner;

/*
7.	Создайте массив из N случайных целых чисел из отрезка [A;B], числа N, A и B вводятся с клавиатуры.
Отсортировать массив любым алгоритмом.
Вывести массив на экран, после чего ввести с клавиатуры число k,
найти индекс этого числа в массиве
сперва линейным поиском,
потом двоичным
и вывести на экран этот индекс, если число есть в массиве,
и количество «шагов», которое каждый алгоритм потратил на выполнение задачи.
Например:
Введите размер массива
9
Введите нижний диапазон
0
Введите верхний диапазон
10
Массив: 1, 2, 2, 3, 5, 6, 7, 8, 8
Введите искомое значение
3
Индекс элемента: 3
Линейный поиск: 4 шаг(-а)(-ов)
Двоичный поиск: 3 шаг(-а)(-ов)


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

        System.out.print("Введите нижний диапазон - ");
        int min = scanner.nextInt();
        System.out.print("Введите верхний диапазон - ");
        int max = scanner.nextInt();
        if (min >= max) {
            System.out.println("Не верный диапазон, введите диапазон: ");
            System.out.print("Введите нижний диапазон - ");
            min = scanner.nextInt();
            System.out.print("Введите верхний диапазон - ");
            max = scanner.nextInt();
        }

        int[] array = new int[length];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(max + 1 - min) + min;
        }

        int tmp;
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

        System.out.print('\n' + "Введите искомое значение - " );
        int k = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                System.out.println("Индекс элемента: " + i);
                System.out.println("Линейный поиск: " + (i + 1) +" шаг(-а)(-ов)");
                break;
            }
        }

        int counter = 0;
        int lowIndex = 0;
        int highIndex = array.length-1;

        while (lowIndex <= highIndex){
            counter++;
            int midIndex = (lowIndex + highIndex) / 2;
            if (k == array[midIndex]){
                System.out.println("Индекс элемента: " + midIndex + '\n' + "Двоичный поиск: " + counter + "шаг(-а)(-ов)" );
                break;
            }else if(k < array[midIndex]){
                highIndex = midIndex-1;
            }else if (k > array[midIndex]){
                lowIndex = midIndex+1;
            }
        }
    }
}
