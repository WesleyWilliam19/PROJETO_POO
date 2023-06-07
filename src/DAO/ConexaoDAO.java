package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ConexaoDAO {

    public Connection conectaBD() {
        Connection conn = null;

        try {
            // URL de conexão com o banco de dados MySQL
            String url = "jdbc:mysql://localhost:3306/db_sistema?user=root&password=2023";
            
            // Estabelece a conexão com o banco de dados
            conn = DriverManager.getConnection(url);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        return conn;
    }

}
