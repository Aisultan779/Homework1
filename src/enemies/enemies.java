package enemies;

public interface Enemy {
    String getName();
    int getDamage();
    void takeDamage(int damage);
    boolean isAlive();
}