package by.belhard.Lesson3.klass.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("рез");
        int temp = array[array.length-1];
        for (int i = array.length-1; i > 0; i--){
            array[i] = array[i-1];
        }
        array[0] = temp;
        for (int i: array) {
            System.out.println(i);
        }
    }
}
