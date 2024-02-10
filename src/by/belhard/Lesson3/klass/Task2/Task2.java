package by.belhard.Lesson3.klass.Task2;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N - ");
        int n = scanner.nextInt();
        System.out.print("Введите M - ");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = rnd.nextInt(100) ;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("for each");

        for (int [] i: array) {
            for (int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
