package by.belhard.Lesson8.HomeWork.Instrument;
/*
Guitar содержит переменные класса количество струн
 */
public class Guitar implements Instrument {

    private int numberOfStrings;
    @Override
    public void play() {
        System.out.println("Играет гитара, у которой " + numberOfStrings +" струн");
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
