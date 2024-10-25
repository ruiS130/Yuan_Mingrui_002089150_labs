//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

public class Feature {
    private Product owner;
    private String name;
    private Object value;

    public Feature(Product owner) {
        this.owner = owner;
    }

    public Feature(Product owner, String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public Product getOwner() {
        return this.owner;
    }

    public void setOwner(Product owner) {
        this.owner = owner;
    }

    public String getName() {
        return this.name;
    }

    public Feature setName(String name) {
        this.name = name;
        return this;
    }

    public Object getValue() {
        return this.value;
    }

    public Feature setValue(Object value) {
        this.value = value;
        return this;
    }

    public String toString() {
        return this.name;
    }
}
