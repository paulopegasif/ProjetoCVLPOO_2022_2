package br.edu.ifsul.bcc.lpoo.cv.model.dao;

import br.edu.ifsul.bcc.lpoo.cv.model.Procedimento;

import java.util.List;

public class PersistenciaJPA implements InterfacePersistencia {

    public PersistenciaJPA(){


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
        //entity
        return find(c, id); //encontra um determinado registro
    }

    @Override
    public void persist(Object o) throws Exception {

    }

    @Override
    public void remover(Object o) throws Exception {

    }

    @Override
    public List<Procedimento> listProcedimento() throws Exception {
        return null;
    }
}
