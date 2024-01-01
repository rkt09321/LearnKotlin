package javatest.trickyquestion;
interface IFruit {
    String TYPE="Apple";
}
class Fruit implements IFruit {

}
public class Question12 {
    public static void main(String[] args) {
            System.out.println(Fruit.TYPE);
    }
}

