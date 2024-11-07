/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ruirui
 */
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
        return owner;
    }

    public void setOwner(Product owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public Feature setName(String name) {
        this.name = name;
        return this;
    }

    public Object getValue() {
        return value;
    }

    public Feature setValue(Object value) {
        this.value = value;
        return this;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
