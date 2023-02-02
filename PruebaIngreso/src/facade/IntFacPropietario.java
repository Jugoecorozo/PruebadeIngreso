package facade;

import dto.Propietario;
import exception.FacadeException;

import java.util.List;

public interface IntFacPropietario {
    public void Process(Propietario p)throws FacadeException;
    public void Delete(Propietario p)throws FacadeException;
    public List<Propietario> SelectAll()throws FacadeException;
}
