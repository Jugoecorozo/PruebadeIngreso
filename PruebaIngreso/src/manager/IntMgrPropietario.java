package manager;

import dto.Propietario;
import exception.DaoException;
import exception.MgrException;

import java.util.List;

public interface IntMgrPropietario {
    public void Save(Propietario p) throws MgrException, DaoException;
    public void Delete(Propietario p) throws MgrException, DaoException;
    public List<Propietario> SelectAll()throws MgrException;
}
