package xhs;

import java.util.*;
public class _2  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = scan.nextInt();
        }
        int c = scan.nextInt();
        int[] left = new int[c];
        int[] right = new int[c];
        for(int i = 0;i<c;i++){
            left[i] = scan.nextInt();
        }
        for(int i = 0;i<c;i++){
            right[i] = scan.nextInt();
        }
        String str = scan.next();
        int[] cal = new int[c];
        for (int i = 0;i<c;i++){
            cal[i] = scan.nextInt();
        }
        int z = 0;
        while(z<c){
            int target = cal[z];
            int l = left[z]-1;
            int r = right[z]-1;
            if(str.charAt(z) == '&'){
                for(int i = l;i<=r;i++){
                    nums[i] = nums[i] & target;
                }
            }else if(str.charAt(z) == '|'){
                for(int i = l;i<=r;i++){
                    nums[i] = nums[i] | target;
                }
            }
            if (str.charAt(z) != '|' && str.charAt(z) != '&'){
                for(int i = l;i<=r;i++){
                    nums[i] = target;
                }
            }

            z++;
        }
        for(int t : nums){
            System.out.println(t);
        }

    }
}
