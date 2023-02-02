package facade;

import database.ManagerConexion;
import dto.TipoId;
import exception.FacadeException;
import manager.IntMgrTipoId;

import java.util.List;

public class FacTipoId implements  IntFacTipoId{
    private IntMgrTipoId TM;
    @Override
    public void Process(TipoId t) throws FacadeException {
        ManagerConexion.getInstance().Open();
        try {
            TM.Save(t);
            ManagerConexion.getInstance().Commit();
        } catch (Exception ex) {
            ManagerConexion.getInstance().RollBack();
            throw new FacadeException(ex);
        }finally {
            ManagerConexion.getInstance().Close();
        }
    }

    @Override
    public void Delete(TipoId p) throws FacadeException {
        try {
            ManagerConexion.getInstance().Open();
            TM.Delete(p);
            ManagerConexion.getInstance().Commit();
        } catch (Exception ex) {
            throw new FacadeException(ex);
        }finally {
            ManagerConexion.getInstance().Close();
        }
    }

    @Override
    public List<TipoId> SelectAll() throws FacadeException {
        ManagerConexion.getInstance().Open();
        try {
            return TM.SelectAll();
        } catch (Exception e) {
            throw new FacadeException(e);
        }finally {
            ManagerConexion.getInstance().Close();
        }
    }
}
