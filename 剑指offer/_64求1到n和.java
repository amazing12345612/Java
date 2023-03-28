package 剑指offer;

public class _64求1到n和 {
    public int sumNums(int n) {
       boolean   x = n>1 &&  (n +=sumNums(n-1))>0;
       return n;
    }
}
