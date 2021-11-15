package com.company;

public class Warrior extends Hero {
    @Override
    public void applySuperAbility() {
        setHealth(250);
        setDamage(150);
        setSuperAbilityType("стрела ");

        System.out.println(getHealth() + " " + getDamage() + " " + getSuperAbilityType());
    }
}
