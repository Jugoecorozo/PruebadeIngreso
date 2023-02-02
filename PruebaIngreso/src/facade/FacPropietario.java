package facade;

import database.ManagerConexion;
import dto.Propietario;
import exception.FacadeException;
import manager.IntMgrPropietario;

import java.util.List;

public class FacPropietario implements IntFacPropietario{
    private IntMgrPropietario PM;
    @Override
    public void Process(Propietario p) throws FacadeException {
        ManagerConexion.getInstance().Open();
        try {
            PM.Save(p);
            ManagerConexion.getInstance().Commit();
        } catch (Exception ex) {
            ManagerConexion.getInstance().RollBack();
            throw new FacadeException(ex);
        }finally {
            ManagerConexion.getInstance().Close();
        }
    }

    @Override
    public void Delete(Propietario p) throws FacadeException {
        try {
            ManagerConexion.getInstance().Open();
            PM.Delete(p);
            ManagerConexion.getInstance().Commit();
        } catch (Exception ex) {
            throw new FacadeException(ex);
        }finally {
            ManagerConexion.getInstance().Close();
        }
    }

    @Override
    public List<Propietario> SelectAll() throws FacadeException {
        ManagerConexion.getInstance().Open();
        try {
            return PM.SelectAll();
        } catch (Exception e) {
            throw new FacadeException(e);
        }finally {
            ManagerConexion.getInstance().Close();
        }
    }
}
