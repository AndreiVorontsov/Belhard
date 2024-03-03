package by.belhard.Lesson10.Klass.Task_1;

public class HeavyBox {
   private double weight;
   private String owner;

    public HeavyBox(double weight, String owner) {
        this.weight = weight;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "weight=" + weight +
                "; owner=" + owner ;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
