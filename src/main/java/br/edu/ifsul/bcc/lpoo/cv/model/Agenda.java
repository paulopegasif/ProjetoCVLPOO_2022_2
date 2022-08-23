package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;

public class Agenda {

    private Integer id;
    private Calendar data_inicio;
    private Calendar data_fim;
    private String observacao;
    private Medico medico;
    private Status status;
    private TipoProduto tipoProduto;
    private Funcionario funcionario;



    public Agenda(){

    }
}
