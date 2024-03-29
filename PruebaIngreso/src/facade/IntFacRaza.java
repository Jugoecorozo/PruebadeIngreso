package facade;

import dto.Raza;
import exception.FacadeException;

import java.util.List;

public interface IntFacRaza {
    public void Process(Raza r)throws FacadeException;
    public void Delete(Raza r)throws FacadeException;
    public List<Raza> SelectAll()throws FacadeException;
}
