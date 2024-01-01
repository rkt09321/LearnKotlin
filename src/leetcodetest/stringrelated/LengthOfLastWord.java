package leetcodetest.stringrelated;

class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s!=null && s.length()>0) {
         String [] array=s.split("\\s");
            if(array.length>1) {
               return array[array.length-1].length(); 
            }
            return 0;
        }
        
       return 0; 
    }
}