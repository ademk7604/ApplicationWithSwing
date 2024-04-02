/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
import java.sql.*;
public class DbHelper {
    private String userName="root";
    private String passsword="Ademk1@";
    private String dbUrl="jdbc:mysql://localhost:3306/world?useSSL=false&serverTimezone=UTC";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl, userName,passsword);
    }
    
    public void showErrorMessage(SQLException exception){
        System.out.println("Error : "+exception.getMessage());
        System.out.println("Error code : "+ exception.getErrorCode());
    }
}
