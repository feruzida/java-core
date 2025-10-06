package lessons.lesson03.streetFighter;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private ArrayList<Fighter> fighters = new ArrayList<>();

    public void add(Fighter fighter) {
        for (Fighter fighter1 : fighters) {
            if (fighter1.getCode() == fighter.getCode()) {
                System.out.println("Fighter with code " + fighter.getCode() + " already exists!");
                return;
            }
        }
        fighters.add(fighter);
    }

    public void startBattle(Fighter f1, Fighter f2) {
        Random r = new Random();

        while (f1.getHealth() > 0 && f2.getHealth() > 0) {
            boolean firstAttack = r.nextBoolean();

            if (firstAttack) {
                f1.fight(f2);
                System.out.println("------------------------------");
                if (f2.getHealth() <= 0) {
                    break;
                }
                f2.fight(f1);
                System.out.println("------------------------------");
            } else {
                f2.fight(f1);
                System.out.println("------------------------------");
                if (f1.getHealth() <= 0) {
                    break;
                }
                f1.fight(f2);
                System.out.println("------------------------------");
            }
        }
        if (f1.getHealth() <= 0 && f2.getHealth() <= 0) {
            System.out.println("Both fighters are down! It is a draw!");
            return;
        }
        if (f1.getHealth() > 0) {
            System.out.println(f1.getName() + " is winner!");
            System.out.println(f2.getName() + " is removed from game!\n");
            fighters.remove(f2);
        } else {
            System.out.println(f2.getName() + " is winner!");
            System.out.println(f1.getName() + " is removed from the game!\n");
            fighters.removeIf(fighter -> fighter.equals(f1));
        }
    }

    public void getFighters() {
        for (Fighter fighter : fighters) {
            System.out.println(fighter.getFighterInfo());
        }
    }
}
