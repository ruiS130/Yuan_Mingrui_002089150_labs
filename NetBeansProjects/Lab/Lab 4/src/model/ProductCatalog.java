//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;

public class ProductCatalog {
    private ArrayList<Product> productCatalog = new ArrayList();

    public ProductCatalog() {
        this.populateDemoData();
    }

    public ArrayList<Product> getProductCatalog() {
        return this.productCatalog;
    }

    public Product addProduct() {
        Product p = new Product();
        this.productCatalog.add(p);
        return p;
    }

    public void removeProduct(Product p) {
        this.productCatalog.remove(p);
    }

    public Product searchProduct(int id) {
        Iterator var2 = this.productCatalog.iterator();

        Product p;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            p = (Product)var2.next();
        } while(p.getId() != id);

        return p;
    }

    public int getProductCount() {
        return this.productCatalog.size();
    }

    public Product addProduct(Product p) {
        this.productCatalog.add(p);
        return p;
    }

    private void populateDemoData() {
        Product prod1 = new Product();
        prod1.setName("Monitor");
        prod1.setPrice(500);
        prod1.addNewFeature().setName("Resolution").setValue("1920x1080");
        prod1.addNewFeature().setName("Screen Size").setValue("27 inch ");
        prod1.addNewFeature().setName("Refresh Rate").setValue("60 FPS");
        this.addProduct(prod1);
        ImageIcon moniImg = new ImageIcon("src/PICS/monitor.png");
        prod1.setLogoImage(moniImg);
        Product prod2 = new Product();
        prod2.setName("Music Player");
        prod2.setPrice(230);
        prod2.addNewFeature().setName("Resolution").setValue("1024x768");
        prod2.addNewFeature().setName("Screen Size").setValue("5 inch ");
        prod2.addNewFeature().setName("Battery").setValue("5000 mAh");
        this.addProduct(prod2);
        ImageIcon musImg = new ImageIcon("src/PICS/musicplayer.png");
        prod2.setLogoImage(musImg);
        Product prod3 = new Product();
        prod3.setName("Laptop");
        prod3.setPrice(1300);
        prod3.addNewFeature().setName("Manufacture Year").setValue("2023");
        prod3.addNewFeature().setName("Screen Size").setValue("16 inch ");
        prod3.addNewFeature().setName("Battery").setValue("10000 mAh");
        this.addProduct(prod3);
        ImageIcon laptopImg = new ImageIcon("src/PICS/laptop.png");
        prod3.setLogoImage(laptopImg);
    }
}
