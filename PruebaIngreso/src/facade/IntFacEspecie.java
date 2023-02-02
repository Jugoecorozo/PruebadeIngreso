package facade;

import dto.Especie;
import exception.FacadeException;

import java.util.List;

public interface IntFacEspecie {
    public void Process(Especie e)throws FacadeException;
    public void Delete(Especie e)throws FacadeException;
    public List<Especie> SelectAll()throws FacadeException;
}
