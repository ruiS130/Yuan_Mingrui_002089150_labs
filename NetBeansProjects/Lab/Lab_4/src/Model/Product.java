/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author ruirui
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon logoImage;
    
    private ArrayList<Feature> features;

    private static int count = -3;
    
    public Product() {
        count++;
        id = count;
        
        features = new ArrayList<Feature>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    @Override
    public String toString() {
        return name;
    }

    public Feature addNewFeature() {
        Feature newFeature = new Feature(this);
        this.getFeatures().add(newFeature);
        return newFeature;
    }
    
}

//1. Extend "features" so that different product can share same features with different values.
//2. Add images to products..
//3. Let the supplier update his own profile
