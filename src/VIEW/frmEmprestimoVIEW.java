package VIEW;

import DAO.ClienteDAO;
import DAO.ConexaoDAO;
import DAO.EmprestimoDAO;
import DTO.ClienteDTO;
import DTO.EmprestimoDTO;
import java.sql.Connection;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class frmEmprestimoVIEW extends javax.swing.JFrame {

    private ClienteDAO clienteDAO;
    private EmprestimoDAO emprestimoDAO;

    public frmEmprestimoVIEW() {
        initComponents();
        clienteDAO = new ClienteDAO();
        emprestimoDAO = new EmprestimoDAO();
        carregarDadosTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeCliente = new javax.swing.JLabel();
        lblValorEmprestimo = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtValorEmprestimo = new javax.swing.JTextField();
        btnRegistrarEmprestimo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmprestimos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeCliente.setText("ID do Cliente");
        getContentPane().add(lblNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 29, -1, -1));

        lblValorEmprestimo.setText("Valor do Emprestimo");
        getContentPane().add(lblValorEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 29, -1, -1));

        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 51, 110, -1));

        txtValorEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorEmprestimoActionPerformed(evt);
            }
        });
        getContentPane().add(txtValorEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 51, 110, -1));

        btnRegistrarEmprestimo.setText("Confirmar");
        btnRegistrarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmprestimoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        tblEmprestimos.setAutoCreateRowSorter(true);
        tblEmprestimos.setForeground(new java.awt.Color(0, 204, 255));
        tblEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Nº Protocolo", "Valor de empréstimo", "Data do empréstimo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmprestimos.setRowSorter(null);
        jScrollPane2.setViewportView(tblEmprestimos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 431, 348));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 124, 431, 10));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed

    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void txtValorEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorEmprestimoActionPerformed

    }//GEN-LAST:event_txtValorEmprestimoActionPerformed

    private void btnRegistrarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmprestimoActionPerformed
        registrarEmprestimo();
    }//GEN-LAST:event_btnRegistrarEmprestimoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        excluirEmprestimo();
    }//GEN-LAST:event_btnExcluirActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Connection conn = new ConexaoDAO().conectaBD();
                new frmEmprestimoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnRegistrarEmprestimo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblValorEmprestimo;
    private javax.swing.JTable tblEmprestimos;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtValorEmprestimo;
    // End of variables declaration//GEN-END:variables

    private void carregarDadosTabela() {
        DefaultTableModel model = (DefaultTableModel) tblEmprestimos.getModel();
        model.setRowCount(0); // Limpa os dados existentes na tabela

        List<EmprestimoDTO> emprestimos = emprestimoDAO.listarEmprestimos();

        for (EmprestimoDTO emprestimo : emprestimos) {
            ArrayList<ClienteDTO> clientes = clienteDAO.PesquisarCliente();

            for (ClienteDTO cliente : clientes) {
                if (cliente.getId_cliente() == emprestimo.getId_cliente()) {
                    String nomeCliente = cliente.getNome_cliente();

                    Object[] rowData = {
                        nomeCliente,
                        emprestimo.getProtocolo(),
                        emprestimo.getValor_emprestimo(),
                        emprestimo.getData_hora_emprestimo()
                    };

                    model.addRow(rowData);
                    break; // Interrompe o loop interno assim que encontrar o cliente correspondente
                }
            }
        }
    }

    private void limparCampos() {
        txtIdCliente.setText("");
        txtValorEmprestimo.setText("");
    }

    private void registrarEmprestimo() {
        String idClienteStr = txtIdCliente.getText();
        String valorEmprestimoStr = txtValorEmprestimo.getText();

        if (!idClienteStr.isEmpty() && !valorEmprestimoStr.isEmpty()) {
            int idCliente = Integer.parseInt(idClienteStr);

            // Verifica se o valor do empréstimo contém apenas números
            if (!valorEmprestimoStr.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "O campo Valor do Empréstimo deve conter apenas números.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double valorEmprestimo = Double.parseDouble(valorEmprestimoStr);

            LocalDateTime dataHoraEmprestimo = LocalDateTime.now();
            String protocolo = idCliente + "-" + dataHoraEmprestimo.format(DateTimeFormatter.ofPattern("ddMMyyyy-HHmm"));

            EmprestimoDTO emprestimoDTO = new EmprestimoDTO();
            emprestimoDTO.setId_cliente(idCliente);
            emprestimoDTO.setValor_emprestimo(valorEmprestimo);
            emprestimoDTO.setData_hora_emprestimo(dataHoraEmprestimo);
            emprestimoDTO.setProtocolo(protocolo);

            emprestimoDAO.inserirEmprestimo(emprestimoDTO);

            JOptionPane.showMessageDialog(this, "Empréstimo registrado com sucesso!");

            limparCampos();
            carregarDadosTabela();
        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!");
        }
    }

    private void excluirEmprestimo() {
        int linhaSelecionada = tblEmprestimos.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja excluir o empréstimo selecionado?");

            if (confirmacao == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) tblEmprestimos.getModel();
                String protocolo = (String) model.getValueAt(linhaSelecionada, 1);

                EmprestimoDTO emprestimoDTO = new EmprestimoDTO();
                emprestimoDTO.setProtocolo(protocolo);

                emprestimoDAO.excluirEmprestimo(emprestimoDTO);

                JOptionPane.showMessageDialog(this, "Empréstimo excluído com sucesso!");

                carregarDadosTabela();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um empréstimo para excluir!");
        }
    }

}
