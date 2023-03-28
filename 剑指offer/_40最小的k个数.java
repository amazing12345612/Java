package 剑指offer;

import java.util.*;

public class _40最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Queue<Integer> a = new PriorityQueue<>((w1,w2)->w2-w1);
        for(int i = 0;i<k;i++){
            a.add(arr[i]);
        }
        for(int i = k ;i<arr.length;i++){
            if(a.peek()>arr[i]){
                a.poll();
                a.add(arr[i]);
            }
        }
        int[] ans = new int[k];
        int i = 0;
        while(a.size()>0){
            ans[i] = a.poll();
            i++;
        }
        return ans  ;
    }
}
