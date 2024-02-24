package by.belhard.Lesson8.HomeWork.Instrument;

public class Tuba implements Instrument{
    private int diameter;

    @Override
    public void play() {
        System.out.println("Играет труба, диаметром - " + diameter);
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
