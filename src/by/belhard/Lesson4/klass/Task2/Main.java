package by.belhard.Lesson4.klass.Task2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Имя - ");
        String name = scanner.nextLine();
        System.out.print("Введите Фамилию - ");
        String surName = scanner.nextLine();
        System.out.print("Введите Професию - ");
        String profession = scanner.nextLine();
        System.out.print("Введите возраст - ");
        int age = scanner.nextInt();
        System.out.print("Введите возраст 2 - ");
        int age2 = scanner.nextInt();

        Person person = new Person(name, surName, age, profession);

        System.out.println(person.getFullName());
        person.printAgeGroup();

        person.printAgeGroup(age2);

        Person person1 = new Person();
        person1.setAge(age);
        person1.setName(name);
        person1.setSurName(surName);
        person1.setProfession(profession);
        System.out.println(person1.getAge() + person1.getName() + person1.getSurName() + person1.getProfession());

        Person.printAgeGroup(age);
    }


}
