import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keybord = new Scanner(System.in);

        System.out.println("Team 1: Please provide team 1 name and number of players");

        Team team1 = new Team(keybord.nextLine(),Integer.parseInt(keybord.nextLine()));
        System.out.println("Team 2: Please provide team 1 name and number of players");

        Team team2 = new Team(keybord.nextLine(),Integer.parseInt(keybord.nextLine()));
        Fight firstfight = new Fight(team1,team2);
        firstfight.letsFight();





    }

}
;