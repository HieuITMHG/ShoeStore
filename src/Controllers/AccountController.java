package Controllers;

import Util.UserSession;
import Models.Account;
import dao.AccountDAO;
import Views.Home;
import Views.LoginFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountController {
    private LoginFrame loginFrame;
    private Home home;

    public AccountController(LoginFrame loginFrame) {
        this.loginFrame = loginFrame;
        loginFrame.addLoginButtonListener(new LoginButtonListener());
        loginFrame.setVisible(true);
    }

    private class LoginButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = loginFrame.getUsername();
            String password = loginFrame.getPassword();
            login(username, password);
        }
    }

    public void login(String username, String password) {
        Account account = AccountDAO.getAccountByUsername(username);

        if (account != null) {
            if (password.equals(account.getPassword())) {
                UserSession session = UserSession.getInstance(account);
                JOptionPane.showMessageDialog(null, "Login successful!");

                loginFrame.setVisible(false);
                home = new Home();
                home.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "User Not Found");
        }
    }
}