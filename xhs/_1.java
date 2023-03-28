package xhs;

import java.util.*;

public class _1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int[] ans = new int[m];

        int i = 0;
        while(i<m){
            int cnt = 0;
            int idx = 0;
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] nums = new int[n];
            int[] snums = new int[n];
            int z = 0;
            while(z<n){
                nums[z] = scan.nextInt();
                snums[z] = scan.nextInt();
                z++;
            }
            Arrays.sort(snums);
            for (int l = 0;l<n;l++){
                if(nums[l] == snums[idx]){
                    idx += 1;
                    cnt+=1;
                }
            }
            double a = n-cnt;
            double b = k;
            ans[i] = (int)Math.ceil(a/b);

            i++;
        }
        for (int v=0;v<m;v++){
            System.out.println(ans[v]);
        }
    }

}
