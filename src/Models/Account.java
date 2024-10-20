package Models;

public abstract class Account extends BaseEntity {
    private int AccountID;
    private String Username;
    private String Password;
    private String Roletype;

    public Account(int AccountID, String Username, String Password, String Roletype) {
        this.AccountID = AccountID;
        this.Username = Username;
        this.Password = Password;
        this.Roletype = Roletype;
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

    public String getRoletype() {
        return Roletype;
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

    public void setRoletype(String Roletype) {
        this.Roletype = Roletype;
    }
}
