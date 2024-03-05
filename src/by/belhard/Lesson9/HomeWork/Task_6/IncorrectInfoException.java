package by.belhard.Lesson9.HomeWork.Task_6;

/*
Создайте новое исключение и назовите его IncorrectInfoException,
добавьте в него поля для возраста и ФИО.
 */
public class IncorrectInfoException extends Exception {
    private String FIO;
    private int age;

    public IncorrectInfoException(String message, String FIO, int age) {
        super(message);
        this.FIO = FIO;
        this.age = age;
    }

    @Override
    public String toString() {
        return "IncorrectInfoException{" +
                "FIO='" + FIO + '\'' +
                ", age=" + age +
                '}';
    }

    public String getFIO() {
        return FIO;
    }

    public int getAge() {
        return age;
    }
}
