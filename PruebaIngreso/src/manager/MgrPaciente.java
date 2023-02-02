package manager;

import dao.IntPaciente;
import dto.Paciente;
import exception.DaoException;
import exception.MgrException;

import java.util.List;

public class MgrPaciente implements IntMgrPaciente{
    private IntPaciente dao;
    @Override
    public void Save(Paciente p) throws MgrException, DaoException {
        Paciente tp = dao.SelectById(p);
        try {
            if (tp == null){
                dao.Insert(p);
            }else{
                dao.Update(p);
            }
        }catch (Exception ex){
            throw new MgrException(ex);
        }
    }

    @Override
    public void Delete(Paciente p) throws MgrException, DaoException {
        Paciente tp = dao.SelectById(p);
        try {
            if (tp != null){
                dao.Delete(p);
            }
        }catch (Exception ex){
            throw new MgrException(ex);
        }
    }

    @Override
    public List<Paciente> SelectAll() throws MgrException {
        try {
            return dao.SelectAll();
        }catch (Exception e){
            throw new MgrException(e);
        }
    }
}
