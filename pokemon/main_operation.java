package pokemon;
import java.util.Scanner;
import java.util.HashMap;

public class main_operation {
    public static void main(String[] args) {

        // create a map
        Game_map map = new Game_map(3, 3);

        // announce var
        pokemon_chararistic Henry_pkm_1 = new pokemon_chararistic("dog", "M", 100, 60, 80, 10, "fire");
        pokemon_chararistic Henry_pkm_2 = new pokemon_chararistic("cat", "F", 90, 55, 60, 20, "water");
        pokemon_chararistic Henry_pkm_3 = new pokemon_chararistic("rat", "M", 80, 50, 40, 10, "plant");

        pokemon_chararistic Ryan_pkm_1 = new pokemon_chararistic("elephant", "F", 120, 70, 60, 35, "sky");
        pokemon_chararistic Ryan_pkm_2 = new pokemon_chararistic("hippo", "M", 110, 50, 40, 10, "ground");

        role_charatistic Henry = new role_charatistic("Henry", 180, 80, 27 , map, 1);
        role_charatistic Ryan = new role_charatistic("Ryan", 187, 71, 26, map, 9);

        // put pokemon into player
        HashMap<String, pokemon_chararistic> Henry_pkm = Henry.collect_pokemon(Henry_pkm_1.name, Henry_pkm_1, Henry_pkm_2.name, Henry_pkm_2, Henry_pkm_3.name, Henry_pkm_3);
        HashMap<String, pokemon_chararistic> Ryan_pkm = Henry.collect_pokemon(Ryan_pkm_1.name, Ryan_pkm_1, Ryan_pkm_2.name, Ryan_pkm_2);

        boolean exit_game = false;
        boolean game_start = true;
        Scanner operator = new Scanner(System.in);

        while (!exit_game) {

            System.out.println("input name('Henry' or 'Ryan') to select the character you want to control ");
            String role_choose = operator.next();
            System.out.print("you choose " + role_choose);

            System.out.println("use up('w'), down('s'), left('a'), right('d') tp move that character ");
            String role_move = operator.next();


            if (role_choose.equals("Henry")) {
                map.move(Henry, role_move);
            }
            if (role_choose.equals("Ryan")) {
                map.move(Ryan, role_move);
            }

            // whether encounter
            boolean res_encouter = map.encouter(Henry, Ryan);
            System.out.println( "if two encounter? " + res_encouter );
            if (res_encouter) {
                System.out.println("game start!!!");
                game_start = true;
                break;
            }

            // whether exit the game
            System.out.println("wanna exit the game? plz enter y/n");
            String out_loop = operator.next();

            if (out_loop.equals("y")) {
                exit_game = true;
                game_start = false;
            }
        }

//        System.out.println(Henry_pkm.get(game_start));


        int left_num_h = Henry_pkm.size();
        int left_num_r = Ryan_pkm.size();

        Fight fighting = new Fight();
        String loser = "nobody";


        if(game_start) {

            String pokemon_h_string = fighting.select_pokemon("Henry", Henry_pkm);
            pokemon_chararistic pokemon_h = fighting.select_pokemon(Henry_pkm, pokemon_h_string, "Henry");

            String pokemon_r_string = fighting.select_pokemon("Ryan", Ryan_pkm);
            pokemon_chararistic pokemon_r = fighting.select_pokemon(Ryan_pkm, pokemon_r_string, "Ryan");

            while(game_start && left_num_h>0 && left_num_r>0 ){

                if (loser.equals("Henry")){
                    pokemon_h_string = fighting.select_pokemon("Henry", Henry_pkm);
                    pokemon_h = fighting.select_pokemon(Henry_pkm, pokemon_h_string, "Henry");

                }
                if (loser.equals("Ryan")){
                    pokemon_r_string = fighting.select_pokemon("Ryan", Ryan_pkm);
                    pokemon_r = fighting.select_pokemon(Ryan_pkm, pokemon_r_string, "Ryan");

                }

                while ( pokemon_r.get_hp() >0 && pokemon_h.get_hp() >0) {
                    System.out.println("Henry, choose att/pass(do nothing)");
                    String pokemon_act = operator.next();
                    fighting.att(pokemon_h, pokemon_r, pokemon_act, pokemon_r_string, Henry_pkm, Ryan_pkm);
                    if (pokemon_r.get_hp() <= 0){
                        left_num_r = left_num_r - 1;
                        loser = "Ryan";
                        break;}

                    System.out.println("Ryan, choose att/pass(do nothing)");
                    pokemon_act = operator.next();
                    fighting.att(pokemon_r, pokemon_h, pokemon_act, pokemon_h_string, Ryan_pkm, Henry_pkm);
                    if (pokemon_h.get_hp() <= 0){
                        left_num_h = left_num_h - 1;
                        loser = "Henry";
                        break;}
                }

                System.out.println("this time, loser is " + loser);
                System.out.println(loser + " still wanna fight? plz enter y/n ");
                String willing = operator.next();
                if (willing.equals("n")) {
                    game_start = false;
                }

            }

        }
        System.out.println(loser + " have failed, cuz have no powerful pokemons (hp<=0)");
        System.out.println("game finish");

//////////////////////////

    }
}
