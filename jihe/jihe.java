package jihe;

import java.util.ArrayList;
import java.util.*;

public class jihe {
    public static void main(String[] args) {
//        ArrayList<Integer> e = new ArrayList<>();//底层是数组
//        e.add(1);
//        e.add(1,10);
//        LinkedList<Integer> b = new LinkedList<>();
//        b.add(1);
//
//        b.remove(Integer.valueOf(1));
////        System.out.println(e);
//        System.out.println(b);
        test();

    }
    /*
    TreeMap
     */
    public static void test() {
        Map<String, Integer> map = new TreeMap<>((x,y)->{return y.compareTo(x);});
        map.put("orange", 1);
        map.put("apple", 2);
        map.put("aeeple", 3);
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        // apple, orange, pear
    }
    /*
    Priority
     */
    public static void test2(){
    }
}
