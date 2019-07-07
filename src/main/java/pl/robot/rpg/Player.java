package pl.robot.rpg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(of = { "name", "attack", "health"} )
public class Player {

    @Getter
    private final String name;

    @Getter
    private final int attack;

    @Getter
    private int health;

    @Setter
    @Getter
    private Team team;

    public Player(String name, int attack, int health) {
        this.name = name;
        this.attack = attack;
        this.health = health;
    }

    public void decreaseHealth(int toDecrease) {
        this.health = Math.max(0, this.health - toDecrease);
    }

    public boolean isAlive() {
        return this.health > 0;
    }

    public boolean isDead() {
        return this.health == 0;
    }
}
