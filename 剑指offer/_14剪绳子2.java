package 剑指offer;

public class _14剪绳子2 {
    public static int cuttingRope(int n) {

        if (n == 4){
            return 4;
        }
        if (n<4){
            return n-1;
        }
        double ans = 1;
        while(n>4){
            ans = (ans*3)%(1e9+7);
            n -= 3;
        }
        if(n == 4){
            ans = (ans*4)%(1e9+7);
        }else{
            ans = (ans*(n-1))%(1e9+7);
        }
        return (int)ans;

    }
}
