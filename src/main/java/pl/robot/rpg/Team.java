package pl.robot.rpg;

import lombok.Getter;
import lombok.ToString;

import java.util.Deque;
import java.util.LinkedList;

@ToString
public class Team {

    @Getter
    private final String name;

    private Deque<Player> players;

    private Deque<Player> deadPlayers;

    public Team(String name, Deque<Player> players) {
        this.name = name;
        this.players = players;
        this.players.forEach(player -> player.setTeam(this));
        this.deadPlayers = new LinkedList<>();
    }

    public boolean hasAlivePlayers() {
        return !players.isEmpty();
    }

    public Player getFighter() {
        return players.getFirst();
    }

    public void fighterDead() {
        deadPlayers.add(players.removeFirst());
    }
}
