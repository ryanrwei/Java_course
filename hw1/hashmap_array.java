import java.util.ArrayList;
import java.util.HashMap;

public class hashmap_array {
    public static void main(String[] args) {

        int[] numList = {2,3,5,7,11};
        HashMap<Integer, ArrayList<Integer>> hash_array = new HashMap<>();

        for (int i = 0; i < numList.length; i++) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int j = 1; j < 100; j++){
                if ((j % numList[i])==0){
                    arr.add(j);
                }
            }
            hash_array.put(numList[i], arr);
        }

    for (Integer i : hash_array.keySet()) {
        System.out.println("key: " + i + " value: " + hash_array.get(i));
    }

}
 }