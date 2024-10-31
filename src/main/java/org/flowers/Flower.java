package org.flowers;



public class Flower {
    String name;
    int nectar;

    public Flower(String name, int nectar) {
        this.name = name;
        this.nectar = nectar;
    }

    public int getNectar() {
        return nectar;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", nectar=" + nectar +
                '}';
    }
}

