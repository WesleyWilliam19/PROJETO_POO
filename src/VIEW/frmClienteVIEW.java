package VIEW;

import DAO.ClienteDAO;
import DTO.ClienteDTO;
import java.util.ArrayList;
//import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmClienteVIEW extends javax.swing.JFrame {

    public frmClienteVIEW() {
        initComponents();
        listarValoresCliente();
        btnAlterar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRenda = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnLimparCampos = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnSair = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        btnIrEmprestimo = new javax.swing.JMenu();
        btnNovoEmprestimo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 235, -1));

        jLabel2.setText("Endereço");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));
        getContentPane().add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 330, -1));

        jLabel3.setText("CPF");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));
        getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 120, -1));

        jLabel4.setText("Idade");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));
        getContentPane().add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 30, -1));

        jLabel5.setText("Renda");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        getContentPane().add(txtRenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, -1));

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, -1));

        tabelaCliente.setForeground(new java.awt.Color(0, 204, 255));
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CPF", "IDADE", "RENDA", "ENDEREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 244, 540, 316));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 213, 540, 13));

        jLabel6.setText("ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtId.setBackground(new java.awt.Color(242, 242, 242));
        txtId.setEnabled(false);
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, -1));

        btnLimparCampos.setText("LIMPAR");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimparCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        btnAlterar.setText("SALVAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        btnSair.setText("Inicio");

        jMenuItem2.setText("Voltar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        btnSair.add(jMenuItem2);

        jMenuBar1.add(btnSair);

        btnIrEmprestimo.setText("Emprestimo");

        btnNovoEmprestimo.setText("Novo empréstimo");
        btnNovoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoEmprestimoActionPerformed(evt);
            }
        });
        btnIrEmprestimo.add(btnNovoEmprestimo);

        jMenuBar1.add(btnIrEmprestimo);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /* BOTÕES */
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastrarCliente();
        listarValoresCliente();
        LimparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarCliente();
        listarValoresCliente();
        LimparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        if (evt.getClickCount() == 2) {
            CarregarCampos();
        }
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ExcluirCliente();
        listarValoresCliente();
        LimparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        this.dispose();
        new frmPrincipalVIEW().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnNovoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoEmprestimoActionPerformed
        new frmEmprestimoVIEW().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoEmprestimoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmClienteVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JMenu btnIrEmprestimo;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JMenuItem btnNovoEmprestimo;
    private javax.swing.JMenu btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRenda;
    // End of variables declaration//GEN-END:variables

    /* MÉTODOS */
    // Atualiza a tabela de clientes com os dados cadastrados no banco de dados, exibindo-os na interface gráfica
    private void listarValoresCliente() {
        try {
            ClienteDAO objclientedao = new ClienteDAO(); // Cria uma instância do ClienteDAO para acessar os dados dos clientes

            DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel(); // Recupera/Acessa o modelo da tabela de clientes
            model.setNumRows(0); // Limpa todas as linhas existentes no modelo da tabela

            ArrayList<ClienteDTO> lista = objclientedao.PesquisarCliente(); // Recupera/Acessa a lista de clientes do banco de dados

            // Percorre a lista de clientes
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{ // Adiciona uma nova linha na tabela com os dados do cliente
                    //Coluna 0; 1; 2; 3; 4 ; 5
                    lista.get(num).getId_cliente(),
                    lista.get(num).getNome_cliente(),
                    lista.get(num).getCpf_cliente(),
                    lista.get(num).getIdade_cliente(),
                    lista.get(num).getRenda_cliente(),
                    lista.get(num).getEndereco_cliente()
                });

            }
            btnAlterar.setEnabled(false);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores VIEW: " + erro);
        }
        btnAlterar.setEnabled(false);
    }

    // Carrega os campos de texto com as informações do cliente selecionado na tabela, permitindo a visualização e edição dos dados
    private void CarregarCampos() {
        int setar = tabelaCliente.getSelectedRow(); // Linha selecionada / usuario digitou
        // Setamos no campo o conteudo que extraimos da tabela, linha e coluna / setar = linha (é feita assim que ocorre novo cadastro)
        txtId.setText(tabelaCliente.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaCliente.getModel().getValueAt(setar, 1).toString());
        txtCpf.setText(tabelaCliente.getModel().getValueAt(setar, 2).toString());
        txtIdade.setText(tabelaCliente.getModel().getValueAt(setar, 3).toString());
        txtRenda.setText(tabelaCliente.getModel().getValueAt(setar, 4).toString());
        txtEndereco.setText(tabelaCliente.getModel().getValueAt(setar, 5).toString());

        // Desabilita o botão de cadastrar para evitar a criação de um novo registro durante a alteração. Evita duplicidade de cadastro
        btnCadastrar.setEnabled(false);
        btnAlterar.setEnabled(true);
    }

    // Cadastro de um novo cliente no banco de dados, utilizando as informações preenchidas nos campos de texto
    private void CadastrarCliente() {
        String nome, cpf, idade, endereco, renda;

        nome = txtNome.getText();
        cpf = txtCpf.getText();
        idade = txtIdade.getText();
        endereco = txtEndereco.getText();
        renda = txtRenda.getText();

        // Verifica se todos os campos obrigatórios estão preenchidos
        if (nome.isEmpty() || cpf.isEmpty() || idade.isEmpty() || endereco.isEmpty() || renda.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica se o CPF contém apenas números
        if (!cpf.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "O campo CPF deve conter apenas números.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica se a idade contém apenas números
        if (!idade.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "O campo Idade deve conter apenas números.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica se a renda contém apenas números
        if (!renda.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "O campo Renda deve conter apenas números.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int idadeCliente = Integer.parseInt(idade);

        // Verifica se a idade é menor que 18 anos
        if (idadeCliente < 18) {
            JOptionPane.showMessageDialog(this, "A idade mínima para cadastro é 18 anos.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica se o CPF digitado possui mais ou menos de 11 dígitos
        if (cpf.length() != 11) {
            JOptionPane.showMessageDialog(this, "O CPF deve ter no máximo 11 dígitos.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cria um objeto ClienteDTO e atribui os dados fornecidos pelo usuário
        ClienteDTO objclientedto = new ClienteDTO();
        objclientedto.setNome_cliente(nome);
        objclientedto.setCpf_cliente(cpf);
        objclientedto.setIdade_cliente(idade);
        objclientedto.setEndereco_cliente(endereco);
        objclientedto.setRenda_cliente(renda);

        // Cria uma instância da classe ClienteDAO para acessar os métodos de cadastro
        ClienteDAO objclientedao = new ClienteDAO();

        // Executa o método de cadastro passando o objeto ClienteDTO como parâmetro
        objclientedao.cadastrarCliente(objclientedto);
    }

    // Limpa as caixas de texto e deixa vazio
    private void LimparCampos() {
        txtId.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtIdade.setText("");
        txtRenda.setText("");
        txtEndereco.setText("");
        txtNome.requestFocus();

        // Habilita o botão de cadastrar novamente
        btnCadastrar.setEnabled(true);
        btnAlterar.setEnabled(false);
    }

    // Atualiza as informações do cliente com os novos dados fornecidos pelo usuário
    private void AlterarCliente() {
        int id_cliente;
        String nome_cliente, cpf_cliente, idade_cliente, endereco_cliente, renda_cliente;

        nome_cliente = txtNome.getText();
        cpf_cliente = txtCpf.getText();
        idade_cliente = txtIdade.getText();
        renda_cliente = txtRenda.getText();
        endereco_cliente = txtEndereco.getText();

        // Verifica se os campos obrigatórios estão preenchidos e exibe uma mensagem de erro se algum campo estiver vazio
        if (nome_cliente.isEmpty() || cpf_cliente.isEmpty() || idade_cliente.isEmpty() || renda_cliente.isEmpty() || endereco_cliente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Erro: Preencha todos os campos obrigatórios!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica se o CPF contém apenas números
        if (!cpf_cliente.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "O campo CPF deve conter apenas números.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica se a idade contém apenas números
        if (!idade_cliente.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "O campo Idade deve conter apenas números.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica se a renda contém apenas números
        if (!renda_cliente.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "O campo Renda deve conter apenas números.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Converte a idade para um valor numérico
        int idade = Integer.parseInt(idade_cliente);

        // Verifica se o CPF digitado possui mais ou menosde 11 dígitos
        if (cpf_cliente.length() != 11) {
            JOptionPane.showMessageDialog(this, "O CPF deve ter no máximo 11 dígitos.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica se a idade é menor que 18 anos
        if (idade < 18) {
            JOptionPane.showMessageDialog(this, "A idade mínima para cadastro é 18 anos.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Captura a exceção NumberFormatException que pode ocorrer ao converter o texto do campo ID em um valor numérico. 
        try {
            id_cliente = Integer.parseInt(txtId.getText());
        } // Exibe uma mensagem de erro ao usuário informando que o campo ID deve conter um valor numérico válido e interrompe a execução do método.
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: O campo ID deve conter um valor numérico válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cria um objeto ClienteDTO e atribui os dados fornecidos pelo usuário
        ClienteDTO objclientedto = new ClienteDTO();
        objclientedto.setId_cliente(id_cliente);
        objclientedto.setNome_cliente(nome_cliente);
        objclientedto.setCpf_cliente(cpf_cliente);
        objclientedto.setIdade_cliente(idade_cliente);
        objclientedto.setRenda_cliente(renda_cliente);
        objclientedto.setEndereco_cliente(endereco_cliente);

        // Cria uma instância da classe ClienteDAO para acessar os métodos de cadastro
        ClienteDAO objclientedao = new ClienteDAO();

        // Executa o método de cadastro passando o objeto ClienteDTO como parâmetro
        objclientedao.alterarCliente(objclientedto);
    }

    private void ExcluirCliente() {
        String idText = txtId.getText();

        // Verifica se o campo de ID está vazio, o que indica que nenhum cliente foi selecionado
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Clique duas vezes no cliente.", "Erro na operação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int id_cliente = Integer.parseInt(idText); // Converte o ID do cliente de texto para um valor inteiro

        // Confirmação para excluir o cliente
        int option = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir este cliente?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // Cria um objeto ClienteDTO e define o ID do cliente a ser excluído
            ClienteDTO objclientedto = new ClienteDTO();
            objclientedto.setId_cliente(id_cliente);

            // Cria uma instância da classe ClienteDAO para acessar os métodos de exclusão
            ClienteDAO objclientedao = new ClienteDAO();

            // Chama o método de exclusão passando o objeto ClienteDTO como parâmetro
            objclientedao.excluirCliente(objclientedto);
        }
        btnAlterar.setEnabled(false);
    }

}
