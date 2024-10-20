/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author HUU HIEU
 */
public class Admin extends Account{
    public Admin(int AccountID, String Username, String Password, String Roletype) {
        super(AccountID, Username, Password, Roletype);
    }
    
     public Admin() {
        super();
    }
}
