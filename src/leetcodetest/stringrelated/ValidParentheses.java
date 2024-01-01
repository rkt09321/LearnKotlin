package leetcodetest.stringrelated;

import java.util.HashMap;
import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) {
    Stack<Character> dq=new Stack();
    HashMap<Character,Character> hm=new HashMap<Character,Character>();
    hm.put('{','}');
    hm.put('(',')');
    hm.put('[',']');
    for(int i=0;i<s.length();i++){
        if(hm.containsKey(s.charAt(i))){
            dq.push(hm.get(s.charAt(i)));
        } else {
            if(dq.isEmpty()||dq.pop()!=s.charAt(i)) {
                return false;
            }
        }
    }
    return dq.isEmpty();
    }

    public static void main(String[] args) {
      System.out.println(new ValidParentheses().isValid("{[]}"));
    }
}