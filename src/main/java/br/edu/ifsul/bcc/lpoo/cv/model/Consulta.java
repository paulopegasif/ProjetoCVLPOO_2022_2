package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;
import java.util.List;

public class Consulta {

    private Integer id;
    private Calendar data;
    private String observacao;
    private Calendar data_retorno;
    private Float valor;

    private Medico medico;
    private Pet pet;
    private List<Receita> listReceita; //agregacao comp


    public Consulta(){


    }
}
