package turingjava;

public class Box {
    int width;
    int height;
    int length;
}
class MainClass {
    public static void main(String[] args) {
        Box obj1=new Box();
        Box obj2=new Box();
        obj1.height=1;
        obj1.length=2;
        obj1.width=1;
        obj2=obj1;
        System.out.print(obj2.height);
    }
}