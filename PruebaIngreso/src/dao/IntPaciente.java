package dao;

import dto.Paciente;
import exception.DaoException;

import java.util.List;

public interface IntPaciente {
    public void Insert(Paciente p) throws DaoException;
    public void Update(Paciente p) throws DaoException;
    public void Delete(Paciente p) throws DaoException;
    public List<Paciente> SelectAll() throws DaoException;
    public Paciente SelectById(Paciente p) throws DaoException;
}
