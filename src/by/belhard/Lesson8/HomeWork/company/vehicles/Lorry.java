package by.belhard.Lesson8.HomeWork.company.vehicles;

public class Lorry extends Car{
    private double carrying;

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying + '\n' +
                Lorry.super.toString() +
                '}';
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }
}
