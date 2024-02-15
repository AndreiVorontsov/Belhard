package by.belhard.Lesson5.HomeWork.Librery;

import java.util.Scanner;

/*
1.	Определить класс Book,
в котором будут поля для названия книги (name), имени автора (authorName) и содержания (text).
 Содержание, для удобства, можно оставлять пустым
 */
public class Book {
    String name;
    String authorName;
    String text;

    public Book() {
    }

    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }
    public Book initBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        name = scanner.nextLine();
        System.out.println("Введите автора:");
        authorName = scanner.nextLine();
        return new Book(name,authorName);
    }
}
