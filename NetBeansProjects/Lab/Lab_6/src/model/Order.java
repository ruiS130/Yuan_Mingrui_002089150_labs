/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;

/**
 *
 * @author ruirui
 */
public class Order {
    ArrayList<OrderItem> orderItemList;
    
    public Order() {
        this.orderItemList = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    public void addNewOrderItem(Product product, double price, int quantity){
        OrderItem orderItem = new OrderItem(product, price, quantity);
        orderItemList.add(orderItem);
    }
    
    public void deleteItem(OrderItem item){
        this.orderItemList.remove(item);
    }
    

    public OrderItem findProduct(Product product) {
        ArrayList<OrderItem> al = this.getOrderItemList();
        for(int i = 0; i < al.size(); i++) {
            OrderItem oi = orderItemList.get(i);
            if(oi.getProduct().equals(product)) {
                return oi;
            }
        }
        return null;
    }
    
}
