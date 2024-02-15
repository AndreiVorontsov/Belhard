package by.belhard.Lesson4.HomeWork.Array;

import java.util.Random;

/*
Класс-оболочка для массива чисел
Определить класс IntArray, который будет в себе содержать в качестве поля массив чисел.
Создать для такого класса конструкторы, в которые можно передавать количество элементов массива, уже готовый массив.
Создать конструктор без параметров, который будет создавать массив из 10 элементов.
Добавить в класс метод сортировки sort (любой на выбор),
который в себя принимает в качестве параметра boolean значение,
если оно положительное (true), то массив внутри объекта сортируется по возрастанию,
если отрицательное (false), то по убыванию.
Добавить методы, с помощью которых можно будет работать с внутренним массивом без прямого обращения к нему (геттеры, сеттеры и тд)
*/
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array1 = new int[10];
        int min = 10;
        int max = 100;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = rnd.nextInt(max + 1 - min) + min;
        }
        for (int a : array1
        ) {
            System.out.print("[" + a + "]");
        }

        System.out.println();
        IntArray intArray1 = new IntArray(array1);
        intArray1.sort(true);
        array1 = intArray1.getArray();
        for (int a : array1
        ) {
            System.out.print("[" + a + "]");
        }
        System.out.println();
        intArray1.setArray(array1);
        array1 = intArray1.getArray();
        for (int a : array1
        ) {
            System.out.print("[" + a + "]");
        }
    }
}
