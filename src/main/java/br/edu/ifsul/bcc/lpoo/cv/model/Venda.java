
package br.edu.ifsul.bcc.lpoo.cv.model;


import java.util.Calendar;
import java.util.List;

public class Venda {
    

    private Integer id;
    private String observacao;
    private Float valor_total;
    private Calendar data;
    private Pagamento formaPagamento;
    private Cliente cliente;
    private Funcionario funcionario;
    private List<Consulta> consultas;
    private List<Produto> produtos;


    // construtor
    public Venda(){
        
    }

}
