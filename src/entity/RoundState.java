package entity;

import java.util.HashMap;
import java.util.Map;

public class RoundState {
    private final Map<Player, Boolean> playerGuessStatus = new HashMap<>();

    public Boolean getGuessStatusByPlayer(Player player) {
        // if the player hasn't been stored in the round yet, default the guess status to false (haven't guessed yet)
        return playerGuessStatus.getOrDefault(player, false);
    }

    public void setGuessStatusByPlayer(Player player, Boolean newStatus) {
        playerGuessStatus.put(player, newStatus);
    }
}
