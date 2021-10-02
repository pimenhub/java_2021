/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Jonathan Pimentel
 */
public class TuitVO {
    
    private int idT;
    private String tituloT;
    private String descripcionT;
    private String fechaT;

    public TuitVO() {
    }

    public TuitVO(int idT, String tituloT, String descripcionT, String fechaT) {
        this.idT = idT;
        this.tituloT = tituloT;
        this.descripcionT = descripcionT;
        this.fechaT = fechaT;
    }

    public int getIdT() {
        return idT;
    }

    public void setIdT(int idT) {
        this.idT = idT;
    }

    public String getTituloT() {
        return tituloT;
    }

    public void setTituloT(String tituloT) {
        this.tituloT = tituloT;
    }

    public String getDescripcionT() {
        return descripcionT;
    }

    public void setDescripcionT(String descripcionT) {
        this.descripcionT = descripcionT;
    }

    public String getFechaT() {
        return fechaT;
    }

    public void setFechaT(String fechaT) {
        this.fechaT = fechaT;
    }

    
    
    
    
    
}
