package Models;

import Enums.SexType;
import Enums.RoleType;

public class Account extends BaseEntity {
    private int AccountID;
    private String Username;
    private String Password;
    private String Fullname;
    private SexType sex;
    private String Phone;
    private String Email;
    private String Address;
    private RoleType Role;

    public Account(int AccountID, String Username, String Password, String Fullname, SexType sex, String Phone, String Email, String Address, RoleType Role) {
        this.AccountID = AccountID;
        this.Username = Username;
        this.Password = Password;
        this.Fullname = Fullname;
        this.sex = sex;
        this.Phone = Phone;
        this.Email = Email;
        this.Address = Address;
        this.Role = Role;
    }
    
    public Account() {
        
    }

    public int getAccountID() {
        return AccountID;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getFullname() {
        return Fullname;
    }

    public SexType getSex() {
        return sex;
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

    public RoleType getRole() {
        return Role;
    }

    public void setAccountID(int AccountID) {
        this.AccountID = AccountID;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public void setSex(SexType sex) {
        this.sex = sex;
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

    public void setRole(RoleType Role) {
        this.Role = Role;
    }
    
}
