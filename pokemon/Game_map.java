package pokemon;

public class Game_map {
    int map_width;
    int map_height;

    Game_map(int map_width, int map_height) {
        this.map_width = map_width;
        this.map_height = map_height;
    }

    int[][] cal_move(int[][] loc, String move){

        outer:for (int i = 0; i < loc.length; ++i) {
            for(int j = 0; j < loc[i].length; ++j) {
                if (loc[i][j] == 1) {
                    loc[i][j] = 0;
//                    if (move == "w"){
                    if (move.equals("w")){
                        if (i+1>=3){
                            loc[i][j] = 1;
                            System.out.println("Out of the up bound, the map only ranges 1~9");
//                            System.out.println("w1");
                            break outer;
                        }else {
                            loc[i+1][j] = 1;
//                            System.out.println("w2");
                            break outer;
                        }
                    }
//                    if (move == "s") {
                    if (move.equals("s")){
                        if (i - 1 <= -1) {
                            loc[i][j] = 1;
                            System.out.println("Out of the low bound, the map only ranges 1~9");
//                            System.out.println("s1");
                            break outer;
                        } else {
                            loc[i-1][j] = 1;
//                            System.out.println("s2");
                            break outer;
                        }
                    }
//                    if (move == "a") {
                    if (move.equals("a")){
                            if (j-1 <= -1) {
                            loc[i][j] = 1;
                            System.out.println("Out of the left bound, the map only ranges 1~9");
//                            System.out.println("a1");
                            break outer;
                        } else {
                            loc[i][j-1] = 1;
//                            System.out.println("a2");
                            break outer;
                        }
                    }
//                    if (move == "d") {
                    if (move.equals("d")){
                        if (j + 1 >= 3) {
                            loc[i][j] = 1;
                            System.out.println("Out of the right bound, the map only ranges 1~9");
//                            System.out.println("d1");
                            break outer;
                        } else {
                            loc[i][j+1] = 1;
//                            System.out.println("d2");
                            break outer;
                        }
                    }
                }
            }
        }
        return loc;
    }

    void move(role_charatistic player, String move){
        player.location = cal_move(player.location, move);
//        System.out.println(((Object)player.location).getClass().getSimpleName()); // show var type

        int temp_local = 1;
        for (int i = 0; i < player.location.length; ++i) {
            for (int j = 0; j < player.location[i].length; ++j) {
                if (player.location[i][j] ==1 ) {
                    System.out.println(player.name + " currently is in " + temp_local);
                }
                temp_local = temp_local+1;

            }
        }
    }


    boolean encouter(role_charatistic player1, role_charatistic player2){
        boolean res=false;
        int count = 0;
        for (int i = 0; i < player1.location.length; ++i) {
            for(int j = 0; j < player1.location[i].length; ++j) {
                if (player1.location[i][j] == player2.location[i][j]){
                    count = count + 1;
                }
            }
        }
        if (count == (this.map_width*this.map_height)){res = true;}
        return res;

    }




}
