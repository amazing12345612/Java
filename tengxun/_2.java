package tengxun;

import java.util.*;
public class _2 {
    public static int ans;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Set<Character> a = new HashSet<>();
        String[] s = new String[n];
        for (int j = 0 ;j < n;j++){
            s[j] = scan.nextLine();
        }
        dfs(s,0,a);
        System.out.println(ans);
    }
    public static void dfs(String[] s,int point,Set<Character> a){
        if(a.size() == s.length){
            ans += 1;
            return;
        }
        Set<Character> b = new HashSet<>();
        String t = s[point];
        char[] p = t.toCharArray();
        for(int i = 0;i<p.length;i++){
            if (a.contains(p[i]) || b.contains(p[i])){
                continue;
            }
            b.add(p[i]);
            a.add(p[i]);
            dfs(s,point+1,a);
            a.remove(p[i]);
        }
    }
}
