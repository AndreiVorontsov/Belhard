package by.belhard.Lesson8.HomeWork.company.details;

public class Engine {
    private int paverEngine;
    private String manufacturer;

    @Override
    public String toString() {
        return "Engine{" +
                "paverEngine=" + paverEngine +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public int getPaverEngine() {
        return paverEngine;
    }

    public void setPaverEngine(int paverEngine) {
        this.paverEngine = paverEngine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
