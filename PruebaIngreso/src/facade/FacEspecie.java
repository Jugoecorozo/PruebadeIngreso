package facade;

import database.ManagerConexion;
import dto.Especie;
import exception.FacadeException;
import manager.IntMgrEspecie;

import java.util.List;

public class FacEspecie implements IntFacEspecie {
    private IntMgrEspecie EM;
    @Override
    public void Process(Especie e) throws FacadeException {
        ManagerConexion.getInstance().Open();
        try {
            EM.Save(e);
            ManagerConexion.getInstance().Commit();
        } catch (Exception ex) {
            ManagerConexion.getInstance().RollBack();
            throw new FacadeException(ex);
        }finally {
            ManagerConexion.getInstance().Close();
        }
    }

    @Override
    public void Delete(Especie e) throws FacadeException {
        try {
            ManagerConexion.getInstance().Open();
            EM.Delete(e);
            ManagerConexion.getInstance().Commit();
        } catch (Exception ex) {
            throw new FacadeException(ex);
        }finally {
            ManagerConexion.getInstance().Close();
        }
    }

    @Override
    public List<Especie> SelectAll() throws FacadeException {
        ManagerConexion.getInstance().Open();
        try {
            return EM.SelectAll();
        } catch (Exception e) {
            throw new FacadeException(e);
        }finally {
            ManagerConexion.getInstance().Close();
        }
    }
}
