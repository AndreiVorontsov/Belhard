package by.belhard.Lesson9.HomeWork.Task_1;

import java.util.Scanner;

/*
1.	Составляем строку с помощью класса StringBuilder
Дано два числа, например 3 и 56, необходимо составить следующие строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168.
Используем метод StringBuilder.append().
Замените символ “=” на слово “равно”. Используйте метод StringBuilder.replace()


 */
public class String_Builder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число \"a\"- ");
        int a = scanner.nextInt();
        System.out.print("Введите число \"b\"- ");
        int b = scanner.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d + %d = %d \n", a, b, sum(a,b)));
        sb.append(String.format("%d - %d = %d \n", a, b, subtraction(a,b)));
        sb.append(String.format("%d * %d = %d \n", a, b, multiplication(a,b)));
        System.out.println(sb.toString());

        while (sb.indexOf("=") >= 0){
            int c = sb.indexOf("=");
            sb.replace(c,c+1,"равно");
        }
        System.out.println(sb.toString());
    }

   public static int sum(int a, int b){
        return a + b;
   }

   public static int subtraction(int a, int b){
        return a - b;
   }

   public static int multiplication(int a, int b){
        return a * b;
   }
}
