package 剑指offer;

public class _43第1n中1出现的次数 {
    public int countDigitOne(int n) {
    //固定一位 算左右两边的1的个数
        //2235
        int high = n/10;
        int low = 0;
        int cur = n %10;
        int digit =1;
        int ans = 0;
        while(high >0 || cur > 0){
            if (cur == 1){// 2011
                ans += high*digit+low+1;
            }else if (cur == 0){ //2001
                ans += high*digit;
            }else{ //2051
                ans += (high+1)*digit;
            }
            low += cur*digit;
            cur = high%10;
            high = high/10;
            digit = digit*10;
        }
        return  ans;


    }

}
