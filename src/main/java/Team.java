import java.util.Scanner;


public class Team {

    int team_size;

    String name;

    Player[] druzyna;

    static private Scanner keybord = new Scanner(System.in);

    public Team() {
        this.name = keybord.nextLine();
        this.team_size = this.get();
        druzyna = new Player[this.team_size];


        for (int x = 0; x < team_size; x++) {
            System.out.println("Provide Name, Class, hp" + (x + 1) + ":");
            druzyna[x] = new Player(keybord.nextLine(), keybord.nextLine(), this.get());

        }
    }



    void showTeam(){
        for(int x = 0;x<team_size;x++) {
            System.out.println("Player "+ (x+1)+":");
            druzyna[x].showPlayerDetails();
        }
    }
    private static int get(){
        int tmp = Integer.parseInt(keybord.nextLine());
        while (tmp<=0)
            tmp = Integer.parseInt(keybord.nextLine());
        return tmp;
    }
}
