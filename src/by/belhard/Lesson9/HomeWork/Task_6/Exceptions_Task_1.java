package by.belhard.Lesson9.HomeWork.Task_6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Исключения
Создайте новое исключение и назовите его IncorrectInfoException,
добавьте в него поля для возраста и ФИО.
Напишите программу, которая просит пользователя ввести ФИО через пробел и возраст.
Если Возраст больше 100 или меньше 0, то «бросать» IncorrectInfoException,
записывать в него данные пользователя и сообщение о том, что возраст некорректен.
Если ФИО длиннее 200 символов, или использовались символы пунктуации (.,!?& и тд),
то тоже бросать исключение и записывать в него сообщение о некорректности данных и сами данные.
В обработке исключения выводить на экран трассированный стек
 */
public class Exceptions_Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите FIO - ");
        String FIO = scanner.nextLine();
        System.out.println("Введите возраст - ");
        int age = scanner.nextInt();
        try {
            String result = personInfo(FIO, age);
            System.out.println(result);
        } catch (IncorrectInfoException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            ex.printStackTrace();
        }
    }

    public static String personInfo(String FIO, int age) throws IncorrectInfoException {
        if (age < 0 || age > 100) {
            throw new IncorrectInfoException("возраст некорректен", FIO, age);
        }

        Pattern pattern = Pattern.compile("^\\w+\\s\\w+\\s\\w+$", Pattern.UNICODE_CHARACTER_CLASS);

        Matcher matcher = pattern.matcher(FIO);
        if (!matcher.find()) {
            throw new IncorrectInfoException("Некорректное ФИО", FIO, age);
        }

        return "ФИО - " + FIO + "\nВозраст - " + age;
    }
}
