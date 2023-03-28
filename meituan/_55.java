package meituan;

import java.util.*;

public class _55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        double y = scan.nextDouble();
        double x = scan.nextDouble();
        int n = scan.nextInt();
        scan.nextLine();
        double l = x*a;
        double t = a * y;
        for (int i = 0;i<n;i++){
            y = t/a;
            t += l * (21-y);
            t += (a-l);
        }
        System.out.println((int)Math.ceil(t/a));
     }
}
