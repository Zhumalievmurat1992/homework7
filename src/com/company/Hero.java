package com.company;

import com.company.HavingSuperAbility;

public abstract class Hero implements HavingSuperAbility {
    private int Health;
    private int damage;
    private String SuperAbilityType;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbilityType() {
        return SuperAbilityType;
    }

    public void setSuperAbilityType(String superAbilityType) {
        SuperAbilityType = superAbilityType;
    }
}
