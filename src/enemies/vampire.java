package enemies;

public class Vampire implements Enemy {
    private int health = 50;

    @Override
    public String getName() {
        return "Вампир";
    }

    @Override
    public int getDamage() {
        return 15;
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}