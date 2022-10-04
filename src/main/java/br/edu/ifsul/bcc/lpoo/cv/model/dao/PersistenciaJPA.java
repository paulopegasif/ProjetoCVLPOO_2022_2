package br.edu.ifsul.bcc.lpoo.cv.model.dao;

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
        return entity.find(c, id); //encontra um determinado registro
    }

    @Override
    public void persist(Object o) throws Exception {

    }

    @Override
    public void remover(Object o) throws Exception {

    }
}
