/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ruirui
 */
public class ProductCatalog {
    
    private ArrayList<Product> productCatalog;
    
    public ProductCatalog() {
        productCatalog = new ArrayList<Product>();
        populateDemoData();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }
    
    public Product addProduct() {
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }
    
    public void removeProduct(Product p) {
        productCatalog.remove(p);
    }
    
    public Product searchProduct(int id) {

        for(Product p : productCatalog) {
            if(p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    
    public int getProductCount(){
        return productCatalog.size();
    }
    
    public Product addProduct(Product p) {
        productCatalog.add(p);
        return p;
    }

    private void populateDemoData() {
        Product prod1 = new Product();
        prod1.setName("Monitor");
        prod1.setPrice(500);
        
        prod1.addNewFeature().setName("Resolution").setValue("1920x1080");
        prod1.addNewFeature().setName("Screen Size").setValue("27 inch ");
        prod1.addNewFeature().setName("Refresh Rate").setValue("60 FPS");
        addProduct(prod1);
        
        Product prod2 = new Product();
        prod2.setName("Music Player");
        prod2.setPrice(230);
        
        prod2.addNewFeature().setName("Resolution").setValue("1024x768");
        prod2.addNewFeature().setName("Screen Size").setValue("5 inch ");
        prod2.addNewFeature().setName("Battery").setValue("5000 mAh");
        addProduct(prod2);
        
        Product prod3 = new Product();
        prod3.setName("Laptop");
        prod3.setPrice(1300);
        
        prod3.addNewFeature().setName("Manufacture Year").setValue("2023");
        prod3.addNewFeature().setName("Screen Size").setValue("16 inch ");
        prod3.addNewFeature().setName("Battery").setValue("10000 mAh");
        addProduct(prod3);
        
    }
}
