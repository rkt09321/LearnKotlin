package leetcode;

public class HelloWorld{
    
    public static boolean isValid(String str) {
        int count=0;
      
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='x') {
                if(i>0 &&(str.charAt(i-1)=='y') && count!=0) {
                  return false;  
                }
                count+=1;
            } else {
               count-=1;
             
            }
        }
        return count==0;
    }

     public static void main(String []args){
          System.out.println(isValid("x"));
        
     }
}