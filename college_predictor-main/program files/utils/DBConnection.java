/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import java.sql.*;

public  class DBConnection {
    Connection conn= null;
     public Connection createConnection(){
        try{
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_predictor?user=root&password=dbms");
            return conn;
        } catch(SQLException e) {
            System.err.println(e);
            return null;
        }
    }
}