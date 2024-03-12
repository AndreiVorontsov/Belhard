package by.belhard.Lesson11.HomeWork.Library_Serializ;
   /*Задача 2:
Добавите в проект Library отдельный класс FileUtil, у которого определите два статических метода:
•	boolean saveReadersList(List<Reader> readers >)
•	List<Reader> restoreReadersList()
Первый метод принимает в себя список читателей и сохраняет их всех в один файл и вызывается в конце программы (подсказка, сохранять в файл нужно не каждого читателя по очереди, а сразу весь список). В случае, если записать не получилось, выводит об этом сообщение в консоли.
Второй пытается считать из этого же файла список читателей и возвращает его, вызывается в начале программы. В случае, если считать не получилось, выводит об этом сообщение в консоль.
Таким образом у вас должна получиться программа, которая не теряет данные после её выключения/включения.
*/

import by.belhard.Lesson5.HomeWork.Librery.Book;
import by.belhard.Lesson5.HomeWork.Librery.Reader;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Library_Serial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int action;
        List<Reader> readers = FileUtil.restoreReadersList();
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
                    int size = readers.size();
                    if (size <= 10) {
                        readers.add(addReader());
                    } else {
                        System.out.println("Количество читателей уже максимальное");
                    }
                    break;
                }
                case 2: {
                    Book book = initBook();

                    System.out.println("Введите номер читательского билета: ");
                    int numberCard = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false; // если не удалось найти пользователя
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i) != null && readers.get(i).getNumberCard() == numberCard) {
                            readers.get(i).takeBook(book);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
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
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i) != null && readers.get(i).getNumberCard() == numberCard) {
                            readers.get(i).returnBook(nameBook);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Введите номер читательского билета: ");
                    int numberCard = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < readers.size(); i++) {
                        if (readers.get(i) != null && readers.get(i).getNumberCard() == numberCard) {
                            readers.get(i).printStatus();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                    }
                    break;
                }
                case 5: {
                    for (Reader r : readers) {
                        if (r != null) {
                            r.printStatus();
                        }
                    }
                    break;
                }
                case 6: {
                    if (FileUtil.saveReadersList(readers)) {
                        System.out.println("Завершаем программу");
                        break;
                    } else {
                        System.out.println("Не удалось создать файл");
                        break;
                    }
                }
                default: {
                    System.out.println("Нет такой команды");
                    break;
                }
            }
        } while (action != 6);
    }

    public static Book initBook() {
        String name;
        String authorName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название книги: ");
        name = scanner.nextLine();
        System.out.println("Введите автора:");
        authorName = scanner.nextLine();
        return new Book(name, authorName);
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
}


