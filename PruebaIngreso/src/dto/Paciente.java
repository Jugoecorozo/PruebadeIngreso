package dto;

import java.util.Date;

public class Paciente {

    private String idPaciente;
    private String nomPaciente;
    private int especie;
    private int raza;
    private Date fechaNac; //dar formato a la fecha YYYY-MM-DD
    private int idProMascota;
    private Date FechaIng;

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNomPaciente() {
        return nomPaciente;
    }

    public void setNomPaciente(String nomPaciente) {
        this.nomPaciente = nomPaciente;
    }

    public int getEspecie() {
        return especie;
    }

    public void setEspecie(int especie) {
        this.especie = especie;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getIdProMascota() {
        return idProMascota;
    }

    public void setIdProMascota(int idProMascota) {
        this.idProMascota = idProMascota;
    }

    public Date getFechaIng() {
        return FechaIng;
    }

    public void setFechaIng(Date fechaIng) {
        FechaIng = fechaIng;
    }

}
