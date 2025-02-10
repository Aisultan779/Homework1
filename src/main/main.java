import combat.Combat;
import enemies.Skeleton;
import enemies.Vampire;
import items.ItemManager;
import level.LevelManager;
import player.Player;
import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя вашего героя:");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);

        Combat combatManager = new Combat();
        ItemManager itemManager = new ItemManager();
        LevelManager levelManager = new LevelManager();

        System.out.println("Добро пожаловать, " + player.getName() + "! Начинаем приключение!");

        while (player.isAlive()) {
            System.out.println("\nВы встретили врага! Выберите действие: \n1 - Сразиться со скелетом \n2 - Сразиться с вампиром \n3 - Найти предмет \n4 - Проверить статус \n5 - Завершить игру");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    combatManager.fight(player, new Skeleton());
                    break;
                case 2:
                    combatManager.fight(player, new Vampire());
                    break;
                case 3:
                    itemManager.pickUpItem(player, "Health Elixir");
                    break;
                case 4:
                    player.printStatus();
                    break;
                case 5:
                    System.out.println("Вы покинули игру. До новых встреч!");
                    return;
                default:
                    System.out.println("Неверный ввод! Попробуйте снова.");
            }

            if (!player.isAlive()) {
                System.out.println("Игра окончена! Ваш персонаж пал в бою...");
                break;
            }
        }

        scanner.close();
    }
}
