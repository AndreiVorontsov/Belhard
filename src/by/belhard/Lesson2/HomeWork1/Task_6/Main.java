package by.belhard.Lesson2.HomeWork1.Task_6;

import java.util.Random;

/*
Дано целое число, лежащее в диапазоне 0–999.
Вывести строку-описание этого числа.
Строку-описание вида «четное двузначное число», «нечетное трехзначное число» и т. д.

 */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int rnd = random.nextInt(1000);
        String digNum;
        String checkEven;

        if (rnd / 1000 == 0){
            digNum = "трехзначное";
        }else if(rnd / 100 == 0){
            digNum = "двузначное";
        } else {
            digNum = "однозначное";
        }

        if (rnd % 2 != 0) {
            checkEven = "нечетное";
        } else {
            checkEven = "четное";
        }
        System.out.println(rnd + " - " + checkEven + " " + digNum + " число");

/*
        if (rnd > 99) {
            if (rnd % 2 != 0) {
                System.out.print(rnd);
                System.out.println(" - нечетное трехзначное число ");
            } else {
                System.out.print(rnd);
                System.out.println(" - четное трехзначное число ");
            }
        } else if (rnd > 9) {
            if (rnd % 2 != 0) {
                System.out.print(rnd);
                System.out.println(" - нечетное двузначное число ");
            } else {
                System.out.print(rnd);
                System.out.println(" - четное двузначное число ");
            }
        } else {
            if (rnd % 2 != 0) {
                System.out.print(rnd);
                System.out.println(" - нечетное однозначное число ");
            } else {
                System.out.print(rnd);
                System.out.println(" - четное однозначное число ");
            }
        }*/
    }
}

