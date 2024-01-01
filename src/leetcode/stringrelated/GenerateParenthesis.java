package leetcode.stringrelated;

import java.util.ArrayList;
import java.util.List;

class GenerateParenthesis {
    private ArrayList<String> result;
private StringBuilder build;

public List<String> generateParenthesis(int n) {
    // Use recursion with an open/closed parentheses counters
    result = new ArrayList<>();
    build = new StringBuilder();
    recurse(n, 0);
    return result;
}

private void recurse(int openLeft, int closedLeft) {
    if(openLeft == 0 && closedLeft == 0) {
        result.add(build.toString());
        return;
    }
    // Recurse append open, increment closed parentheses to be used
    if(openLeft > 0) {
        build.append("(");
        recurse(openLeft-1, closedLeft+1);
        build.deleteCharAt(build.length()-1);
    }
    if(closedLeft > 0) {
        // Recurse append closed, decrement closed parentheses to be used
        build.append(")");
        recurse(openLeft, closedLeft-1);    
        build.deleteCharAt(build.length()-1);
    }
}

    public static void main(String[] args) {
        System.out.println(new GenerateParenthesis().generateParenthesis(2));
    }
}