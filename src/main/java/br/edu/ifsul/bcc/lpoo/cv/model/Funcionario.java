package br.edu.ifsul.bcc.lpoo.cv.model;

public class Funcionario extends Pessoa {

    private String numero_ctps;
    private String numero_pis;
    private Cargo cargo;



    public Funcionario(){

    }

    public String getNumero_ctps() {
        return numero_ctps;
    }

    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    public String getNumero_pis() {
        return numero_pis;
    }

    public void setNumero_pis(String numero_pis) {
        this.numero_pis = numero_pis;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
