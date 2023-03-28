package 剑指offer;

public class _14剪绳子 {

    public static int cuttingRope(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2;i<n+1;i++){
            for(int j = 1;j<i;j++){
                dp[i] = Math.max(Math.max(dp[i],j*dp[i-j]),j*(i-j));
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int ans = cuttingRope(2);
        System.out.println(ans);
    }

}
