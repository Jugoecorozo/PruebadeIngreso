package dao;

import dto.Especie;
import exception.DaoException;

import java.util.List;

public interface IntEspecie {
    public void Insert(Especie e) throws DaoException;
    public void Update(Especie e) throws DaoException;
    public void Delete(Especie e) throws DaoException;
    public List<Especie> SelectAll() throws DaoException;
    public Especie SelectById(Especie e) throws DaoException;
}
