package by.belhard.Lesson2.HomeWork1.Exercise1;
import static by.belhard.Lesson2.HomeWork1.Exercise1.Summ.summ;
import static by.belhard.Lesson2.HomeWork1.Exercise1.Subtraction.subtraction;
/* Объявить три переменные a, b и c.
Присвоить каждой из них любое значение,
вывести на экран сумму и разность b с остальными переменными
 */

public class Main {

    public static void main(String[] args) {
	int a = 4;
	int b = 6;
	int c = 3;
        System.out.print("a = " );
        System.out.println( a );
        System.out.print("b = " );
        System.out.println( b );
        System.out.print("c = " );
        System.out.println( c );
        System.out.print("b + a + c = " );
        System.out.println( b + a + c );
        System.out.print("b - a - c = " );
        System.out.println( b - a - c );
        System.out.println("Вызов класса");
        System.out.println(summ(a,b,c));
        System.out.println(subtraction(a,b,c));
        System.out.println("Вызов метода");
        System.out.println(summMethod(a,b,c));
        System.out.println(subtractionMethod(a,b,c));
    }
    static int summMethod(int a, int b, int c) {
        System.out.print("b + a + c = " );
        return (a + b + c);
    }
    static int subtractionMethod(int a, int b, int c) {
        System.out.print("b - a - c = " );
        return (b - a - c);
    }
}
