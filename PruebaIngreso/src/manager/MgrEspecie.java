package manager;

import dao.IntEspecie;
import dto.Especie;
import exception.DaoException;
import exception.MgrException;

import java.util.List;

public class MgrEspecie implements IntMgrEspecie {
    private IntEspecie dao;

    @Override
    public void Save(Especie e) throws MgrException, DaoException {
        Especie tp = dao.SelectById(e);
        try {
            if (tp == null){
                dao.Insert(e);
            }else{
                dao.Update(e);
            }
        }catch (Exception ex){
            throw new MgrException(ex);
        }
    }

    @Override
    public void Delete(Especie e) throws MgrException, DaoException {
        Especie tp = dao.SelectById(e);
        try {
            if (tp != null){
                dao.Delete(e);
            }
        }catch (Exception ex){
            throw new MgrException(ex);
        }
    }

    @Override
    public List<Especie> SelectAll() throws MgrException {
        try {
            return dao.SelectAll();
        }catch (Exception e){
            throw new MgrException(e);
        }
    }
}
