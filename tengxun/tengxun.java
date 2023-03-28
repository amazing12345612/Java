package tengxun;

import java.util.*;
public class tengxun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            int n = scan.nextInt();
            int[] nums = new int[n];
            for(int i = 0;i<n;i++){
                nums[i] = scan.nextInt();
            }
            for (int i = 1;i<n;i++){
                nums[i] *= nums[i-1];
            }
            int count = 0;
            for (int i =0;i<n;i++){
                int z = nums[i];
                for (int j = i-1;j>=0;j--){
                    int t  = nums[i]/nums[j];
                    if (t == z) {
                        count++;
                    }
                    z = z ^ nums[j];
                }
                if (nums[i] == z){
                    count++;
                }
            }
            System.out.println(count);
        }

    }

}
