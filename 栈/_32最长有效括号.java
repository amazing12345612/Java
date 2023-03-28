package 栈;

import java.util.Deque;
import java.util.LinkedList;

public class _32最长有效括号 {
    public int longestValidParentheses(String s) {
        Deque<Integer> stake = new LinkedList<>();
        char[] t = s.toCharArray();
        stake.push(-1);
        int max = 0;
        for(int i= 0;i<t.length;i++){
            if (t[i] == '('){
                stake.push(i);
            }else{
                stake.pop();
                if (stake.size()==0){
                    stake.push(i);
                }else{
                    int top = stake.peek();
                    int temp = i-top;
                    if (temp>max){
                        max = temp;
                    }
                }
            }
        }
        return max;
    }
}
