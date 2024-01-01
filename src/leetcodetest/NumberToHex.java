package leetcodetest;

class NumberToHex {
    public String toHex(int num) {
        
        char[] hexVal = {'0','1','2','3','4','5','6',
                         '7','8','9','a','b','c','d','e','f'};

        String str = "";
        
        if(num==0)
            return "0";
        
        while(num!=0)
        {
            int digit = num & 15;
            str = Character.toString(hexVal[digit])+str;
            num=num>>>4;
            
        }
        return str;
    }
}