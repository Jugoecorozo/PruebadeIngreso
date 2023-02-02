package manager;

import dao.IntPropietario;
import dto.Propietario;
import exception.DaoException;
import exception.MgrException;

import java.util.List;

public class MgrPropietario implements IntMgrPropietario {
    private IntPropietario dao;
    @Override
    public void Save(Propietario p) throws MgrException, DaoException {
        Propietario tp = dao.SelectById(p);
        try {
            if (tp == null){
                dao.Insert(p);
            }else{
                dao.Update(p);
            }
        }catch (Exception ex){
            throw new MgrException(ex);
        }
    }

    @Override
    public void Delete(Propietario p) throws MgrException, DaoException {
        Propietario tp = dao.SelectById(p);
        try {
            if (tp != null){
                dao.Delete(p);
            }
        }catch (Exception ex){
            throw new MgrException(ex);
        }
    }

    @Override
    public List<Propietario> SelectAll() throws MgrException {
        try {
            return dao.SelectAll();
        }catch (Exception e){
            throw new MgrException(e);
        }
    }
}
