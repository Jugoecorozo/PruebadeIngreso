package manager;

import dao.IntRaza;
import dto.Raza;
import exception.DaoException;
import exception.MgrException;

import java.util.List;

public class MgrRaza implements IntMgrRaza{
    private IntRaza dao;
    @Override
    public void Save(Raza r) throws MgrException, DaoException {
        Raza tp = dao.SelectById(r);
        try {
            if (tp == null){
                dao.Insert(r);
            }else{
                dao.Update(r);
            }
        }catch (Exception ex){
            throw new MgrException(ex);
        }
    }

    @Override
    public void Delete(Raza r) throws MgrException, DaoException {
        Raza tp = dao.SelectById(r);
        try {
            if (tp != null){
                dao.Delete(r);
            }
        }catch (Exception ex){
            throw new MgrException(ex);
        }
    }

    @Override
    public List<Raza> SelectAll() throws MgrException {
        try {
            return dao.SelectAll();
        }catch (Exception e){
            throw new MgrException(e);
        }
    }
}
