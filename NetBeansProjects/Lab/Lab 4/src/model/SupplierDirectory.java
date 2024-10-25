//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

import java.util.ArrayList;
import java.util.Iterator;

public class SupplierDirectory {
    private ArrayList<Supplier> supplierList = new ArrayList();

    public SupplierDirectory() {
    }

    public ArrayList<Supplier> getSupplierList() {
        return this.supplierList;
    }

    public Supplier addSupplier() {
        Supplier s = new Supplier();
        this.supplierList.add(s);
        return s;
    }

    public void removeSupplier(Supplier s) {
        this.supplierList.remove(s);
    }

    public Supplier searchSupplier(String keyWord) {
        Iterator var2 = this.supplierList.iterator();

        Supplier s;
        do {
            if (!var2.hasNext()) {
                return null;
            }

            s = (Supplier)var2.next();
        } while(!keyWord.equals(s.getSupplyName()));

        return s;
    }
}
