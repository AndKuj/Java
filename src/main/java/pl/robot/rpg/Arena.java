package pl.robot.rpg;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Arena {


    public pl.robot.rpg.Team figth(pl.robot.rpg.Team team1, pl.robot.rpg.Team team2) {
        log.info("Next fight wiil be between {} and {}", team1, team2);


        int roundNo = 1;
        while (team1.hasAlivePlayers() && team2.hasAlivePlayers()) {
            round(roundNo, team1, team2);
            pl.robot.rpg.Team tmp = team1;
            team1 = team2;
            team2 = tmp;
            roundNo++;
        }

        if (team1.hasAlivePlayers()) {
            return team1;
        }
        return team2;
    }

    private void round(int roundNo, pl.robot.rpg.Team team1, pl.robot.rpg.Team team2) {
        log.info("Preparing to roung {} between {} and {}.", roundNo, team1.getName(), team2.getName());
        pl.robot.rpg.Player fighter1 = team1.getFighter();
        pl.robot.rpg.Player fighter2 = team2.getFighter();

        attack(fighter1, fighter2);

        if (team2.hasAlivePlayers()) {
            fighter2 = team2.getFighter();
            attack(fighter2, fighter1);
        }
    }

    private void attack(pl.robot.rpg.Player fighter1, pl.robot.rpg.Player fighter2) {
        fighter2.decreaseHealth(fighter1.getAttack());
        log.info("Fighter {} attack {} giving {} damage and remaining {} hp", fighter1.getName(), fighter2.getName(), fighter1.getAttack(), fighter2.getHealth());

        if (fighter2.isDead()) {
            fighter2.getTeam().fighterDead();
        }
    }
}
