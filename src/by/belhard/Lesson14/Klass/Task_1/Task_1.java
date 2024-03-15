package by.belhard.Lesson14.Klass.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Name1","SurName1", 23));
        persons.add(new Person("Name2","SurName2", 3));
        persons.add(new Person("Name3","SurName3", 13));
        persons.add(new Person("Name4","SurName4", 26));

        persons.stream().filter(p->p.getAge()>=18).forEach(System.out::println);
    }
}
