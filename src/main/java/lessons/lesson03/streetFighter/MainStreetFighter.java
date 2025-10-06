package lessons.lesson03.streetFighter;

public class MainStreetFighter {
    public static void main(String[] args) {
        Fighter fighter = new Fighter(1234, "Megatron", 1700, 250);
        Fighter fighter1 = new Fighter(1235, "Optimus Prime", 1500, 400);
        Fighter fighter2 = new Fighter(1235, "Optimus Prime", 1500, 400);
        Game game = new Game();
        game.add(fighter);
        game.add(fighter1);
        game.add(fighter2);
        game.getFighters();

        game.startBattle(fighter, fighter1);
        game.getFighters();
    }
}
