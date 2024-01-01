package leetcodetest.stringrelated;

class ValidPalindrome {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
        StringBuilder s1 = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=48&&s.charAt(i)<=57) || (s.charAt(i)>=97 && s.charAt(i)<=122))
            s1 = s1.append(s.charAt(i)+"");
                    
        }
        for(int i=0;i<s1.length()/2;i++){
            if(s1.charAt(i)!=s1.charAt(s1.length()-1-i))
                return false;
        }
        return true;  
    }
}