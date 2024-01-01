package leetcodetest.stringrelated;
// https://leetcode.com/problems/find-the-difference/
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class FindDifference extends SecurityManager {
    private String someVal="Raj";
    public char findTheDifference(String s, String t) {
         List<Character> chars=new ArrayList<>();
        for(char c: t.toCharArray())
            chars.add(c);
        for(char ch: s.toCharArray()){
            if(chars.contains(ch))
                chars.remove(chars.indexOf(ch));
        }
        return chars.get(0);
    }

    @Override
    public void checkPackageAccess(String pkg){

        // don't allow the use of the reflection package
        if(pkg.equals("java.lang.reflect")){
            throw new SecurityException("Reflection is not allowed!");
        }
    }


}