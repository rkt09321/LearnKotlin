package leetcode.exception;

public class TryCatchException {
    public static void main(String[] args) {
        System.out.println(new TryCatchException().check());

    }
    int check(){
        try {
            System.out.println("try block");
            System.exit(0);
            return 2;
        } catch (Exception ex) {
            System.out.println("catch block");
            return 2;
        } finally {

            System.out.println("catch block");
            return 2;
        }
    }
}
