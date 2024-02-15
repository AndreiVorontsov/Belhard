package by.belhard.Lesson2.HomeWorkCycle.Task_1;

import java.util.Random;

/*
1.	Распечатать произвольное количество строк: “Task1”. “Task2”. ….
Используем цикл while
 */
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int quantity = rnd.nextInt(100);
        int counter = 0;

        while (counter <= quantity){
            counter++;
            System.out.println("Task" + counter);
        }
    }
}

