package manager;

import dto.Paciente;
import exception.DaoException;
import exception.MgrException;

import java.util.List;

public interface IntMgrPaciente {
    public void Save(Paciente p) throws MgrException, DaoException;
    public void Delete(Paciente p) throws MgrException, DaoException;
    public List<Paciente> SelectAll()throws MgrException;
}
