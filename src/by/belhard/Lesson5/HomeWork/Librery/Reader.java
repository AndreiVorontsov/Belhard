package by.belhard.Lesson5.HomeWork.Librery;

import java.time.LocalDate;
import java.util.Scanner;

/*
Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
- ФИО (можно одно поле, можно три)
- номер читательского билета
- факультет
- дата рождения
- телефон
- список взятых книг (массив из Book на 10 элементов)
- Методы takeBook, returnBook, printStatus.
Перегрузить методы:
- printStatus, который будит выводить информацию о читателе в формате
 «Петров В. В. взял 3 книги: Мастер и Маргарита, Война и Мир, Люпен»,
 т.е. сперва имя фамилию, потом инициалы имени и отчества,
 после чего двоеточие и перечисление через запятую названий книг, которые сейчас находятся у читателя
- takeBook, который будет принимать объект Book,
 добавлять его в массив взятых книг и выводить на экран сообщение формата «Петров В.В. взял книгу Игра Эндера»
- returnBook, который будет принимать название книги.
Если такая книга хранится у читателя, убрать её из массива и вывести сообщение формата
«Петров В.В. вернул книгу Игра Эндера».
Если же такой книги в читателя нет, вывести сообщение формата
«Петров В.В. не хранит книгу Игра Эндера»
 */
public class Reader {
    String name;
    String patronymic;
    String surName;
    int numberCard;
    String faculty;
    LocalDate birthday;
    int numberPhone;
    Book[] book = new Book[10];

    public Reader() {
    }

    public Reader(String name, String patronymic, String surName, int numberCard, String faculty, LocalDate birthday, int numberPhone) {
        this.name = name;
        this.patronymic = patronymic;
        this.surName = surName;
        this.numberCard = numberCard;
        this.faculty = faculty;
        this.birthday = birthday;
        this.numberPhone = numberPhone;
    }

    public void printStatus() {
        printStatus(surName, name, patronymic);
    }

    public void takeBook() {

    }

    public void returnBook() {
    }

    public void printStatus(String surName, String name, String patronymic) {
        int counter = 0;
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                counter++;
            }
        }

        if (counter == 2 || counter == 3 || counter == 4){
            System.out.print(surName + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ". " + "на руках " + counter + " книги: ");
        }else if(counter == 1){
            System.out.print(surName + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ". " + "на руках " + counter + " книга: ");
        }else {
            System.out.print(surName + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ". " + "на руках " + counter + " книг: ");
        }

        for (int i = 0; i < 10; i++) {
            if (book[i] != null) {
                System.out.print(book[i].name + ",");
            }
        }
        System.out.println();
    }

    public void takeBook(Book book) {
        for (int i = 0; i < this.book.length; i++) {
            if (this.book[i] == null) {
                this.book[i] = book;
                System.out.println(surName + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ". " + "взял книгу - " + book.name);
                return;
            }
        }
    }

    public void returnBook(String bookName) {
        int index = -1;
        for (int i = 0; i < book.length; i++) {
            if (book[i] != null) {
                if (book[i].name.equals(bookName)) {
                    index = i;
                }
            }
        }
        if (index >= 0) {
            book[index] = null;
            System.out.println(surName + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ". " + "вернул книгу - " + bookName);
        } else {
            System.out.println(surName + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ". " + "не хранит книгу - " + bookName);

        }
    }

    public static Reader addReader() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные читателя");
        System.out.println("Введите фамилию: ");
        String surName = scanner.nextLine();
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите отчество: ");
        String patronymic = scanner.nextLine();
        System.out.println("Введите номер читательского билета: ");
        int numberCard = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Введите факультет: ");
        String faculty = scanner.nextLine();
        int year;
        int mon;
        int day;
        System.out.println("Введите дату рождения:");
        System.out.print("Год ");
        year = scanner.nextInt();
        System.out.print("Месяц ");
        mon = scanner.nextInt();
        System.out.print("День ");
        day = scanner.nextInt();
        LocalDate birthday = LocalDate.of(year, mon, day);
        System.out.println("Введите номер телефрна");
        int numberPhone = scanner.nextInt();
        return new Reader(name, patronymic, surName, numberCard, faculty, birthday, numberPhone);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Book[] getBook() {
        return book;
    }

    public void setBook(Book[] book) {
        this.book = book;
    }
}
