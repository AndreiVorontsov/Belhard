package by.belhard.Lesson8.HomeWork.VetClinic;
/*
Поликлиника
Создать программу, которая реализует работу поликлиники.
В программе должна быть иерархия классов для животных:
абстрактный класс Animal в качестве родителя, классы Cat, Dog, Rat в качестве наследников.
В класс Animal добавить поля name (кличка питомца) и age (возраст питомца) и геттеры с сеттерами для них,
добавить абстрактный метод makeNoise(),
который в последствии реализовать во всех наследниках и который должен выводить на экран сообщения,
подобающие каждому животному (у котов Мяу, у собак Гав и тд)

 */
public class VetClinic {
    public static void main(String[] args) {
    Animal dog1 = new Dog();
    Animal cat1 = new Cat();
    Animal rat1 = new Rat();

    dog1.setName("Бобик");
    dog1.setAge(4);

    cat1.setName("Мурка");
    cat1.setAge(6);

    rat1.setName("Венсдей");
    rat1.setAge(2);

    Animal[] animals = new Animal[3];
    animals[0] = dog1;
    animals[1] = cat1;
    animals[2] = rat1;
        for (Animal i: animals) {
            System.out.print('\n' + "Кличка "+ i.getName() + '\n' + " Возраст " + i.getAge() + '\n' + " Издает звук - "  ) ;
            i.makeNoise();
        }


    }
}
