package by.belhard.Lesson8.HomeWork.VetClinic;
/*
В класс Animal добавить поля name (кличка питомца) и age (возраст питомца) и геттеры с сеттерами для них,
добавить абстрактный метод makeNoise(),
 */
public abstract class Animal {
    private String name;
    private int age;

    abstract void makeNoise();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
