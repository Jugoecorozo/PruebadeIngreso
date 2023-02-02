package manager;

import dto.Especie;
import exception.DaoException;
import exception.MgrException;

import java.util.List;

public interface IntMgrEspecie {
    public void Save(Especie e) throws MgrException, DaoException;
    public void Delete(Especie e) throws MgrException, DaoException;
    public List<Especie> SelectAll()throws MgrException;
}
