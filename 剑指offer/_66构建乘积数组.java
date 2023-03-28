package 剑指offer;

public class _66构建乘积数组 {
    public int[] constructArr(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        if(n == 0){
            return  b;
        }
        b[0] = 1;
        for(int i = 1;i<n;i++){
            b[i] = b[i-1]*a[i-1];
        }
        int temp = 1;
        for(int i = n-2;i>=0;i--){
            temp *= a[i+1];
            b[i] *= temp;
        }
        return b;
    }
}
