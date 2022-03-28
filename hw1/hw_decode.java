import java.util.ArrayList;

class hw_decode{

    public static void main (String[] args) {

        System.out.println(revHash(6933552791181934L));
        System.out.println(hash("justdoit")); //574318821802

    }

    public static String letters = "cdefghijlmnoqstuvxz";

    public static String revHash(long hash) {
        // write the code here
        long coded_num = hash;
        long h = 7;
        ArrayList<Character> arr = new ArrayList<Character>();
        char tmp_word;

        while (coded_num > h){
            int residual = (int)(coded_num % 23);
            coded_num = coded_num / 23;
            tmp_word = letters.charAt(residual);
            arr.add(tmp_word);
        }
        String result = "";
        for (int i = arr.size()-1; i>=0; i--) {
            result = result + arr.get(i);
        }
        return result;
    }

    public static long hash(String s){
        long h = 7;
        for (int i = 0; i < s.length(); i++){
            h = h * 23 + letters.indexOf(s.charAt(i));
        }
        return h;
    }

}