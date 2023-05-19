/* A classe representa um objeto de transferência de dados tratando o "Cliente" 
** Contém os atributos que representam as informações do cliente, como nome, CPF, idade, endereço e renda.
** Permite encapsular e transportar os dados do cliente entre as camadas da aplicação.
 */
package DTO;

public class ClienteDTO {

    private int id_cliente;
    private String nome_cliente, cpf_cliente, idade_cliente, endereco_cliente, renda_cliente;

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public String getIdade_cliente() {
        return idade_cliente;
    }

    public void setIdade_cliente(String idade_cliente) {
        this.idade_cliente = idade_cliente;
    }

    public String getEndereco_cliente() {
        return endereco_cliente;
    }

    public void setEndereco_cliente(String endereco_cliente) {
        this.endereco_cliente = endereco_cliente;
    }

    public String getRenda_cliente() {
        return renda_cliente;
    }

    public void setRenda_cliente(String renda_cliente) {
        this.renda_cliente = renda_cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

}
