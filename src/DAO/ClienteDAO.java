
/* Classe de acesso, responsável por realizar operações de CRUD (cadastrar, visualizar, atualizar e excluir) 
** no banco de dados tratando o "Cliente"
 */
package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClienteDAO {

    Connection conn; // Variável de conexão
    PreparedStatement pstm; // Variável para preparar a conexão
    ResultSet rs; // Resultado para trazer as informações da tabela
    ArrayList<ClienteDTO> lista = new ArrayList<>(); // Lista para armazenar as informações dos clientes do banco de dados

    // Realiza o cadastro (INSERT) de um cliente no banco de dados
    public void cadastrarCliente(ClienteDTO objclientedto) {
        String sql = "insert into cliente (nome_cliente, cpf_cliente, idade_cliente, endereco_cliente, renda_cliente) values (?,?,?,?,?)";

        // Estabelece a conexão com o banco de dados
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql); // Prepara a consulta SQL
            // Define o valor do primeiro, segundo, teceiro....("?") parâmetro da consulta SQL
            pstm.setString(1, objclientedto.getNome_cliente());
            pstm.setString(2, objclientedto.getCpf_cliente());
            pstm.setString(3, objclientedto.getIdade_cliente());
            pstm.setString(4, objclientedto.getEndereco_cliente());
            pstm.setString(5, objclientedto.getRenda_cliente());

            pstm.execute(); // Executa a consulta SQL
            pstm.close(); // Fecha o PreparedStatement para liberar recursos

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Cadastrar:" + erro);
        }
    }

    // Retorna uma lista de objetos ClienteDTO contendo os dados dos clientes pesquisados, ou seja, retorna a lista de clientes pronta
    public ArrayList<ClienteDTO> PesquisarCliente() {
        String sql = "select * from cliente";

        // Estabelece a conexão com o banco de dados
        conn = new ConexaoDAO().conectaBD();

        //Tenta realizar a consulta, e caso não consiga, trata a exceção
        try {
            pstm = conn.prepareStatement(sql); // Prepara a consulta SQL
            rs = pstm.executeQuery(); // Executa a consulta SQL e atribui o resultado ao ResultSet rs

            while (rs.next()) { // Enquanto o result estiver próximo (next), significa que há mais de uma linha no banco de dados               
                ClienteDTO objclienteDTO = new ClienteDTO();
                // Acessa a classe DTO através do objeto e define os valores obtidos do banco de dados
                objclienteDTO.setNome_cliente(rs.getString("nome_cliente")); // Define o nome do cliente obtido do ResultSet rs
                objclienteDTO.setCpf_cliente(rs.getString("cpf_cliente"));
                objclienteDTO.setIdade_cliente(rs.getString("idade_cliente"));
                objclienteDTO.setRenda_cliente(rs.getString("renda_cliente"));
                objclienteDTO.setEndereco_cliente(rs.getString("endereco_cliente"));
                objclienteDTO.setId_cliente(rs.getInt("id_cliente"));

                lista.add(objclienteDTO); // Adiciona o objeto ClienteDTO à lista de clientes
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Pesquisar:" + erro);
        }
        return lista; // Retorna a lista de clientes encontrados no banco de dados
    }

    // Recebe um objeto ClienteDTO contendo os novos dados do cliente a serem atualizados, ou seja, atualiza as informações de um cliente no banco de dados
    public void alterarCliente(ClienteDTO objclientedto) {
        String sql = "update cliente set nome_cliente = ?, cpf_cliente = ?, idade_cliente = ?, endereco_cliente = ?, renda_cliente = ? where id_cliente = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objclientedto.getNome_cliente());
            pstm.setString(2, objclientedto.getCpf_cliente());
            pstm.setString(3, objclientedto.getIdade_cliente());
            pstm.setString(4, objclientedto.getEndereco_cliente());
            pstm.setString(5, objclientedto.getRenda_cliente());
            pstm.setInt(6, objclientedto.getId_cliente());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Alterar:" + erro);
        }
    }

    // Exclusão do cliente no banco de dados
    public void excluirCliente(ClienteDTO objclientedto) {
        String sql = "delete from cliente where id_cliente = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objclientedto.getId_cliente()); // Define o valor do parâmetro ID do cliente para a consulta SQL de exclusão

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Excluir:" + erro);
        }
    }
}
