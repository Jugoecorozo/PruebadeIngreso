package dao;

import dto.Raza;
import exception.DaoException;

import java.util.List;

public interface IntRaza {
    public void Insert(Raza r) throws DaoException;
    public void Update(Raza r) throws DaoException;
    public void Delete(Raza r) throws DaoException;
    public List<Raza> SelectAll() throws DaoException;
    public Raza SelectById(Raza r) throws DaoException;
}
