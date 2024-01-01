package javatest.designpattern.testdesign;

public class MyBuilderJ {
    private String name;
    private String address;
    private int age;

    public MyBuilderJ(Builder builder) {
        this.name=builder.name;
        this.age=builder.age;
        this.address=builder.address;
    }

    static class Builder {
        private String name;
        private String address;
        private int age;
       public Builder setName(String name) {
            this.name=name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address=address;
            return this;
        }

        public Builder setAge(int age) {
            this.age=age;
            return this;
        }

        public MyBuilderJ build() {
           return new MyBuilderJ(this);
        }
    }

}
