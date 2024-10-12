/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.util.*;
/**
 *
 * @author ruirui
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;
    
    public SupplierDirectory() {
        supplierList = new ArrayList<Supplier>();
    }
    
    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }
    
    public Supplier addSupplier() {
        Supplier supp1 = new Supplier();
        supplierList.add(supp1);
        return supp1;
    }
    
    public void removeSupplier(Supplier s) {
        supplierList.remove(s);
    }
    
    public Supplier searchSupplier(String keyword) {
        for(Supplier s: supplierList) {
            if(keyword.equals(s.getSupplyName())) {
                return s;
            }
        }
        return null;
    }
    
}
