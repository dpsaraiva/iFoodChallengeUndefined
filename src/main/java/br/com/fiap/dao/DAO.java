package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    private Connection connection;

    public DAO() {

        try {
           // Class.forName("oracle.jbdc.driver.OracleDriver");
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        
        openConnection();
        System.out.println("Conectado com sucesso!");
        return this.connection;
    }

    // Responsavel por abrir a conexão
    private void openConnection() {
        
        try {
            this.connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM88395", "280191");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection() {
        
        try {
            if (this.connection != null) {
                this.connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Executa comandos SQL (insert, update, delete)
    public int executeCommand(PreparedStatement stmt) {
        
        int j = 0;
        
        try {
            j = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        
        return j;
    }

    public ResultSet getData(PreparedStatement stmt) {
        
        ResultSet resultSet = null;
        
        try {
            resultSet = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return resultSet;
    }
    
    public void closeConnectionGetAll() {
        closeConnection();
    }

}