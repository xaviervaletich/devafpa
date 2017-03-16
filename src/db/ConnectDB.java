/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Salim El Moussaoui <salim.elmoussaoui.afpa2017@gmail.com>
 */
public class ConnectDB {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/airafpa";
    private static final String DB_JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_USER = "afpa";
    private static final String DB_PASSWORD = "afpa";
    
    private Connection cn = null;
    
    private ConnectDB() {
        
        try{
            Class.forName(ConnectDB.DB_JDBC_DRIVER);
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        
    }
    /**
     * this Singleton for connexion DB
     * @return 
     */
    public static ConnectDB getInstance() {
        return ConnexionBdDHolder.INSTANCE;
    }
    
    private static class ConnexionBdDHolder {

        private static final ConnectDB INSTANCE = new ConnectDB();
    }
    
    public boolean connect(){
        if(this.cn == null){
            try {
                this.cn = DriverManager.getConnection(ConnectDB.DB_URL, ConnectDB.DB_USER, ConnectDB.DB_PASSWORD);
            } catch (SQLException ex) {
                ex.printStackTrace();
                return false;
            }
        } else {
            try {
                Statement st = this.cn.createStatement();
                String requete = "SELECT 1";
                st.executeQuery(requete);
                
            } catch (SQLException ex) {
                try {
                    this.cn = DriverManager.getConnection(ConnectDB.DB_URL, ConnectDB.DB_USER, ConnectDB.DB_PASSWORD);
                } catch (SQLException ex1) {
                    ex1.printStackTrace();
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public Connection getConnectionManager(){
        return this.cn;
    }
}
