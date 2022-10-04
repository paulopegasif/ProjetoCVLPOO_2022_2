package br.edu.ifsul.bcc.lpoo.cv.model.dao;

import br.edu.ifsul.bcc.lpoo.cv.model.Procedimento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaJDBC implements InterfacePersistencia {

    private final String DRIVER = "org.postgresql.Driver";
    private final String USER = "postgres";
    private final String SENHA = "postgres";
    public static final String URL = "jdbc:postgresql://localhost:5433/dbcvLPOO_2022_2";
    private Connection con = null;


    public PersistenciaJDBC() throws Exception{



    }

    @Override
    public Boolean conexaoAberta() {
        return null;
    }

    @Override
    public void fecharConexao() {

    }

    @Override
    public Object find(Class c, Object id) throws Exception {
        return null;

    }

    @Override
    public void persist(Object o) throws Exception {


    }

    @Override
    public void remover(Object o) throws Exception {

    }

    @Override
    public List<Procedimento> listProcedimento() throws Exception {

        List<Procedimento> listaprocedimento = null;

        PreparedStatement ps = this.con.prepareStatement("select id, observacao, status, valor from tb_procedimento order by id asc");
        ResultSet rs = ps.executeQuery(); //executando a query sql

        listaprocedimento = new ArrayList(); //criando uma nova lista

        while(rs.next()){
            Procedimento p = new Procedimento();
            p.setId(rs.getInt("id"));
            p.setObservacao(rs.getString("observacao"));
            //p.setStatus(rs.getString("status").toString());
            p.setValor(rs.getFloat("valor"));

            listaprocedimento.add(p); //adicionando na lista

        }
        rs.close();

        return listaprocedimento;

    }
}
