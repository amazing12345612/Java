package 动态规划;

public class _152乘积最大字数组 {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] dpmin = new int[n];
        int[] dpmax = new int[n];
        int max = nums[0];
        dpmin[0] = nums[0];
        dpmax[0] = nums[1];
        for(int i = 1;i<n;i++){
            dpmax[i] = Math.max(Math.max(dpmax[i-1]*nums[i],dpmin[i-1]*nums[i]),nums[i]);
            dpmin[i] = Math.min(Math.max(dpmax[i-1]*nums[i],dpmin[i-1]*nums[i]),nums[i]);
            if (dpmax[i]>max){
                max = dpmax[i];
            }
        }
        return max;
    }
}
