package leetcodetest.stringrelated;

class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==0) {
          return 0;
        } else if(haystack.contains(needle)) {
            for(int i=0;i<haystack.length();i++) {
                if(haystack.charAt(i)==needle.charAt(0) && haystack.startsWith(needle, i)) {
                    return i;
                }
            }
        } 
        return -1;
    }
    
}