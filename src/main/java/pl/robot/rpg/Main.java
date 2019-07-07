package pl.robot.rpg;


import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.Random;
import java.util.stream.IntStream;

@Slf4j
public class Main {


    private static Random rand = new Random();

    private static TeamProvider randomTeamProvider = () -> {
        int teamId = rand.nextInt(20);
        LinkedList<Player> players = new LinkedList<>();

        IntStream.range(0, rand.nextInt(3) + 1)
                .mapToObj(i -> new Player(
                        "player-" + teamId + "-" + i,
                        10 + rand.nextInt(50),
                        50 + rand.nextInt(50)))
                .forEach(players::add);

        return new Team(
                "random-team-" + teamId,
                players
        );
    };

    public static void main(String[] args) {

        Team teamA = randomTeamProvider.get();
        Team teamB = randomTeamProvider.get();

        Arena arena = new Arena();
        Team winner = arena.figth(teamA, teamB);

        log.info("!!! The winner is {}", winner);
    }


}
