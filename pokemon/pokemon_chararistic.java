package pokemon;

public class pokemon_chararistic {
    String name;
    String gender;
    int hp;
    int mp;
    int offense_value;
    int defense_value;
    String attribute;

    pokemon_chararistic(String name, String gender, int hp, int mp, int offense_value, int defense_value, String attribute) {
        this.name = name;
        this.gender = gender;
        this.hp = hp;
        this.mp = mp;
        this.offense_value = offense_value;
        this.defense_value = defense_value;
        this.attribute = attribute;
    }

    int get_hp(){
        return this.hp;
//        System.out.println(this.hp);
    }

    void set_hp(){
        this.hp = 10;
    }

    void renew_hp(int hurt){
        this.hp = this.hp - hurt;
    }


    void att( pokemon_chararistic defense){
        defense.renew_hp(this.offense_value - defense.defense_value);
    }



}
