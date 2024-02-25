package by.belhard.Lesson8.HomeWork.company.vehicles;

import by.belhard.Lesson8.HomeWork.company.details.Engine;
import by.belhard.Lesson8.HomeWork.company.professions.Driver;

public class Car {
    private String carModel;
    private String carClass;
    private double carWeight;
    private Driver driver;
    private Engine engine;

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот на право");
    }

    public void turnLeft(){
        System.out.println("Поворот на лево");
    }


    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", carClass='" + carClass + '\'' +
                ", carWeight=" + carWeight + '\n' +
                ", driver=" + driver.toString() + '\n' +
                ", engine=" + engine.toString() +
                '}';
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(double carWeight) {
        this.carWeight = carWeight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
