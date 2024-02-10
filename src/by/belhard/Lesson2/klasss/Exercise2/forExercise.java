package by.belhard.Lesson2.klasss.Exercise2;

public class forExercise {
    public static void main(String[] args) {
        for (int i = 7; i != -1; i--) {
            System.out.println(i);
        }

        System.out.println("While");
        int i = 7;
        while (i != -1) {
            System.out.println(i);
            i--;
        }

        System.out.println("Do");
        i = 7;
        do {
            System.out.println(i);
            i--;
        } while (i != -1);

    }
}
