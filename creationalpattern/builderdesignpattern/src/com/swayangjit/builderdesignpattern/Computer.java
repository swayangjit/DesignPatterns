package com.swayangjit.builderdesignpattern;

public class Computer {
    // required parameter
    private String ram;
    private String hdd;

    // optional parameter
    private boolean isGraphicsCardEnabled;
    private boolean isBlutoothEnabled;

    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBlutoothEnabled() {
        return isBlutoothEnabled;
    }

    public Computer(ComputerBuilder builder){
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBlutoothEnabled = builder.isBlutoothEnabled;
    }

    // Builder class
    public static class ComputerBuilder{

        // required parameter
        private String ram;
        private String hdd;

        // optional parameter
        private boolean isGraphicsCardEnabled;
        private boolean isBlutoothEnabled;

        public ComputerBuilder(String ram, String hdd){
            this.ram = ram;
            this.hdd = hdd;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            this.isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBlutoothEnabled(boolean blutoothEnabled) {
            this.isBlutoothEnabled = blutoothEnabled;
            return this;
        }

        public Computer build(){
            return  new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBlutoothEnabled=" + isBlutoothEnabled +
                '}';
    }
}
