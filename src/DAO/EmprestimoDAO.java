package DAO;

import DTO.EmprestimoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.time.LocalDateTime;
import java.util.ArrayList;
//import java.util.List;
import javax.swing.JOptionPane;

public class EmprestimoDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    //ArrayList<EmprestimoDTO> lista = new ArrayList<>();

    public void inserirEmprestimo(EmprestimoDTO emprestimo) {
        String sql = "insert into emprestimo (id_cliente, valor_emprestimo, data_hora_emprestimo, protocolo) VALUES (?, ?, ?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql); // Prepara a consulta SQL
            pstm.setInt(1, emprestimo.getId_cliente());
            pstm.setDouble(2, emprestimo.getValor_emprestimo());
            pstm.setTimestamp(3, java.sql.Timestamp.valueOf(emprestimo.getData_hora_emprestimo()));
            pstm.setString(4, emprestimo.getProtocolo());

            pstm.execute(); // Executa a consulta SQL
            pstm.close(); // Fecha o PreparedStatement para liberar recursos
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO Inserir:" + erro);
        }
    }

    public int getIdCliente(String nomeCliente) {
        String sql = "SELECT id_cliente FROM cliente WHERE nome_cliente = ?";

        conn = new ConexaoDAO().conectaBD();

        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, nomeCliente);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt("id_cliente");
            } else {
                return 0;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO getIdCliente: " + erro);
            return 0;
        }
    }

    public ArrayList<EmprestimoDTO> listarEmprestimos() {
        String sql = "SELECT * FROM emprestimo";

        conn = new ConexaoDAO().conectaBD();

        ArrayList<EmprestimoDTO> lista = new ArrayList<>();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                EmprestimoDTO objemprestimoDTO = new EmprestimoDTO();
                objemprestimoDTO.setId_emprestimo(rs.getInt("id_emprestimo"));
                objemprestimoDTO.setId_cliente(rs.getInt("id_cliente"));
                objemprestimoDTO.setValor_emprestimo(rs.getDouble("valor_emprestimo"));
                objemprestimoDTO.setData_hora_emprestimo(rs.getTimestamp("data_hora_emprestimo").toLocalDateTime());
                objemprestimoDTO.setProtocolo(rs.getString("protocolo"));

                lista.add(objemprestimoDTO);
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO Listar: " + erro);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + ex);
            }
        }
        return lista;
    }

    public void excluirEmprestimo(EmprestimoDTO objemprestimodto) {
        String sql = "DELETE FROM emprestimo WHERE protocolo = ?";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objemprestimodto.getProtocolo());
            pstm.execute();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EmprestimoDAO Excluir: " + erro);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão: " + erro);
            }
        }
    }
}
