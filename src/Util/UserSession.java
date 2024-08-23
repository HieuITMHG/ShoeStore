/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import Models.Account;

public class UserSession {
    private static UserSession instance;
    private Account account;

    private UserSession(Account account) {
        this.account = account;
    }

    public static UserSession getInstance(Account account) {
        if (instance == null) {
            instance = new UserSession(account);
        }
        return instance;
    }

    public Account getUser() {
        return account;
    }

    public static void clearSession() {
        instance = null;
    }
}
