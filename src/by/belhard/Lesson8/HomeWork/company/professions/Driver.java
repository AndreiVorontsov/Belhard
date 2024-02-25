package by.belhard.Lesson8.HomeWork.company.professions;

public class Driver {
   private String name;
   private String patronymic;
   private String surName;
   private int drivExper;

   @Override
   public String toString() {
      return "Driver{" +
              "name='" + name + '\'' +
              ", patronymic='" + patronymic + '\'' +
              ", surName='" + surName + '\'' +
              ", drivExper=" + drivExper +
              '}';
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPatronymic() {
      return patronymic;
   }

   public void setPatronymic(String patronymic) {
      this.patronymic = patronymic;
   }

   public String getSurName() {
      return surName;
   }

   public void setSurName(String surName) {
      this.surName = surName;
   }

   public int getDrivExper() {
      return drivExper;
   }

   public void setDrivExper(int drivExper) {
      this.drivExper = drivExper;
   }
}
