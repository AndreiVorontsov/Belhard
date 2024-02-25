package by.belhard.Lesson8.HomeWork.company.vehicles;

public class SportCar extends Car{
    private int maxSpeed;

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                SportCar.super.toString() +
                '}';
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
