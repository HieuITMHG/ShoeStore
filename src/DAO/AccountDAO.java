package dao;

import Models.Account;
import Models.Admin;
import Models.User;
import Util.DBConnection;
import Enums.RoleType;
import Enums.SexType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
    public static Account getAccountByUsername(String username) {
        Account account = null;
        String query = "SELECT * FROM account WHERE Username = ?";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try {
            connection = DBConnection.getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String roleType = resultSet.getString("RoleType");
                if (roleType.equals(RoleType.ADMIN.name())) {
                    account = new Admin();
                    account.setAccountID(resultSet.getInt("Id"));
                    account.setUsername(resultSet.getString("Username"));
                    account.setPassword(resultSet.getString("Password"));
                    account.setRoletype(roleType);
                } else if (roleType.equals(RoleType.USER.name())) {
                    account = new User();
                    account.setAccountID(resultSet.getInt("Id"));
                    account.setUsername(resultSet.getString("Username"));
                    account.setPassword(resultSet.getString("Password"));
                    account.setRoletype(roleType);
                    
                    User userAccount = (User) account; 
                    
                    userAccount.setFullname(resultSet.getString("Fullname"));
                    userAccount.setSexType(resultSet.getString("Sextype"));
                    userAccount.setPhone(resultSet.getString("Phone"));
                    userAccount.setEmail(resultSet.getString("Email"));
                    userAccount.setAddress(resultSet.getString("Address"));
                    userAccount.setBalance(resultSet.getDouble("Balance")); 
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Ensure resources are closed in the reverse order of their creation
            DBConnection.closeResultSet(resultSet);
            DBConnection.closeStatement(preparedStatement);
            DBConnection.closeConnection(connection);
        }
        
        return account;
    }
}