package by.belhard.Lesson8.HomeWork.Instrument;

/*
Интерфейс Инструмент
Создать интерфейс Instrument и реализующие его классы Guiter, Drum и Tuba.
Интерфейс Instrument содержит метод play() и переменную String KEY ="До мажор".
Guiter содержит переменные класса количество струн, Drum - размер, Tuba - диаметр.
Создать массив типа Instrument, содержащий инструменты разного типа.
В цикле вызвать метод play() для каждого инструмента, который должен выводить строку "Играет такой-то инструмент,
с такими-то характеристиками".
 */
public class MusicInstrument {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar();
        Drum drum1 = new Drum();
        Tuba tuba1 = new Tuba();

        guitar1.setNumberOfStrings(7);
        drum1.setSize(3);
        tuba1.setDiameter(1);

        Instrument[] instruments = new Instrument[3];
        instruments[0]= guitar1;
        instruments[1]= drum1;
        instruments[2]= tuba1;

        for (Instrument i: instruments) {
            i.play();
        }
    }
}
