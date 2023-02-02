package manager;

import dao.IntTipoId;
import dto.TipoId;
import exception.DaoException;
import exception.MgrException;

import java.util.List;

public class MgrTipoId implements IntMgrTipoId {
    private IntTipoId dao;
    @Override
    public void Save(TipoId t) throws MgrException, DaoException {
        TipoId tp = dao.SelectById(t);
        try {
            if (tp == null){
                dao.Insert(t);
            }else{
                dao.Update(t);
            }
        }catch (Exception ex){
            throw new MgrException(ex);
        }
    }

    @Override
    public void Delete(TipoId t) throws MgrException, DaoException {
        TipoId tp = dao.SelectById(t);
        try {
            if (tp != null){
                dao.Delete(t);
            }
        }catch (Exception ex){
            throw new MgrException(ex);
        }
    }

    @Override
    public List<TipoId> SelectAll() throws MgrException, DaoException {
        try {
            return dao.SelectAll();
        } catch (Exception e) {
            throw new MgrException(e);
        }
    }
}
