package br.edu.ifsul.bcc.lpoo.cv.model.dao;

public class PersistenciaJDBC implements InterfacePersistencia {




    public PersistenciaJDBC(){


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
}
