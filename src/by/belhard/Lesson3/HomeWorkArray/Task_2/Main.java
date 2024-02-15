package by.belhard.Lesson3.HomeWorkArray.Task_2;

import java.util.Random;
import java.util.Scanner;

/*
2.	Попросить пользователя ввести с клавиатуры сперва размер массива,
потом нижний диапазон значений и верхний.
После чего создать массив размером, который ввел пользователь
и заполнить его случайными числами из диапазона, введенного пользователем.
Если пользователь ввел неверные значения (отрицательный размер массива, нижняя граница диапазона больше верхнего и т.д.)
попросить его ввести значение ещё раз и перезаписать старое значение новым.
Вывести массив на экран (Для этого удобнее пользоваться не println, а print)
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива - ");
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

        for (int i : array) {
            System.out.print("[" + i + "] ");
        }

    }
}
