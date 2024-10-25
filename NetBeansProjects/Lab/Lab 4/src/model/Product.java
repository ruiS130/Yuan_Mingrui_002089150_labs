//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Product {
    private String name;
    private int price;
    private int id;
    private ImageIcon logoImage;
    private ArrayList<Feature> features;
    private static int count = -3;

    public Product() {
        ++count;
        this.id = count;
        this.features = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Feature> getFeatures() {
        return this.features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public ImageIcon getLogoImage() {
        return this.logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    public String toString() {
        return this.name;
    }

    public Feature addNewFeature() {
        Feature newFeature = new Feature(this);
        this.getFeatures().add(newFeature);
        return newFeature;
    }
}
