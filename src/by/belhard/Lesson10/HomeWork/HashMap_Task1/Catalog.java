package by.belhard.Lesson10.HomeWork.HashMap_Task1;

import java.util.HashMap;
import java.util.Map;

/*
Задача 2:
Создайте HashMap, содержащий пары значений – код товара и объект товара
(класс Product определите сами, но в нём должно быть, как минимум название).
Перебрать и распечатать пары значений - entrySet().
Перебрать и распечатать набор из имен продуктов - keySet().
Перебрать и распечатать значения продуктов - values().
Для каждого перебора создать свой метод.
*/
public class Catalog {
    public static void main(String[] args) {
    Product product1 = new Product("Coffee", 15);
    Product product2 = new Product("Tea", 10);
    Product product3 = new Product("Juice", 20);

        Map<Integer,Product> catalog = new HashMap<Integer,Product>();
        catalog.put(1,product1);
        catalog.put(2,product2);
        catalog.put(3,product3);

        entry(catalog);
        key(catalog);
        value(catalog);

    }
    
    public static void entry(Map<Integer,Product> catalog){
        for (Map.Entry<Integer,Product> item: catalog.entrySet()) {
            System.out.println(item);
        }
    }
    public static void key(Map<Integer,Product> catalog){
        for (Integer item: catalog.keySet()) {
            System.out.printf("Key = %d \n", item);
        }
    }
    public static void value(Map<Integer,Product> catalog){
        for (Product item: catalog.values()) {
            System.out.printf("Value = %s \n", item);
        }
    }
}
