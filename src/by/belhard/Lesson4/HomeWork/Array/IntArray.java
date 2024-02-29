package by.belhard.Lesson4.HomeWork.Array;
/*
Класс-оболочка для массива чисел
Определить класс IntArray, который будет в себе содержать в качестве поля массив чисел.
Создать для такого класса конструкторы, в которые можно передавать количество элементов массива, уже готовый массив.
Создать конструктор без параметров, который будет создавать массив из 10 элементов.
Добавить в класс метод сортировки sort (любой на выбор),
который в себя принимает в качестве параметра boolean значение,
если оно положительное (true), то массив внутри объекта сортируется по возрастанию,
если отрицательное (false), то по убыванию.
Добавить методы, с помощью которых можно будет работать с внутренним массивом без прямого обращения к нему (геттеры, сеттеры и тд)
*/
public class IntArray {
    int lengthArray;
    int[] array;

    public IntArray() {
        array = new int[10];
    }

    public IntArray(int lengthArray) {
        this.lengthArray = lengthArray;
        array = new int[lengthArray];
    }

    public IntArray(int[] array) {
        this.array = array;
    }

    public void sort(boolean flag){
        lengthArray = array.length;
        int tmp;
        if (flag){ //массив внутри объекта сортируется по возрастанию
            for (int i = 0; i < lengthArray; i++) {
                for (int j = 0; j < lengthArray - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                    }
                }
            }
        }else{ // массив внутри объекта сортируется по убыванию
            for (int i = lengthArray - 1; i >= 0; i--) {
                for (int j = lengthArray - 1; j > 0; j--) {
                    if (array[j] > array[j - 1]) {
                        tmp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = tmp;
                    }
                }
            }
        }
    }

    public int getLengthArray() {
        return lengthArray;
    }

    public void setLengthArray(int lengthArray) {
        this.lengthArray = lengthArray;
        array = new int[lengthArray];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
        sort(false);
    }
}
