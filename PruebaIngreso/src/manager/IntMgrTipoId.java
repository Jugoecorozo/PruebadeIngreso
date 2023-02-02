package manager;

import dto.TipoId;
import exception.DaoException;
import exception.MgrException;

import java.util.List;

public interface IntMgrTipoId {
    public void Save(TipoId t) throws MgrException, DaoException;
    public void Delete(TipoId t) throws MgrException, DaoException;
    public List<TipoId> SelectAll()throws MgrException, DaoException;
}
