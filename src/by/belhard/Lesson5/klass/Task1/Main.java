package by.belhard.Lesson5.klass.Task1;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis());
        Date yesterday = new Date();
        Date today = new Date();
       // DateFormat dateFormat = new DateFormat();

        SimpleDateFormat dateFormat = new SimpleDateFormat("'Time: 'HH:mm:ss ' Date :' dd.MM.yyyy");
        System.out.println(dateFormat.format(today));
    }
}
