package turingjava;

public class Dog extends Canine {
    public void fetch() {
        System.out.print("Fetch");
    }
    @Override
    public void makeNoise() {
        System.out.print("Bark");
    }
}

abstract class Animal {
    public abstract void makeNoise();
    public abstract void move();
}

abstract class Canine extends Animal {
    public void wagTail() {
      System.out.print("Wagging");
    }
    @Override
    public void move() {
        System.out.print("Run");
    }
}
class App {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.makeNoise();
        d.move();
        d.wagTail();
        d.fetch();
        Canine c = new Dog();
        c.makeNoise();
        c.move();
        c.wagTail();
       // c.fetch();

        Animal a = new Dog();
        a.makeNoise();
        a.move();
       // a.wagTail();
       // a.fetch();
    }
}

