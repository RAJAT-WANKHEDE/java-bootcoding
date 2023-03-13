package com.bootcoding.java.oops;

public class Door {
    double dimensions;
    String unit;
    String type;
    String brand;

    public void print() {
        System.out.println(dimensions);
        System.out.println(unit);
        System.out.println(type);
        System.out.println(brand);
    }

    public static void main(String[] args) {
        Door d1 = new Door();
        d1.dimensions = 2;
        d1.unit = "Meter";
        d1.brand = "Godrej";
        d1.type = "Steel Door";
        d1.print();

    }
}
