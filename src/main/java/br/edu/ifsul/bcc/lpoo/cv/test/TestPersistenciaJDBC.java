package br.edu.ifsul.bcc.lpoo.cv.test;

import br.edu.ifsul.bcc.lpoo.cv.model.Procedimento;
import br.edu.ifsul.bcc.lpoo.cv.model.dao.PersistenciaJDBC;

import java.util.List;

public class TestPersistenciaJDBC {


    //@Test
    public void testConexao() throws Exception  {

        PersistenciaJDBC persistencia = new PersistenciaJDBC();
        if(persistencia.conexaoAberta()){
            System.out.println("abriu a conexao com o BD via jdbc");

            persistencia.fecharConexao();

        }else{
            System.out.println("Nao abriu a conexao com o BD via jdbc");
        }
    }



    //@Test
    public void listProcedimentos() throws Exception{
        PersistenciaJDBC persistenciaJDBC = new PersistenciaJDBC();

        if(persistenciaJDBC.conexaoAberta()){
            //1 - Listar todos os registros da tabela tb_procedimento - OK
            //2 - Imprima na saída padrão o id, observação e valor - OK
            //3 - Remover fisicamente o registro - OK
            //4 - Caso a lista esteja vazia, gerar um registro - OK

            List<Procedimento> listaprocedimento = persistenciaJDBC.listProcedimento();

            if(!listaprocedimento.isEmpty()){
                //se a lista nao estiver vazia
                System.out.println("LISTA DE PROCEDIMENTOS ----------");

                for(Procedimento p:listaprocedimento){
                    //Imprimindo na saida
                    System.out.println("ID: " + p.getId());
                    System.out.println("Observacao: " + p.getObservacao());
                    System.out.println("Valor: R$" + p.getValor());

                    persistenciaJDBC.remover(p); //removendo da lista
                }

            }else{
                //Se a lista estiver vazia

                System.out.println("LISTA DE PROCEDIMENTOS VAZIA !!!");

                Procedimento procedimento = new Procedimento();

                procedimento.setObservacao("Observacao");
                //procedimento.setStatus();
                procedimento.setValor(1500.50F);


                persistenciaJDBC.persist(procedimento); //Inserindo na tabela
                System.out.println("O procedimento de ID: " + procedimento.getId() + "foi cadastrado com sucesso!");

            }
        }else{
            System.out.println("Erro ao abrir conexao com o BD via JDBC!");
        }
    }

}
