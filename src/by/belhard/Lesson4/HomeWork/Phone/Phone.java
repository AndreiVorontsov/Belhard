package by.belhard.Lesson4.HomeWork.Phone;
/*
-Создайте класс Phone, который содержит переменные number, model и weight.
-Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
-Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
-Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
-Добавить конструктор без параметров.
-Вызвать из конструктора с тремя параметрами конструктор с двумя.
-Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
 Вызвать этот метод.
 */
public class Phone {
int number;
String model;
double weight;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this.weight = weight;
        new Phone(number, model);
    }
    void receiveCall(String name){
    System.out.println("Звонит - " + name);
}

    void receiveCall(String name, int number){
        System.out.println("Звонит - " + name + " Number - " + number);
    }

int getNumber(){
     return number;
}

}
