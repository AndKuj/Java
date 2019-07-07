public class Fight {

    Team team1;
    Team team2;


    public Fight(final Team team1, final Team team2){
        this.team1=team1;
        this.team2=team2;
    }


    void fight(){
        int x=0;
        int y=0;
        while(isaBoolean()){

            team2.druzyna[y].hp-=team1.druzyna[x].atk;

            if(team2.druzyna[y].hp==0)
                y++;

            team1.druzyna[x].hp-=team2.druzyna[y].atk;


            if(team1.druzyna[x].hp==0)
                x++;

            if(team1.druzyna[team1.team_size-1].hp==0) {
                System.out.println(team2.name + " won");
                break;
            }
            if (team2.druzyna[team2.team_size-1].hp==0){
                System.out.println(team2.name + " won");
                break;
            }



        }

    }

    private boolean isaBoolean() {
        return team1.druzyna[team1.team_size-1].hp>0&&team2.druzyna[team2.team_size-1].hp>0;
    }


}
