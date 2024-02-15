package by.belhard.Lesson3.HomeWorkString.Task_2;
import java.util.Scanner;

/*
2.	С клавиатуры вводится любая строка.
Если она пустая, выводится сообщение с просьбой повторить ввод.
Далее с клавиатуры вводятся два символа (a и b),
после чего нужно вывести строку, в которой все символы "a" нужно заменить на символы "b".
Пример: срока – «Java 11», символы «1» и «H», результат «Java HH»
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку - ");
        String str = scanner.nextLine();
        if (str.isEmpty()) {
            System.out.println("Пустая строка");
            System.out.print("Введите строку - ");
            str = scanner.nextLine();
        }

        System.out.print("Введите символ который нужно заменить - ");
        String symbolA = scanner.next();
        char symbolAChar = symbolA.charAt(0);

        System.out.print("Введите символ на который нужно заменить - ");
        String symbolB = scanner.next();
        char symbolBChar = symbolB.charAt(0);


        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == symbolAChar) {
                charArray[i] = symbolBChar;
            }
        }
        str = new String(charArray);
        System.out.println("Результат: " + str);
    }
}
