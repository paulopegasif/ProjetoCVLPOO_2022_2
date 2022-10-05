package br.edu.ifsul.bcc.lpoo.cv.model.dao;

import br.edu.ifsul.bcc.lpoo.cv.model.Procedimento;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersistenciaJDBC implements InterfacePersistencia {

    private final String DRIVER = "org.postgresql.Driver";
    private final String USER = "postgres";
    private final String SENHA = "postgres";
    public static final String URL = "jdbc:postgresql://localhost:5433/dbcvLPOO_2022_2";
    private Connection con = null; //classe connection para criar a conexão


    public PersistenciaJDBC() throws Exception{

        Class.forName(DRIVER); //carregando o driver sem precisar de um try catch (throws Exception)
        this.con = DriverManager.getConnection(URL,USER,SENHA); //instancia para o obj Connection

        System.out.println("Estabelecendo Conexao com o BD via JDBC!");

    }

    @Override
    public Boolean conexaoAberta() {

        try{
            if(con != null){
                return !con.isClosed(); // verificando se a conexao esta aberta
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Ocorreu um erro ao acessar o banco de dados: " + throwables.getMessage());
        }

        return false; //retorna false se cair no catch
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
