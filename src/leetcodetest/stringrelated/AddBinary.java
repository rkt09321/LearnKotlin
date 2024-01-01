package leetcodetest.stringrelated;

import java.lang.reflect.Field;

class AddBinary {
    public String addBinary(String a, String b) {
       int indexOfA = a.length() - 1;
        int indexOfB = b.length() - 1;
		StringBuilder result = new StringBuilder(Math.max(indexOfA, indexOfB) + 2);
        int sum = 0;
        
        while(indexOfA >= 0 || indexOfB >= 0){
            
            if(indexOfA >= 0)
                if(a.charAt(indexOfA--) == '1')
                sum += 1;
            
            if(indexOfB >= 0)
                if(b.charAt(indexOfB--) == '1')
                sum += 1;
            
            result.append(sum & 1);
            sum >>= 1;
            
        }
        
        if(sum == 1)
            result.append(1);
        
        return result.reverse().toString();
    }
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        FindDifference difference = new FindDifference();
        Field f = difference.getClass().getDeclaredField("someVal");
        f.setAccessible(true);
        f.set(difference, "11");
        System.out.println(f.get(difference));
    }
    
}