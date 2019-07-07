public class Player {


    public Player(String _name, String _clas,int _hp) {
        name = _name;
        clas=_clas;
        hp=_hp;

    }
    void Player_details(){

        System.out.println(name);
        System.out.println(clas);
        System.out.println(hp);
    }
    

    String name;
    String clas;
    int hp;
    int atk =1;
}

