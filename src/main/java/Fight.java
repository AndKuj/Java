

public class Fight {

    public Fight(Team _team1, Team _team2){
        team1=_team1;
        team2=_team2;
    }

    Team team1;
    Team team2;



    void letsFight(){
        int x=0;
        int y=0;
        while(team1.druzyna[team1.team_size-1].hp>0||team2.druzyna[team2.team_size-1].hp>0){

            team2.druzyna[y].hp-=1;

            if(team2.druzyna[y].hp==0)
                y++;

            team1.druzyna[x].hp-=1;


            if(team1.druzyna[x].hp==0)
                x++;

            if(team1.druzyna[team1.team_size-1].hp==0) {
                System.out.println(team2.name + "won");
                break;
            }
            if (team2.druzyna[team2.team_size-1].hp==0){
                System.out.println(team2.name + "won");
                break;
            }



        }

    }


}
