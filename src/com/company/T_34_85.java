package com.company;

public class T_34_85 extends Tank {
    private String perk;

    public T_34_85(int snaryad, int healpoints, String name, String perk) {
        super(snaryad, healpoints, name);
        this.perk = perk;
    }

    public String getPerk() {
        return perk;
    }

    public void setPerk(String perk) {
        this.perk = perk;
    }

    public T_34_85(int snaryad, int healpoints, String name) {
        super(snaryad, healpoints, name);
    }

    @Override
    public void print() {
        System.out.println("Снаряд: " + getSnaryad() + "|" +
                "\tHP: " + +getHealpoints() + "|" +
                "\tName: " +   getName() + "|" + "\tПерк: " + getPerk());
    }
}
