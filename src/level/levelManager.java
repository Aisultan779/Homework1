package level;

import player.Player;
import java.util.List;
import java.util.ArrayList;

public class LevelManager {
    public int level = 1;
    public List<String> enemies = new ArrayList<>();
    public List<String> items = new ArrayList<>();

    public void advanceLevel(Player player) {
        level++;
        player.heal(100);
    }
}