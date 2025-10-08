package lessons.lesson03.streetFighter;

import java.util.Random;

public class Fighter {
    private int code;
    private String name;
    private double health;
    private double attack;

    public int getCode() {
        return code;
    }

    public Fighter(int code, String name, double health, double attack) {
        this.code = code;
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public void fight(Fighter opponent) {
        Random r = new Random();
        double damage = r.nextDouble(this.attack / 2, this.attack + 1);
        double roundedDamage = Math.round(damage * 100.0) / 100.0;
        opponent.health -= roundedDamage;
        System.out.println(this.name + " attacked " + opponent.name + " for " + roundedDamage + " damage!");
        System.out.println(opponent.name + " health: " + opponent.health + "\n");
    }

    public String getFighterInfo() {
        return "Name: " + name + "\nHealth: " + health + "\nAttack: " + attack + "\n";
    }

    public double getHealth() {
        return health;
    }

    public double getAttack() {
        return attack;
    }

    public String getName() {
        return name;
    }

}
