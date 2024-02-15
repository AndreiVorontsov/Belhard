package by.belhard.Lesson2.HomeWorkCycle.Task_2;
/*
2.	Распечатать все числа от 1 до 100, которые делятся на 5 без остатка.
 Используем цикл do-while.
 */
public class Main {

    public static void main(String[] args) {
        int start = 1;
        int finish = 100;

        do {
            if (start % 5 == 0){
                System.out.print(start + ", ");
            }
            start++;
        } while (start <= finish);
    }
}

