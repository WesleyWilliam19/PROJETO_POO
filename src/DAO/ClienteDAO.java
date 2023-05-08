
package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClienteDAO {
    
    Connection conn; //realizando conexao
    PreparedStatement pstm; //preparando conexao
    
    public void cadastrarCliente(ClienteDTO objclientedto){
        String sql = "insert into cliente (nome_cliente, cpf_cliente, idade_cliente, endereco_cliente, renda_cliente) values (?,?,?,?,?)";
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objclientedto.getNome_cliente());
            pstm.setString(2, objclientedto.getCpf_cliente());
            pstm.setString(3, objclientedto.getIdade_cliente());
            pstm.setString(4, objclientedto.getEndereco_cliente());
            pstm.setString(5, objclientedto.getRenda_cliente());
            
            pstm.execute();
            pstm.close();
            
              
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "ClienteDAO" + erro);
            
        }
    }
}
