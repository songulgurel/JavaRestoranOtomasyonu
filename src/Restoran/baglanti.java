/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restoran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class baglanti {
    static String username = "root";
    static String password = "";
    static String dbUrl = "jdbc:mysql://localhost:3306/restoran";
    
    public Connection getConnection() throws SQLException{
        return (Connection) DriverManager.getConnection(dbUrl, username, password);
    }
    
    public void ShowError(SQLException exception){
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error Code: " + exception.getErrorCode());
    }
    
}
