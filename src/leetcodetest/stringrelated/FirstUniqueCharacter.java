package leetcodetest.stringrelated;

class FirstUniqueCharacter {
    public int firstUniqueChar(String s) {
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c))
                return s.indexOf(c);
        }

        return -1; 
    }
}