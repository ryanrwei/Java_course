public class prime_func {

    static boolean prime_(int num) {
        boolean result = false;
        int count = 0;

        for (int j = 1; j <= num; j++) {
            if ((num % j) == 0) {      //prime number is only divisible by 1 and itself
                count = count + 1;
            }
        }
        if (count == 2) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 11;
        boolean result ;
        result = prime_(a);
        if (result) {
            System.out.println(" it is prime number");
        }else{
            System.out.println(" it isn't prime number");
        }
    }

}
