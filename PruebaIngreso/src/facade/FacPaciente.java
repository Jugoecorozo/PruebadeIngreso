package facade;

import database.ManagerConexion;
import dto.Paciente;
import exception.FacadeException;
import manager.IntMgrPaciente;

import java.util.List;

public class FacPaciente implements IntFacPaciente {
    private IntMgrPaciente PM;

    @Override
    public void Process(Paciente p) throws FacadeException {
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
    public void Delete(Paciente p) throws FacadeException {
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
    public List<Paciente> SelectAll() throws FacadeException {
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
