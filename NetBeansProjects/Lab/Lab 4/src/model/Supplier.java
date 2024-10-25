//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import javax.swing.ImageIcon;

public class Supplier {
    private String supplyName;
    private ProductCatalog productCatalog = new ProductCatalog();
    private ImageIcon logoImage = new ImageIcon("src/PICS/Logo.png");

    public ImageIcon getLogoImage() {
        return this.logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    public Supplier() {
    }

    public String getSupplyName() {
        return this.supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public ProductCatalog getProductCatalog() {
        return this.productCatalog;
    }

    public String toString() {
        return this.supplyName;
    }
}
