package facade;

import database.ManagerConexion;
import dto.Raza;
import exception.FacadeException;
import manager.IntMgrRaza;

import java.util.List;

public class FacRaza implements IntFacRaza{
    private IntMgrRaza RM;
    @Override
    public void Process(Raza r) throws FacadeException {
        ManagerConexion.getInstance().Open();
        try {
            RM.Save(r);
            ManagerConexion.getInstance().Commit();
        } catch (Exception ex) {
            ManagerConexion.getInstance().RollBack();
            throw new FacadeException(ex);
        }finally {
            ManagerConexion.getInstance().Close();
        }
    }

    @Override
    public void Delete(Raza r) throws FacadeException {
        try {
            ManagerConexion.getInstance().Open();
            RM.Delete(r);
            ManagerConexion.getInstance().Commit();
        } catch (Exception ex) {
            throw new FacadeException(ex);
        }finally {
            ManagerConexion.getInstance().Close();
        }
    }

    @Override
    public List<Raza> SelectAll() throws FacadeException {
        ManagerConexion.getInstance().Open();
        try {
            return RM.SelectAll();
        } catch (Exception e) {
            throw new FacadeException(e);
        }finally {
            ManagerConexion.getInstance().Close();
        }
    }
}
