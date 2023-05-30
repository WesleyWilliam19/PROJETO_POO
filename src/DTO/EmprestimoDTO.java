package DTO;

import java.time.LocalDateTime;

public class EmprestimoDTO {

    private int id_emprestimo;
    private int id_cliente;
    private double valor_emprestimo;
    private LocalDateTime data_hora_emprestimo;
    private String protocolo;

    /*
    public EmprestimoDTO(int id_cliente, double valor_emprestimo, LocalDateTime data_hora_emprestimo, String protocolo) {
        this.id_emprestimo = id_emprestimo;
        this.id_cliente = id_cliente;
        this.valor_emprestimo = valor_emprestimo;
        this.data_hora_emprestimo = data_hora_emprestimo;
        this.protocolo = protocolo;
    }
     */
    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public double getValor_emprestimo() {
        return valor_emprestimo;
    }

    public void setValor_emprestimo(double valor_emprestimo) {
        this.valor_emprestimo = valor_emprestimo;
    }

    public LocalDateTime getData_hora_emprestimo() {
        return data_hora_emprestimo;
    }

    public void setData_hora_emprestimo(LocalDateTime data_hora_emprestimo) {
        this.data_hora_emprestimo = data_hora_emprestimo;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

}
