package com.company;

public class T34 extends Tank {
    private String oborudovanie;

    public T34(int snaryad, int healpoints, String name, String oborudovanie) {
        super(snaryad, healpoints, name);
        this.oborudovanie = oborudovanie;
    }

    public String getOborudovanie() {
        return oborudovanie;
    }

    public void setOborudovanie(String oborudovanie) {
        this.oborudovanie = oborudovanie;
    }

    public T34(int snaryad, int healpoints, String name) {
        super(snaryad, healpoints, name);
    }

    @Override
    public void print() {
        System.out.println("Снаряд: " + getSnaryad() + "|" +
                "\tHP: " + getHealpoints() + "|" +
                "\tName: " + getName() + "|" + "\tОборудование: " + getOborudovanie());
    }
}
