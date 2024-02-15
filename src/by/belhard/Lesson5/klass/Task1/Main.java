package by.belhard.Lesson5.klass.Task1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println(System.currentTimeMillis());
       // Date yesterday = new Date();
      //  Date today = new Date();
       //DateFormat dateFormat = new DateFormat();

        SimpleDateFormat dateFormat = new SimpleDateFormat("'Time: 'HH:mm:ss ' Date :' dd.MM.yyyy");

      //  System.out.println(dateFormat.format(today));

        LocalDate birthday;
        int age;
        int mon;
        int day;
        System.out.println("Введите дату рождения:");
        System.out.print("Год ");
        age = scanner.nextInt();
        System.out.print("Месяц ");
        mon = scanner.nextInt();
        System.out.print("День ");
        day = scanner.nextInt();
        birthday = LocalDate.of(age,mon,day);
        System.out.println(birthday);
        //System.out.println(dateFormat.format(date));
    }
}
