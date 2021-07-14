package com.company;

public class Human extends Land implements Goblin{

    int humanStarter = 50;
    int human_life;
    int human_attack_strength = 25;

    @Override
    public void attack() {
        final int MAX = 25;
        if(human_life <= 50){
            if(goblin_attack_strength >= human_attack_strength ){
                setHuman_life(getHuman_life()-(goblin_attack_strength % human_attack_strength));
                // set new human attack strength
            }else if(human_life < 25){
                setHuman_life(getHuman_life()+(goblin_attack_strength % human_attack_strength));
                // Set new attack strength
            }
        }else
        if(goblin_attack_strength >= human_attack_strength ){
            setHuman_life(humanStarter-(goblin_attack_strength % human_attack_strength));
            // set new human attack strength
        }else if(human_life < 25){
            setHuman_life(getHuman_life()+(goblin_attack_strength % human_attack_strength));
            // Set new attack strength
        }
    }

    protected int getHuman_life() {
        return human_life;
    }
    protected void setHuman_life(int human_life) {
        this.human_life = human_life;
    }
    protected int getHuman_attack_strength() {
        return human_attack_strength;
    }
    protected void setHuman_attack_strength(int human_attack_strength) {
        this.human_attack_strength = human_attack_strength;
    }

}
