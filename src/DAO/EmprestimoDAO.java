package DAO;

import DTO.EmprestimoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EmprestimoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    //ArrayList<EmprestimoDTO> lista = new ArrayList<>();

    // Realiza o cadastro (INSERT) de um emprestimo no banco de dados
    public void inserirEmprestimo(EmprestimoDTO emprestimo) {
        String sql = "insert into emprestimo (id_cliente, valor_emprestimo, data_hora_emprestimo, protocolo) values (?, ?, ?, ?)";

        // Estabelece a conexão com o banco de dados
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql); // Prepara a consulta SQL
            pstm.setInt(1, emprestimo.getId_cliente());
            pstm.setDouble(2, emprestimo.getValor_emprestimo());
            pstm.setTimestamp(3, java.sql.Timestamp.valueOf(emprestimo.getData_hora_emprestimo()));
            pstm.setString(4, emprestimo.getProtocolo());

            // Executa a inserção
            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO Inserir:" + erro);
        }
    }

    // SQL para obter o ID do cliente pelo nome
    public int getIdCliente(String nomeCliente) {
        String sql = "select id_cliente from cliente where nome_cliente = ?";

        // Realiza conexão
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql); // Prepara a consulta SQL
            pstm.setString(1, nomeCliente);
            rs = pstm.executeQuery();

            if (rs.next()) {
                // Retorna o ID do cliente encontrado
                return rs.getInt("id_cliente");
            } else {
                return 0;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO getIdCliente: " + erro);
            return 0;
        }
    }

    // Lista todos os empréstimos da tabela emprestimo
    public ArrayList<EmprestimoDTO> listarEmprestimos() {
        String sql = "SELECT * FROM emprestimo";

        conn = new ConexaoDAO().conectaBD();

        ArrayList<EmprestimoDTO> lista = new ArrayList<>();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                EmprestimoDTO objemprestimoDTO = new EmprestimoDTO();
                // Definições
                objemprestimoDTO.setId_emprestimo(rs.getInt("id_emprestimo"));
                objemprestimoDTO.setId_cliente(rs.getInt("id_cliente"));
                objemprestimoDTO.setValor_emprestimo(rs.getDouble("valor_emprestimo"));
                objemprestimoDTO.setData_hora_emprestimo(rs.getTimestamp("data_hora_emprestimo").toLocalDateTime());
                objemprestimoDTO.setProtocolo(rs.getString("protocolo"));

                // Adiciona o objeto EmprestimoDTO à lista de empréstimos
                lista.add(objemprestimoDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO Listar: " + erro);
        }
        return lista;
    }

    // SQL para excluir um empréstimo pelo ID
    public void excluirEmprestimo(int idEmprestimo) {
        String sql = "delete from emprestimo where id_emprestimo = ?";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idEmprestimo);
            pstm.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO Excluir: " + erro);
        }
    }

    // SQL para buscar um empréstimo pelo protocolo
    public EmprestimoDTO buscarEmprestimoPorProtocolo(String protocolo) {
        String sql = "select * from emprestimo where protocolo = ?";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, protocolo);
            rs = pstm.executeQuery();

            if (rs.next()) {
                EmprestimoDTO emprestimoDTO = new EmprestimoDTO();
                emprestimoDTO.setId_emprestimo(rs.getInt("id_emprestimo"));
                emprestimoDTO.setId_cliente(rs.getInt("id_cliente"));
                emprestimoDTO.setValor_emprestimo(rs.getDouble("valor_emprestimo"));
                emprestimoDTO.setData_hora_emprestimo(rs.getTimestamp("data_hora_emprestimo").toLocalDateTime());
                emprestimoDTO.setProtocolo(rs.getString("protocolo"));

                // Retorna o empréstimo encontrado
                return emprestimoDTO;
            } else {
                return null; // Retorna null se não encontrar o empréstimo com o protocolo especificado
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO buscarEmprestimoPorProtocolo: " + erro);
            return null;
        }
    }

    // SQL para atualizar o valor de um empréstimo pelo protocolo
    public void atualizarEmprestimo(EmprestimoDTO emprestimo) {
        String sql = "update emprestimo set valor_emprestimo = ? where protocolo = ?";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setDouble(1, emprestimo.getValor_emprestimo());
            pstm.setString(2, emprestimo.getProtocolo());

            // Executa a atualização
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO Atualizar:" + erro);
        }
    }

}
