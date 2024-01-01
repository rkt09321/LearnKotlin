package turingjava;

public class IncrementTest {
    public static void main(String[] args) {
        int x, y, z;
        x = 9;
        y = 10;
        z = ++x + y++;
        System.out.print(x+" "+y+" "+z);
    }

}
