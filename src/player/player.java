package player;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health = 100;
    private int experience = 0;
    private List<String> inventory = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addExperience(int exp) {
        experience += exp;
        System.out.println(name + " получил " + exp + " опыта! (Всего: " + experience + ")");
    }

    public void heal(int amount) {
        health = Math.min(100, health + amount); // Лечим, но не выше 100
        System.out.println(name + " исцелен на " + amount + ". Здоровье: " + health);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " погиб!");
        }
    }

    public void addItem(String item) {
        inventory.add(item);
        System.out.println(name + " получил предмет: " + item);
    }

    public void printStatus() {
        System.out.println("Имя: " + name + " | Здоровье: " + health + " | Опыт: " + experience);
        System.out.println("Инвентарь: " + (inventory.isEmpty() ? "пуст" : inventory));
    }
}