package shoestore;   

import Views.LoginFrame;
import Controllers.AccountController;

public class ShoeStore {
    public static void main(String[] args) {
         LoginFrame loginFrame = new LoginFrame();
         AccountController accountController = new AccountController(loginFrame);
    }
}
  