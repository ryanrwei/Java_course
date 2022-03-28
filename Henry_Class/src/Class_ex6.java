

public class Class_ex6 {
    public static void main(String[] args) {
        Role_game archer = new Role_game(100, 30, 40, "cut", "weapon1");
        Role_game fighter = new Role_game(150, 40, 50, "smash", "knife");
        Role_game magician = new Role_game(90, 20, 80, "fire", "wood");


        fighter.action(archer.hp, fighter.att);
//        archer.action(archer.hp, fighter.att);
        System.out.println("archer's left_hp:" + archer.status() );

        System.out.println( archer.skill );
        System.out.println( archer.weapon );
        int[][] tmp = archer.abc();
//        int[] storage = methodReturningArray();
        int[][] xx = archer.xxx();



    }
}
