package turingjava;

public class ExceptionTest {
    public Integer devide(int a,int b) {
        try {
            return a/b;
        } finally {
            System.out.print("Finaly");
        }
    }

    public static void main(String[] args) {
        ExceptionTest test=new ExceptionTest();
        try {
            System.out.print(test.devide(10,0));
        } catch (Exception ex) {
            System.out.print("Division By 0!");
        }
    }
}
