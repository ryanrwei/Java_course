import java.util.HashMap;
import java.util.HashSet;  //random access

public class pra2 {
    public static void main (String[] args) {

//        HashSet: only use class, no primitive type
        /*
        HashSet<String> cars = new HashSet<String>(); //random access
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        System.out.println(cars);

        cars.contains("Mazda"); //Check If an Item Exists
        cars.remove("Volvo");
//        cars.clear();
        System.out.println(cars.size());
        for (String i : cars) {
            System.out.println(i);
        }
        */

//        Java HashMap: "key/value", only use class, no primitive type
        HashMap<String, String> capitalCities = new HashMap<String, String>(); //String keys and String values:
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        capitalCities.get("England");
        capitalCities.remove("England");
//        capitalCities.clear();
        System.out.println(capitalCities.size());

        System.out.println(capitalCities.keySet());
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

    }
}
