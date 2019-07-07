public class Main {
    public static void main(String[] args){


        System.out.println("Team 1: Please provide team 1 name and number of players");
        Team team1 = new Team();

        System.out.println("Team 2: Please provide team 1 name and number of players");
        Team team2 = new Team();

        Fight firstFight = new Fight(team1,team2);

        firstFight.fight();

    }

}
;