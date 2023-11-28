package org.example.resource;

public class Apple {
    private String name;
    private double weight;
    private Enum<Color> color;

    public Apple(String name, double weight, Enum<Color> color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Enum<Color> getColor() {
        return color;
    }

    public void setColor(Enum<Color> color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color=" + color +
                '}';
    }
}
