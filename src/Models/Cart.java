/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author HUU HIEU
 */
public class Cart extends BaseEntity{
    private int CardID;
    private int AccountID;

    public Cart(int CardID, int AccountID) {
        this.CardID = CardID;
        this.AccountID = AccountID;
    }
    
    public int getCardID() {
        return CardID;
    }

    public int getAccountID() {
        return AccountID;
    }

    public void setCardID(int CardID) {
        this.CardID = CardID;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }
    
    
}
