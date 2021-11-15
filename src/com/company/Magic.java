package com.company;

public class Magic extends Hero {
    @Override
    public void applySuperAbility() {
        setHealth(300);
        setDamage(100);
        setSuperAbilityType("огненый щар ");
        System.out.println(getHealth() + " " + getDamage() + " " + getSuperAbilityType());
    }
}
