package OOP;

import OOP.Car;

public class Product {

    public static void main(String[] args) {

        Car nexia = new Car();
        nexia.setName("Nexia");
        nexia.setModel("Chevrolet Nexia 3");
        nexia.setColor("Oq");
        nexia.setPrice("17 000$");
        nexia.setAvto("Avtomat");

        System.out.println("Nomi " + nexia.getName());
        System.out.println("Modeli " + nexia.getModel());
        System.out.println("Rangi " + nexia.getColor());
        System.out.println("Narxi " + nexia.getPrice());
        System.out.println("Xususiyati " + nexia.getAvto());

        Car lacceti = new Car();
        lacceti.setName("Gentra");
        lacceti.setModel("Chevrolet Laccetti Gentra");
        lacceti.setColor("Qora");
        lacceti.setPrice("20 000$");
        lacceti.setAvto("Avtomat");

        System.out.println("Nomi " + lacceti.getName());
        System.out.println("Modeli " + lacceti.getModel());
        System.out.println("Rangi " + lacceti.getColor());
        System.out.println("Narxi " + lacceti.getPrice());
        System.out.println("Xususiyati " + lacceti.getAvto());

    }
}
