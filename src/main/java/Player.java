public class Player {

    String name;
    String clas;
    int hp;
    int atk =1;

    public Player(final String name,final String clas,final int hp) {
        this.name = name;
        this.clas=clas;
        this.hp=hp;

    }
    void showPlayerDetails(){

        System.out.println(name);
        System.out.println(clas);
        System.out.println(hp);
    }
    


}

