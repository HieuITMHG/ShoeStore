/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author HUU HIEU
 */
public class User extends Account{
    private String Fullname;
    private String SexType;
    private String Phone;
    private String Email;
    private String Address;
    private double Balance;

    public User(String Fullname, String Phone, String Email, String Address, double Balance, int AccountID
            , String Username, String Password, String Roletype, String SexType) {
        super(AccountID, Username, Password, Roletype);
        this.Fullname = Fullname;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
        this.Balance = Balance;
        this.SexType = SexType;
    }
    
    public User() {

    }

    public String getFullname() {
        return Fullname;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getAddress() {
        return Address;
    }

    public double getBalance() {
        return Balance;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public String getSexType() {
        return SexType;
    }

    public void setSexType(String SexType) {
        this.SexType = SexType;
    }
    
    
    
}
