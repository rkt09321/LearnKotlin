package javatest.designpattern.creational.builder;

public class TestBuilder {
    public static void main(String[] args) {
        BuilderPKotlin builder = new BuilderPKotlin.Builder().address("R J Raunak")
                .name("Raj").mobile("9555860932").build();
        System.out.println(builder);
    }
}
