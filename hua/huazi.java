package hua;

import java.util.*;

public class huazi {
    public static int max = -1;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = -1;
        int[] num = new int[1000005];
//        int max = -1;
        for(int i = 1;i<=n;i++){
            int left = scan.nextInt();
            int right = scan.nextInt();
            num[left] += 1;
            num[right+1] -= 1;
            max =Math.max(right,max);
        }
        int res = 0;
        boolean f = false;
        int count = 0;
        for(int i = 1;i <= max;i++){
            count += num[i];
            if(count == 0){
                if(!f){
                    continue;
                }else{
                    res += 1;
                }
            }else if(count == 1){
                f = true;
                res += 3;

            }else{
                f = true;
                res += 4;

            }

        }
        System.out.println(res);



    }


}

