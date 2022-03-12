import java.util.HashMap;

public class pra3 {
    public static void main (String[] args) {
        String myStr = "Hello";
        char result = myStr.charAt(0);
        System.out.println(result);

        String myStr2 = "Hello planet earth, you are a great planet.";
        System.out.println(myStr2.indexOf("planet"));

        String myStr3 = "Hello planet earth, you are a great planet.";
        System.out.println(myStr3.indexOf("e", 5));

    }
}
