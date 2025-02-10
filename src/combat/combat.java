package combat;

import player.Player;
import enemies.Enemy;

import java.util.Random;

public class Combat {
    private Random random = new Random();

    public void fight(Player player, Enemy enemy) {
        System.out.println("Вы сражаетесь с " + enemy.getName() + "!");

        while (player.isAlive() && enemy.isAlive()) {
            int playerDamage = random.nextInt(10) + 5;
            enemy.takeDamage(playerDamage);
            System.out.println("Вы ударили " + enemy.getName() + " на " + playerDamage + " урона!");

            if (!enemy.isAlive()) {
                System.out.println(enemy.getName() + " повержен!");
                player.addExperience(20);
                return;
            }

            int enemyDamage = enemy.getDamage();
            player.takeDamage(enemyDamage);
            System.out.println(enemy.getName() + " атакует! Вы получили " + enemyDamage + " урона.");

            if (!player.isAlive()) {
                System.out.println("Вы пали в бою...");
                return;
            }
        }
    }
}