package by.belhard.Lesson4.klass.Task2;

public class Person {
   private String name;
   private String surName;
   private int age;
   private String profession;

    Person() {
    }

    Person(String name, String surName, int age, String profession) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.profession = profession;
    }

    String getFullName() {
        return surName + " " + name;
    }

    public void printAgeGroup() {
        if (age < 0) {
            System.out.println("Некорректный возраст ");
            return;
        }
        if (age <= 12) {
            System.out.println("Детсво");
        } else if (age <= 17) {
            System.out.println("Юность");
        } else if (age <= 44) {
            System.out.println("Молодость");
        } else if (age <= 59) {
            System.out.println("Зрелость");
        } else if (age <= 74) {
            System.out.println("Пожилой возраст");
        } else if (age <= 90) {
            System.out.println("Старость");
        } else {
            System.out.println("Долгожитель");
        }
    }

   public static void printAgeGroup(int age) {
        if (age < 0) {
            System.out.println("Некорректный возраст ");
            return;
        }
        if (age <= 12) {
            System.out.println("Детсво");
        } else if (age <= 17) {
            System.out.println("Юность");
        } else if (age <= 44) {
            System.out.println("Молодость");
        } else if (age <= 59) {
            System.out.println("Зрелость");
        } else if (age <= 74) {
            System.out.println("Пожилой возраст");
        } else if (age <= 90) {
            System.out.println("Старость");
        } else {
            System.out.println("Долгожитель");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
