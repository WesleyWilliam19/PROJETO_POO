package VIEW;

import DAO.ClienteDAO;
import DTO.ClienteDTO;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmClienteVIEW extends javax.swing.JFrame {

    public frmClienteVIEW() {
        initComponents();
        setIcon();
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

        jLabel1.setText("Nome");

        jLabel2.setText("Endereço");

        jLabel3.setText("CPF");

        jLabel4.setText("Idade");

        jLabel5.setText("Renda");

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

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

        jLabel6.setText("ID");

        txtId.setBackground(new java.awt.Color(242, 242, 242));
        txtId.setEnabled(false);

        btnLimparCampos.setText("LIMPAR");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnAlterar.setText("SALVAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)
                        .addGap(227, 227, 227)
                        .addComponent(jLabel3)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnLimparCampos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCampos))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

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

        // Verifica se o NOME contém apenas letras
        if (nome.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "O campo nome deve conter apenas letras.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(this, "O CPF deve conter 11 dígitos para validar.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cria uma instância da classe ClienteDAO para acessar os métodos de cadastro
        ClienteDAO objclientedao = new ClienteDAO();

        // Verifica se o CPF já está cadastrado no banco de dados
        if (objclientedao.verificarCPFExistente(cpf)) {
            JOptionPane.showMessageDialog(this, "Já existe um cliente cadastrado com este CPF!.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cria um objeto ClienteDTO e atribui os dados fornecidos pelo usuário
        ClienteDTO objclientedto = new ClienteDTO();
        objclientedto.setNome_cliente(nome);
        objclientedto.setCpf_cliente(cpf);
        objclientedto.setIdade_cliente(idade);
        objclientedto.setEndereco_cliente(endereco);
        objclientedto.setRenda_cliente(renda);

        // Executa o método de cadastro passando o objeto ClienteDTO como parâmetro
        objclientedao.cadastrarCliente(objclientedto);
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

        // Verifica se o NOME contém apenas letras
        if (nome_cliente.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "O campo nome deve conter apenas letras.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(this, "O CPF deve conter 11 dígitos para validar.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica se a idade é menor que 18 anos
        if (idade < 18) {
            JOptionPane.showMessageDialog(this, "A idade mínima para cadastro é 18 anos.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cria uma instância da classe ClienteDAO para acessar os métodos de cadastro
        ClienteDAO objclientedao = new ClienteDAO();

        // Verifica se o CPF já está cadastrado no banco de dados
        if (objclientedao.verificarCPFExistente(cpf_cliente)) {
            JOptionPane.showMessageDialog(this, "Já existe um cliente cadastrado com este CPF!.", "Erro de validação", JOptionPane.ERROR_MESSAGE);
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

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/VIEW/Imagens/logo.png")));
    }
}
