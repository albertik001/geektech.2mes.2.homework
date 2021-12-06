package com.company;

public class T67 extends Tank {
    private String kamuflyaj;

    public T67(int snaryad, int healpoints, String name, String kamuflyaj) {
        super(snaryad, healpoints, name);
        this.kamuflyaj = kamuflyaj;
    }

    public String getKamuflyaj() {
        return kamuflyaj;
    }

    public void setKamuflyaj(String kamuflyaj) {
        this.kamuflyaj = kamuflyaj;
    }

    public T67(int snaryad, int healpoints, String name) {
        super(snaryad, healpoints, name);
    }

    @Override
    public void print() {
        System.out.println("Снаряд: " + getSnaryad() + "|" +
                "\tHP: " + getHealpoints() + "|" +
                "\tName: " + getName() + "|" + "\tКамуфляж: " + getKamuflyaj());
    }
}
