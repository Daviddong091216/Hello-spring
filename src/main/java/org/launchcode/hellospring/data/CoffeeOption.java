package org.launchcode.hellospring.data;

public class CoffeeOption {
    private String flavor;

    public CoffeeOption(String flavor) {
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return flavor;
    }
}
