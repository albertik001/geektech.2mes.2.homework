package com.company;

public abstract class Tank implements Printable {
    private int snaryad;
    private int healpoints;
    private String name;

    public Tank(int snaryad, int healpoints, String name) {
        this.snaryad = snaryad;
        this.healpoints = healpoints;
        this.name = name;
    }

    public int getSnaryad() {
        return snaryad;
    }

    public void setSnaryad(int snaryad) {
        this.snaryad = snaryad;
    }

    public int getHealpoints() {
        return healpoints;
    }

    public void setHealpoints(int healpoints) {
        this.healpoints = healpoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
