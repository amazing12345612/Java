package 剑指offer;

public class _4只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0;i<32;i++){

            int count = 0;
            for(int x: nums){
                count += x >> i & 1 ;
            }
            if(count % 3>0){
                ans |= 1<<i;
            }
        }
        return ans;
    }
}
