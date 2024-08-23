package dao;

import Models.Account;
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
        String query = "SELECT * FROM Account WHERE Username = ?";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        try {
            connection = DBConnection.getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                account = new Account();
                account.setAccountID(resultSet.getInt("AccountID"));
                account.setUsername(resultSet.getString("Username"));
                account.setPassword(resultSet.getString("Password"));
                account.setFullname(resultSet.getString("Fullname"));
                account.setSex(SexType.valueOf(resultSet.getString("Sex")));
                account.setPhone(resultSet.getString("Phone"));
                account.setEmail(resultSet.getString("Email"));
                account.setAddress(resultSet.getString("Address"));
                account.setRole(RoleType.valueOf(resultSet.getString("Role")));
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