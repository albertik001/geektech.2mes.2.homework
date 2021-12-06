package com.company;

public class Main {

    public static void main(String[] args) {
        Printable[] tank = {createObject("2object"), createObject("3object"), createObject("4object")};
        for (Printable printable : tank) {
            printable.print();

        }


    }

    public static Printable createObject(String Tank) {
        return switch (Tank) {
            case "2object" -> new T34(15, 430, "T34", "Досылатель");
            case "3object" -> new T67(22, 360, "Т67", "Капитан Америка!");
            case "4object" -> new T_34_85(18, 720, "Т-34-85", "Лампочка!");
            default -> null;
        };
    }
}
