/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package social_media_application;

import java.sql.*;

/**
 *
 * @author shrut
 */
public class Connect {

    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/social?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "12345";

        return DriverManager.getConnection(url, user, password);
    }
    
}
