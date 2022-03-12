import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;  //random access

/*
1. detect_fn跟count_fn怎麼合併(使用Method Overloading)
因為res的type是ArrayList，所以沒辦法像unique_num前面可以寫一個int

2. type一直轉來轉去，感覺很沒效率，有更好的方法嗎? 還是這樣其實是正常的??
*/


public class hw_ex1 {
    public static void main (String[] args) {
        ArrayList<Integer> input = new ArrayList<Integer>();

//        ex 1
//        input.add(1);
//        input.add(1);
//        input.add(2);


//        ex 2
        input.add(0);
        input.add(0);
        input.add(1);
        input.add(1);
        input.add(1);
        input.add(2);
        input.add(2);
        input.add(3);
        input.add(3);
        input.add(4);


        ArrayList<String> res = new ArrayList<String>();
        res = detect_fn(input);
        int unique_num = count_fn(input);
        System.out.println(unique_num);
        System.out.println(res);


    }

    public static ArrayList detect_fn(ArrayList ori_array){
        HashSet<Integer> checker = new HashSet<Integer>(); //random access
        ArrayList<String> unique_ = new ArrayList<String>();
        ArrayList<String> repeat_ = new ArrayList<String>();
        int count = 0;
        for(int i=0; i<ori_array.size(); i++){
//            System.out.println(((Object)i).getClass().getSimpleName()); // show var type
            if(checker.contains( (int)ori_array.get(i) ) ){
                repeat_.add("_");
            }else {
                count = count + 1;
                checker.add((int) ori_array.get(i));
                unique_.add(String.valueOf((int) ori_array.get(i)));
            }
        }
        ArrayList<String> result = new ArrayList<String>();
        for (String i : unique_) {
            result.add(i);
        }
        for (String i : repeat_) {
            result.add(i);
        }
        return result;
    }

    public static int count_fn(ArrayList ori_array){
        HashSet<Integer> checker = new HashSet<Integer>(); //random access
        int count = 0;
        for(int i=0; i<ori_array.size(); i++){
            if(checker.contains( (int)ori_array.get(i) ) ){
                continue;
            }else {
                count = count + 1;
                checker.add((int) ori_array.get(i));
            }
        }
        return count;
    }


}

