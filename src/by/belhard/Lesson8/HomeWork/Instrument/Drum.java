package by.belhard.Lesson8.HomeWork.Instrument;

public class Drum implements Instrument{
    private int size;

    @Override
    public void play() {
        System.out.println("Играет барабан, размер - " + size);
    }

    public void setSize(int size) {
        this.size = size;
    }
}
