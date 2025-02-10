package enemies;

public class Skeleton implements Enemy {
    private int health = 30;

    @Override
    public String getName() {
        return "Скелет";
    }

    @Override
    public int getDamage() {
        return 10;
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