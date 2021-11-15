package com.company;

public class Medic extends Hero {
    @Override
    public void applySuperAbility() {
        setHealth(200);
        setDamage(0);
        setSuperAbilityType("аптечка ");
        System.out.println(getHealth() + " " + getDamage() + " " + getSuperAbilityType());
    }
}
