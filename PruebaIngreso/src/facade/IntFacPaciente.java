package facade;

import dto.Paciente;
import exception.FacadeException;

import java.util.List;

public interface IntFacPaciente {
    public void Process(Paciente p)throws FacadeException;
    public void Delete(Paciente p)throws FacadeException;
    public List<Paciente> SelectAll()throws FacadeException;
}
