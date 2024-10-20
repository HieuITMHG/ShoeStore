/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import Enums.StatusType;

public class Order extends BaseEntity {
    private int OrderID;
    private int AccountID;
    private float TotalPrice;
    private StatusType StatusType;

    public Order(int OrderID, int AccountID, float TotalPrice, StatusType StatusType) {
        this.OrderID = OrderID;
        this.AccountID = AccountID;
        this.TotalPrice = TotalPrice;
        this.StatusType = StatusType;
    }

    public int getOrderID() {
        return OrderID;
    }

    public int getAccountID() {
        return AccountID;
    }

    public float getTotalPrice() {
        return TotalPrice;
    }
    
    public StatusType getStatusType() {
        return StatusType;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }

    public void setTotalPrice(float TotalPrice) {
        this.TotalPrice = TotalPrice;
    }
    
    public void setTotalPrice(StatusType StatusType) {
        this.StatusType = StatusType;
    }
    
    
}
