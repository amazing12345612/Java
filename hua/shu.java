package hua;

import java.util.*;

public class shu {
    static ArrayList<Integer>[] graph;
    static Set<Integer> b;

    static List<ArrayList<Integer>> ans;
    public static void main(String[] args) {
            ans = new ArrayList<>();
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int e = scan.nextInt();
            graph = new ArrayList[n];
            int i = 0;
            while(i<n){
                graph[i] = new ArrayList<>();
                i++;
            }
            for(int j = 0;j<e;j++){
                int x = scan.nextInt();
                int y = scan.nextInt();
                graph[x].add(y);
                graph[y].add(x);
            }
            int nu = scan.nextInt();
            b = new HashSet<>();//无法通过节点集合
            for(int k = 0;k<nu;k++){
                b.add(scan.nextInt());
            }
            dfs(0,-1,new ArrayList<>());
            if(ans.size()==0){
                System.out.println("NULL");
                return;
            }
            ans.sort((x,y)->x.size()-y.size());
            int min = ans.get(0).size();
            ArrayList<ArrayList<Integer>> nans =new ArrayList<>();
            for(int k =0;k<ans.size();k++) {
                if(ans.get(i).size()>min){
                    break;
                }
                nans.add(ans.get(i));
            }
            nans.sort((x,y)->{
                int u = x.size();
                for(int j = 0;j<u;j++){
                    if(x.get(j) == y.get(j)){
                        continue;
                    }
                    return x.get(j)-y.get(j);
                }
                return 0;
            });
            ArrayList<Integer> s = nans.get(0);
            StringBuilder l = new StringBuilder();

            l.append("0");
            for(int k = 1;k<s.size();k++){
                l.append("->").append(s.get(i));
            }
            System.out.println(l);

     }
     public static void dfs(int c,int pre,ArrayList<Integer> p){
        if(graph[c].size() == 1 && graph[c].get(0) == pre){
            p.add(c);
            ans.add(new ArrayList<>(p));
            return;
        }
        for(int x : graph[c]){
            if(x  == pre ){
                continue;
            }
            if(b.contains(x)){
                continue;
            }
            p.add(c);
            dfs(x,c,p);
            p.remove(p.size()-1);

        }
     }
}
