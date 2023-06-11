package 剑指offer;

import java.util.*;


public class _50第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> dic = new HashMap<>();

        char[] array = s.toCharArray();

        for (char c : array) {
            dic.put(c, !dic.containsKey(c));
        }

        for (char c : array) {
            if (dic.get(c)) return c;
        }

        return ' ';

    }
    public static void main(String[] args) {
        Deque<Integer> s = new LinkedList<>();
        HashMap<Character,Integer> m = new HashMap<>();
        for(String x : args){

        }
    }
}
