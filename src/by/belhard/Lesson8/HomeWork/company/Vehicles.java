package by.belhard.Lesson8.HomeWork.company;

import by.belhard.Lesson8.HomeWork.company.details.Engine;
import by.belhard.Lesson8.HomeWork.company.professions.Driver;
import by.belhard.Lesson8.HomeWork.company.vehicles.Lorry;

public class Vehicles {
    public static void main(String[] args) {
        Driver driver1 = new Driver();
        driver1.setName("Андрей");
        driver1.setPatronymic("Сергеевич");
        driver1.setSurName("Воронцов");
        driver1.setDrivExper(15);

        Engine engine1 = new Engine();
        engine1.setManufacturer("MAN eng");
        engine1.setPaverEngine(435);

       // Car lorry1 = new Lorry();
        Lorry lorry1 = new Lorry();

        lorry1.setCarModel("MAN");
        lorry1.setCarClass("D");
        lorry1.setCarWeight(5.1);
        lorry1.setDriver(driver1);
        lorry1.setEngine(engine1);
        lorry1.setCarrying(7.8);

        lorry1.start();
        lorry1.turnRight();
        lorry1.turnLeft();
        lorry1.stop();

        System.out.println(lorry1.toString());

    }
}
