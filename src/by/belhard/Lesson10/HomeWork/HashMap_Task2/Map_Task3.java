package by.belhard.Lesson10.HomeWork.HashMap_Task2;

/*
Задача 3:
Напишите метод, который получает на вход массив элементов типа К (Generic)
и возвращает Map<K, Integer>,
где K — значение из массива,
а Integer — количество вхождений в массив.
То есть сигнатура метода выглядит так:
<K> Map<K, Integer> arrayToMap(K[] ks);
То есть, если массив похож на {1,2,4,4}, то map будет выглядеть как {1:1, 2:1, 4:2}
*/
public class Map_Task3 {
    public static void main(String[] args) {
        Integer[] arrayInt = {1, 2, 4, 4};
        Array_K<Integer> skInt = new Array_K<>();
        skInt.entry(skInt.arrayToMap(arrayInt));

        String[] arrayString = {"Masha", "Andrei", "Pasha", "Andrei"};
        Array_K<String> skString = new Array_K<>();
        skString.entry(skString.arrayToMap(arrayString));
    }
}
