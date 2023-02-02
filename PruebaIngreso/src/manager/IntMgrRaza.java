package manager;

import dto.Raza;
import exception.DaoException;
import exception.MgrException;

import java.util.List;

public interface IntMgrRaza {
    public void Save(Raza r) throws MgrException, DaoException;
    public void Delete(Raza r) throws MgrException, DaoException;
    public List<Raza> SelectAll()throws MgrException;
}
