public class Role_game {
    int hp;
    int att;
    int mp;
    String skill;
    String weapon;

    Role_game(int hp, int att, int mp, String skill, String weapon) {
//        this(100, 30, 40);
        this.hp = hp;
        this.att = att;
        this.mp = mp;
        this.skill = skill;
        this.weapon = weapon;

    }

    void action(int hp, int att){
        this.hp = this.hp - att;
//        hp = hp - att;

//        return this.hp;
    }

    int status(){
        return this.hp;
    }

    void action(String skill){

        System.out.println("I can " + skill); //於類別內呼叫getMyName函數
    }

    void PuttingOn(){
        System.out.println("I'm wearing " + this.weapon); //於類別內呼叫getMyName函數
    }

    int[][] abc(){
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };
        return a;
    }

    int[][] xxx(){
        System.out.println(abc());
        return  abc();
    }
}
