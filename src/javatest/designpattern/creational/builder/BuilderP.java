package javatest.designpattern.creational.builder;

public class BuilderP {
    private String name;
    private String mobile;
    private String address;

    public BuilderP(Builder builder) {
        name = builder.name;
        mobile = builder.mobile;
        address = builder.address;
    }

    static class Builder {
        private String name;
        private String mobile;
        private String address;

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        BuilderP create() {
            return new BuilderP(this);
        }
    }

    @Override
    public String toString() {
        return name+" "+mobile+" "+address;
    }
}
