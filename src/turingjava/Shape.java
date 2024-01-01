package turingjava;

import java.util.ArrayList;
import java.util.List;

public class Shape {
    private String name;
    private double diameter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
     return String.format("%s [%.2f]",getName(),getDiameter());
    }

    public Shape(String name, double diameter) {
        this.setName(name);
        this.setDiameter(diameter);
    }

    public static void main(String[] args) {
        List<Shape> list=new ArrayList<>();
        list.add(new Shape("s1",286));
        list.add(new Shape("s2",512));
        list.add(new Shape("s3",268));
        list.add(new Shape("s4",258));
        list.add(new Shape("s5",431));
        list.add(new Shape("s6",289));
        Shape s=list.stream().reduce(list.get(0),(a,b) -> a.getDiameter()> b.getDiameter()?a:b);
        System.out.print(s);
    }
}
