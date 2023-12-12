package OOP;

import OOP.Car;

public class Product {

    public static void main(String[] args) {
        Car nexia = new Car();
        nexia.getModel("Chevrolet Nexia 3");
        nexia.getColor("Oq");
        nexia.getNarx("17 000$");
        nexia.getAvto("Avtomat");

        Car lacetti = new Car();
        lacetti.getModel("Chevrolet Lacetti Gentra");
        lacetti.getColor("Qora");
        lacetti.getNarx("20 000$");
        lacetti.getAvto("Mexanik");

        Car malibu = new Car();
        malibu.getModel("Chevrolet Malibu 2 Turbo");
        malibu.getColor("Qora");
        malibu.getNarx("30 000$");
        malibu.getAvto("Avtomat");

    }
}
