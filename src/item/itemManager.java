package items;

import player.Player;

public class ItemManager {
    public void pickUpItem(Player player, String item) {
        switch (item) {
            case "Gold Coin":
                player.addExperience(5);
                break;
            case "Health Elixir":
                player.heal(20);
                break;
            case "Magic Scroll":
                player.addExperience(15);
                break;
        }
        player.addItem(item);
    }
}