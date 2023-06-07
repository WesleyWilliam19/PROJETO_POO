package VIEW;

import DAO.ClienteDAO;
import DAO.EmprestimoDAO;
import DTO.ClienteDTO;
import DTO.EmprestimoDTO;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class frmEmprestimoVIEW extends javax.swing.JFrame {

    private ClienteDAO clienteDAO;
    private EmprestimoDAO emprestimoDAO;

    public frmEmprestimoVIEW() {
        initComponents();
        clienteDAO = new ClienteDAO(); // Instancia o ClienteDAO para manipulação dos dados dos clientes
        emprestimoDAO = new EmprestimoDAO(); // Instancia o EmprestimoDAO para manipulação dos dados dos empréstimos
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
        btnDarBaixa = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnSair = new javax.swing.JMenu();
        btnInicio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPRÉSTIMOS");

        lblNomeCliente.setText("ID do Cliente");

        lblValorEmprestimo.setText("Valor do Emprestimo");

        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });

        txtValorEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorEmprestimoActionPerformed(evt);
            }
        });

        btnRegistrarEmprestimo.setText("Confirmar");
        btnRegistrarEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmprestimoActionPerformed(evt);
            }
        });

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
        jScrollPane2.setViewportView(tblEmprestimos);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnDarBaixa.setText("Baixa do título");
        btnDarBaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarBaixaActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");

        btnInicio.setText("Início");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        btnSair.add(btnInicio);

        jMenuBar1.add(btnSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeCliente)
                        .addGap(82, 82, 82)
                        .addComponent(lblValorEmprestimo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtValorEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrarEmprestimo)
                        .addGap(26, 26, 26)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnDarBaixa))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeCliente)
                    .addComponent(lblValorEmprestimo))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarEmprestimo)
                    .addComponent(btnExcluir)
                    .addComponent(btnDarBaixa))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed

    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void txtValorEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorEmprestimoActionPerformed

    }//GEN-LAST:event_txtValorEmprestimoActionPerformed

    private void btnRegistrarEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmprestimoActionPerformed
        registrarEmprestimo();
    }//GEN-LAST:event_btnRegistrarEmprestimoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluirEmprestimo();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnDarBaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBaixaActionPerformed
        int linhaSelecionada = tblEmprestimos.getSelectedRow();

        if (linhaSelecionada >= 0) {
            // Obtém o protocolo do empréstimo da linha selecionada na tabela
            String protocolo = tblEmprestimos.getValueAt(linhaSelecionada, 1).toString();
            String valorBaixaStr = JOptionPane.showInputDialog(this, "Informe o valor da baixa:");

            if (valorBaixaStr != null && !valorBaixaStr.isEmpty()) {
                double valorBaixa = Double.parseDouble(valorBaixaStr);  // Converte o valor da baixa para double

                EmprestimoDTO emprestimoDTO = emprestimoDAO.buscarEmprestimoPorProtocolo(protocolo);  // Busca o empréstimo pelo protocolo informado

                if (emprestimoDTO != null) {
                    double valorRestante = emprestimoDTO.getValor_emprestimo() - valorBaixa; // Calcula o valor restante do empréstimo após a baixa

                    if (valorRestante >= 0) {
                        // Atualiza o valor do empréstimo com o valor restante (Update)
                        emprestimoDTO.setValor_emprestimo(valorRestante);
                        emprestimoDAO.atualizarEmprestimo(emprestimoDTO);

                        JOptionPane.showMessageDialog(this, "Baixa realizada com sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);

                        carregarDadosTabela();
                    } else {
                        JOptionPane.showMessageDialog(this, "O valor da baixa é maior que o valor do empréstimo.", "ERRO!", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDarBaixaActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        this.dispose();
        new frmPrincipalVIEW().setVisible(true);
    }//GEN-LAST:event_btnInicioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //Connection conn = new ConexaoDAO().conectaBD();
                new frmEmprestimoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDarBaixa;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JMenuItem btnInicio;
    private javax.swing.JButton btnRegistrarEmprestimo;
    private javax.swing.JMenu btnSair;
    private javax.swing.JMenuBar jMenuBar1;
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

        // Obtém a lista de empréstimos a partir do EmprestimoDAO
        List<EmprestimoDTO> emprestimos = emprestimoDAO.listarEmprestimos();
        // Obtém a lista de clientes a partir do ClienteDAO
        List<ClienteDTO> clientes = clienteDAO.PesquisarCliente();

        // Itera sobre cada empréstimo na lista de empréstimos
        for (EmprestimoDTO emprestimo : emprestimos) {
            ClienteDTO clienteEncontrado = null;

            // Encontra o cliente correspondente ao empréstimo
            for (ClienteDTO cliente : clientes) {
                if (cliente.getId_cliente() == emprestimo.getId_cliente()) {
                    clienteEncontrado = cliente;
                    break;
                }
            }
            // Verifica se o cliente foi encontrado
            if (clienteEncontrado != null) {
                // Cria um array de objetos contendo os dados do empréstimo e do cliente
                Object[] rowData = {
                    clienteEncontrado.getNome_cliente(),
                    emprestimo.getProtocolo(),
                    emprestimo.getValor_emprestimo(),
                    emprestimo.getData_hora_emprestimo().toLocalDate()
                };

                model.addRow(rowData); // Adiciona os dados à tabela
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

        // Verifica se os campos não estão vazios
        if (!idClienteStr.isEmpty() && !valorEmprestimoStr.isEmpty()) {
            int idCliente = Integer.parseInt(idClienteStr);

            // Verifica se o valor do empréstimo contém apenas números
            if (!valorEmprestimoStr.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "O campo Valor do Empréstimo deve conter apenas números.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double valorEmprestimo = Double.parseDouble(valorEmprestimoStr); // Converte o valor do empréstimo para double

            // Obter informações do cliente pelo ID
            ClienteDAO clienteDAO = new ClienteDAO();  // Instancia a classe ClienteDAO
            ClienteDTO cliente = clienteDAO.obterClientePorId(idCliente);

            // Define o valor mínimo de emprestimo para 1000 reais
            if (valorEmprestimo < 1000) {
                JOptionPane.showMessageDialog(this, "O valor do empréstimo não pode ser inferior a R$1.000,00 (mil reais).");
                return;
            }

            // verifica se o cliente existe
            if (cliente != null) {
                double renda = Double.parseDouble(cliente.getRenda_cliente()); //converte a string para double

                // Realiza o emprestimo somente se a renda do cliente for maior ou igual a 1300 (aprox 1 salario mínimo)
                if (renda >= 1300) {
                    // Se o valor do empréstimo digitado for maior que 3x a renda, o emprestimo não é autorizado.
                    if (valorEmprestimo > (3 * renda)) {
                        JOptionPane.showMessageDialog(this, "O valor do empréstimo excede o limite permitido.", "Empréstimo recusado!", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Este cliente não possui uma renda compatível com o valor desejado.", "Empréstimo recusado!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                LocalDateTime dataHoraEmprestimo = LocalDateTime.now();
                String protocolo = dataHoraEmprestimo.format(DateTimeFormatter.ofPattern("ddMMyyyyHHmm")) + idCliente;

                EmprestimoDTO emprestimoDTO = new EmprestimoDTO(); // Cria um novo objeto EmprestimoDTO
                emprestimoDTO.setId_cliente(idCliente); // Define o id do cliente no objeto emprestimoDTO
                emprestimoDTO.setValor_emprestimo(valorEmprestimo); // Define o valor do empréstimo no objeto emprestimoDTO
                emprestimoDTO.setData_hora_emprestimo(dataHoraEmprestimo); // Define a data e hora do empréstimo no objeto emprestimoDTO
                emprestimoDTO.setProtocolo(protocolo); // Define o protocolo do empréstimo no objeto emprestimoDTO

                EmprestimoDAO emprestimoDAO = new EmprestimoDAO();  // Instancia a classe EmprestimoDAO
                emprestimoDAO.inserirEmprestimo(emprestimoDTO); // Insere o empréstimo na base de dados

                JOptionPane.showMessageDialog(this, "Empréstimo aprovado com sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);

                limparCampos();
                carregarDadosTabela();
            } else {
                JOptionPane.showMessageDialog(this, "Cliente não encontrado!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void excluirEmprestimo() {
        int linhaSelecionada = tblEmprestimos.getSelectedRow();

        if (linhaSelecionada >= 0) {
            int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja excluir o empréstimo selecionado?");

            if (confirmacao == JOptionPane.YES_OPTION) { // Exibe uma caixa de diálogo de confirmação para a exclusão
                DefaultTableModel model = (DefaultTableModel) tblEmprestimos.getModel();
                String protocolo = (String) model.getValueAt(linhaSelecionada, 1);
                // Obtém o protocolo do empréstimo selecionado na tabela

                // Busca o objeto EmprestimoDTO com base no protocolo selecionado na tabela
                EmprestimoDTO emprestimoDTO = emprestimoDAO.buscarEmprestimoPorProtocolo(protocolo);

                if (emprestimoDTO != null) {
                    emprestimoDAO.excluirEmprestimo(emprestimoDTO.getId_emprestimo()); // Remove o empréstimo da base de dados
                    model.removeRow(linhaSelecionada); // Remove a linha da tabela
                    JOptionPane.showMessageDialog(this, "Empréstimo excluído com sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Não foi possível encontrar o empréstimo selecionado!", "ERRO!", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um empréstimo para excluir!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
    }

}
