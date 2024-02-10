package by.belhard.Lesson4.klass.Task1;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.print("Введите Имя - ");
        person.name = scanner.nextLine();
        System.out.print("Введите Фамилию - ");
        person.surName = scanner.nextLine();
        System.out.print("Введите Професию - ");
        person.profession = scanner.nextLine();
        System.out.print("Введите возраст - ");
        person.age = scanner.nextInt();


        System.out.println("Имя " + person.name +
                            '\n' + "Фамилия " + person.surName +
                            '\n' + "Професия "+ person.profession +
                            '\n' + "Возраст " + person.age);


    }
}
