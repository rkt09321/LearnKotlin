package leetcodetest.stringrelated;

class RemoveDuplicatefromString {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.delete(i, i + 2);
                i = Math.max(-1, i - 2);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new RemoveDuplicatefromString().removeDuplicates("abbaca"));
    }
}