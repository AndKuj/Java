import java.util.Scanner;


public class Team {

    public Team(String _name, int _team_size){
        name = _name;
        team_size=_team_size;
        druzyna = new Player[_team_size];

        for(int x=0;x<_team_size;x++){
            System.out.println("Provide Name, Class, hp"+(x+1)+":");
            druzyna[x]= new Player(keybord.nextLine(),keybord.nextLine(),Integer.parseInt(keybord.nextLine()));

        }
    }

    Scanner keybord = new Scanner(System.in);

    int team_size;


    String name;

    Player[] druzyna;

    void showTeam(){
        for(int x = 0;x<team_size;x++) {
            System.out.println("Player "+ (x+1)+":");
            druzyna[x].Player_details();
        }
    }
}
