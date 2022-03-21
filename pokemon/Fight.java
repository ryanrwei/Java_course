package pokemon;
import java.util.HashMap;
import java.util.Scanner;


public class Fight {
    int get_left_num(HashMap palyer) {
        int left_num = palyer.size();
        return left_num;
    }

    pokemon_chararistic select_pokemon(HashMap pkm_set, String pokemon_string, String player) {
        Scanner operator = new Scanner(System.in);
        pokemon_chararistic pokemon = null;
        if (player.equals("Henry")) {
//            System.out.println("select one pokemon('dog', 'cat' , 'rat') to right from Henry ");
//            String pokemon_h_string = operator.next();
            pokemon = (pokemon_chararistic) pkm_set.get(pokemon_string);
        }

        if (player.equals("Ryan")) {
//            System.out.println("select one pokemon('elephant', 'hippo') to right from Ryan ");
//            String pokemon_r_string = operator.next();
            pokemon = (pokemon_chararistic) pkm_set.get(pokemon_string);
        }


        return pokemon;
    }

    String select_pokemon(String player, HashMap pkm_set) {
        Scanner operator = new Scanner(System.in);
        String pokemon_string = null;
        if (player.equals("Henry")) {
            System.out.print("select one pokemon ( ");
            for (Object i : pkm_set.keySet()) {
            System.out.print(i + " ");
            }
            System.out.println(")to select from " + player);

            pokemon_string = operator.next();
        }

        if (player.equals("Ryan")) {
            System.out.print("select one pokemon ( ");
            for (Object i : pkm_set.keySet()) {
                System.out.print(i + " ");
            }
            System.out.println(")to select from " + player);

            pokemon_string = operator.next();
        }


        return pokemon_string;
    }

    void att(pokemon_chararistic pokemon_off, pokemon_chararistic pokemon_def, String pokemon_off_act,
             String pokemon_def_string, HashMap off_pkm, HashMap def_pkm) {

        if (pokemon_off_act.equals("att")) {
            pokemon_off.att(pokemon_def);
            System.out.println(pokemon_def_string + " left hp is: " + pokemon_def.get_hp());
            if (pokemon_def.hp <= 0) {
//                left_num_def = left_num_def - 1;
                def_pkm.remove(pokemon_def_string);
//                pokemon_def.set_hp();
                off_pkm.put(pokemon_def_string, pokemon_def);


            }
        }
    }









}
