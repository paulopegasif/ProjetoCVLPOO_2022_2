package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.List;

public class Receita {

    private Integer id;
    private String orientacao;
    private Consulta consulta;
    private List<Produto> lisProduto;


    public Receita(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrientacao() {
        return orientacao;
    }

    public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public List<Produto> getLisProduto() {
        return lisProduto;
    }

    public void setLisProduto(List<Produto> lisProduto) {
        this.lisProduto = lisProduto;
    }
}
