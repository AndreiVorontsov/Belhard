package by.belhard.Lesson5.HomeWork.LibrerExtra;

import by.belhard.Lesson5.HomeWork.Librery.Book;
import by.belhard.Lesson5.HomeWork.Librery.Reader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;
        Reader[] readers = new Reader[10];
        do {
            System.out.println("1 -- Добавить нового читателя");
            System.out.println("2 -- Читатель хочет взять книгу");
            System.out.println("3 -- Читатель хочет вернуть книгу");
            System.out.println("4 -- Вывести статус читателя");
            System.out.println("5 -- Вывести статусы всех читателей");
            System.out.println("6 -- выйти из программы");
            System.out.println("Введите номер действия ");
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1: {
                    boolean isFull = true; // true если в массиве нет места
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] == null) {
                            readers[i] = readers[i].addReader();
                            isFull = false;
                            break;
                        }
                    }
                    if (isFull) {
                        System.out.println("Количество читателей уже максимальное");
                    }
                    break;
                }
                case 2: {
                    Book book = new Book();
                    book.initBook();
                    System.out.println("Введите номер читательского билета: ");
                    int numberCard = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false; // если не удалось найти пользователя
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] != null && readers[i].getNumberCard() == numberCard){
                            readers[i].takeBook(book);
                            found = true;
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Введите название книги");
                    String nameBook = scanner.nextLine();
                    System.out.println("Введите номер читательского билета: ");
                    int numberCard = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] != null && readers[i].getNumberCard() == numberCard){
                            readers[i].returnBook(nameBook);
                            found = true;
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Введите номер читательского билета: ");
                    int numberCard = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] != null && readers[i].getNumberCard() == numberCard){
                            readers[i].printStatus();
                            found = true;
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 5: {
                    for (Reader r: readers) {
                        if (r != null) {
                            r.printStatus();
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Завершаем программу");
                break;
                }
                default:{
                    System.out.println("Нет такой команды");
                    break;
                }
            }
        } while (action != 6);
    }
}
