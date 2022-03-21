package pokemon;
import java.util.ArrayList;
import java.util.HashMap;


public class role_charatistic {
    String name;
    int height;
    int weight;
    int age;
    int [][] location;
    int location_init;

    role_charatistic(String name, int height, int weight, int age, Game_map map, int location_init) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.location = new int[map.map_width][map.map_height];

        int move_num = location_init;
        for (int i = 0; i < this.location.length; ++i) {
            for(int j = 0; j < this.location[i].length; ++j) {
                move_num = move_num-1;
                if (move_num == 0) { this.location[i][j] = 1; }
//                System.out.println(this.location[i][j]);
            }
        }

    }

    HashMap<String, pokemon_chararistic> collect_pokemon(String a_name, pokemon_chararistic a, String b_name, pokemon_chararistic b, String c_name, pokemon_chararistic c){
        HashMap<String, pokemon_chararistic> pokemon_array = new HashMap<String, pokemon_chararistic>();
        pokemon_array.put(a_name, a);
        pokemon_array.put(b_name, b);
        pokemon_array.put(c_name, c);

        return pokemon_array;
    }

    HashMap<String, pokemon_chararistic> collect_pokemon(String a_name, pokemon_chararistic a, String b_name, pokemon_chararistic b){
        HashMap<String, pokemon_chararistic> pokemon_array = new HashMap<String, pokemon_chararistic>();
        pokemon_array.put(a_name, a);
        pokemon_array.put(b_name, b);

        return pokemon_array;
    }

    void get_loc(){

        int temp_local = 1;
        for (int i = 0; i < this.location.length; ++i) {
            for (int j = 0; j < this.location[i].length; ++j) {
                if (this.location[i][j] ==1 ) {
                    System.out.println(this.name + " currently is in " + temp_local);
                }
                temp_local = temp_local+1;

            }
        }
//        return temp_local;
    }






}

