package com.company;

public interface Goblin {
    int goblin_health = (int) (Math.random() * (50 - 1) + 1);
    int goblin_attack_strength = (int) (Math.random() * (25 - 1)+1);

    public void attack();

}
