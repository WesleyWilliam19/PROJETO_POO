package DAO;

import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {
        // Estabelece a conexão com o banco de dados
        conn = new ConexaoDAO().conectaBD();

        
        try {
            // Consulta SQL para buscar o usuário no banco de dados
            String sql = "select * from usuario where nome_usuario = ? and senha_usuario = ?";

            // Cria um objeto PreparedStatement com a consulta SQL
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome_usuario()); // Define o valor do primeiro parâmetro da consulta (?)
            pstm.setString(2, objUsuarioDTO.getSenha_usuario()); /// Define o valor do segundo parâmetro da consulta (?)

            // Executa a consulta e retorna um ResultSet contendo os resultados da consulta
            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }
}
