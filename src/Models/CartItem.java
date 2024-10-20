/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author HUU HIEU
 */
public class CartItem {
    private int artItemID;
    private int CartID;
    private int ShoeID;
    private int Quantity;

    public CartItem(int artItemID, int CartID, int ShoeID, int Quantity) {
        this.artItemID = artItemID;
        this.CartID = CartID;
        this.ShoeID = ShoeID;
        this.Quantity = Quantity;
    }

    public int getArtItemID() {
        return artItemID;
    }

    public int getCartID() {
        return CartID;
    }

    public int getShoeID() {
        return ShoeID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setArtItemID(int artItemID) {
        this.artItemID = artItemID;
    }

    public void setCartID(int CartID) {
        this.CartID = CartID;
    }

    public void setShoeID(int ShoeID) {
        this.ShoeID = ShoeID;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
    
}
