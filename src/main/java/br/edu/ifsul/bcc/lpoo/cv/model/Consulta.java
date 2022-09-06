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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Calendar getData_retorno() {
        return data_retorno;
    }

    public void setData_retorno(Calendar data_retorno) {
        this.data_retorno = data_retorno;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public List<Receita> getListReceita() {
        return listReceita;
    }

    public void setListReceita(List<Receita> listReceita) {
        this.listReceita = listReceita;
    }
}
