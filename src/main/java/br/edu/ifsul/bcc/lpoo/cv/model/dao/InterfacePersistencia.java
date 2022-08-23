package br.edu.ifsul.bcc.lpoo.cv.model.dao;

import br.edu.ifsul.bcc.lpoo.cv.model.Cliente;
import br.edu.ifsul.bcc.lpoo.cv.model.Medico;
import br.edu.ifsul.bcc.lpoo.cv.model.Pessoa;
import br.edu.ifsul.bcc.lpoo.cv.model.Produto;

import java.util.List;

public interface InterfacePersistencia {


    public Boolean conexaoAberta();
    public void fecharConexao();
    public Object find(Class c, Object id) throws Exception;
    public void persist(Object o) throws Exception;
    public void remover(Object o) throws Exception;

}
