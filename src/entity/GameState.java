package entity;

import java.util.ArrayList;
import java.util.List;

public class GameState {
    private final List<Player> players = new ArrayList<>();
    private String id;
    private Song song;
    private Player mainPlayer;
    private Player announcer;

    public Song getSong() {
        return this.song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Player getMainPlayer() {
        return mainPlayer;
    }

    public void setMainPlayer(Player mainPlayer) {
        this.mainPlayer = mainPlayer;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Player getAnnouncer() {
        return announcer;
    }

    public void setAnnouncer(Player announcer) {
        this.announcer = announcer;
    }
}
