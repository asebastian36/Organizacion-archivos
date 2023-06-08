/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uaemex.entities;

/**
 *
 * @author Angel Franco
 */

public class AccidenteBicicleta {
    private Integer id;
    private String fecha;
    private String diaSemana;
    private String distrito;
    private String lugarAccidente;

    public AccidenteBicicleta() {
    }

    public AccidenteBicicleta(String fecha, String diaSemana, String distrito, String lugarAccidente) {
        this.fecha = fecha;
        this.diaSemana = diaSemana;
        this.distrito = distrito;
        this.lugarAccidente = lugarAccidente;
    }

    public AccidenteBicicleta(Integer id, String fecha, String diaSemana, String distrito, String lugarAccidente) {
        this.id = id;
        this.fecha = fecha;
        this.diaSemana = diaSemana;
        this.distrito = distrito;
        this.lugarAccidente = lugarAccidente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getLugarAccidente() {
        return lugarAccidente;
    }

    public void setLugarAccidente(String lugarAccidente) {
        this.lugarAccidente = lugarAccidente;
    }

    @Override
    public String toString() {
        return "AccidenteBicicleta{" + "id=" + id + ", fecha=" + fecha + ", diaSemana=" + diaSemana + ", distrito=" + distrito + ", lugarAccidente=" + lugarAccidente + '}';
    }
}
