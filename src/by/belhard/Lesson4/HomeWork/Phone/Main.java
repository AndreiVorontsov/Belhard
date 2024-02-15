package by.belhard.Lesson4.HomeWork.Phone;

/*
Класс Phone.
1.	Создайте класс Phone, который содержит переменные number, model и weight.
2.	Создайте три экземпляра этого класса.
3.	Выведите на консоль значения их переменных.
4.	Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
    Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
5.	Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
6.	Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
7.	Добавить конструктор без параметров.
8.	Вызвать из конструктора с тремя параметрами конструктор с двумя.
9.	Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
    Вызвать этот метод.
10.	Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
    которым будет отправлено сообщение.
    Метод выводит на консоль номера этих телефонов

 */
public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.number = 8029123;
        phone1.model = "iPhone 14";
        phone1.weight = 175.3;

        Phone phone2 = new Phone();
        phone2.number = 8033124;
        phone2.model = "Samsung";
        phone2.weight = 180.4;

        Phone phone3  = new Phone();
        phone3.number = 8044125;
        phone3.model = "Xiaomi";
        phone3.weight = 158.9;

        Phone[] phones = new Phone[3];
        phones[0] = phone1;
        phones[1] = phone2;
        phones[2] = phone3;

        for (Phone i : phones) {
            System.out.println("Phone" + '\n' + "Number - " + i.number + '\n' + "Model - " + i.model + '\n' + "Weight - " + i.weight);
        }

        phone1.receiveCall("Andrei");
        System.out.println("Number - " + phone1.getNumber());

        phone2.receiveCall("Lesha");
        System.out.println("Number - " + phone2.getNumber());

        phone3.receiveCall("Anna");
        System.out.println("Number - " + phone3.getNumber());

        phone1.receiveCall("Andrei", phone1.getNumber());
        phone2.receiveCall("Lesha", phone2.getNumber());
        phone3.receiveCall("Anna", phone3.getNumber());

        Main.sendMessage(phone1.getNumber(), phone2.getNumber(), phone3.getNumber());

    }

    public static void sendMessage(int ... number){
        System.out.println("Будет отправлено сообщение:");
        for (int n : number) {
            System.out.println("- " + n);
        }
    }
}
