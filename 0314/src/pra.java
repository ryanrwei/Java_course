import java.util.ArrayList;

class pra{
    public static void main (String[] args) {

//        Java Arrays: type[]
        /*
        String[] car;
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);

        int[] myNum = {10, 20, 30, 40};
        System.out.println(myNum[0]);
        System.out.println(myNum.length);
        */

//        ArrayList: only use class, no primitive type
        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println(cars.size());
        cars.get(0);
        cars.set(0, "Opel");
//        cars.remove(0);
//        cars.clear();
        for (String i : cars) {
            System.out.println(i);
        }

        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(11);
        test.add(22);
        System.out.println(test);

        for (int i : test) {
            System.out.println(i);
        }

    }
}