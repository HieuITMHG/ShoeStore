/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author HUU HIEU
 */
public class OrderItem {
    private int OrderItemID;
    private int OrderID;
    private int ShoeID;
    private int Quantity;

    public OrderItem(int OrderItemID, int OrderID, int ShoeID, int Quantity) {
        this.OrderItemID = OrderItemID;
        this.OrderID = OrderID;
        this.ShoeID = ShoeID;
        this.Quantity = Quantity;
    }

    public int getOrderItemID() {
        return OrderItemID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public int getShoeID() {
        return ShoeID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setOrderItemID(int OrderItemID) {
        this.OrderItemID = OrderItemID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public void setShoeID(int ShoeID) {
        this.ShoeID = ShoeID;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    
}
