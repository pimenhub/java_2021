/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jonathan Pimentel
 */
public class TipoUsuarioVO {
    
    private int idTU;
    private String nombreTU;
    private String descripcionTU;

    public TipoUsuarioVO() {
    }

    public TipoUsuarioVO(int idTU, String nombreTU, String descripcionTU) {
        this.idTU = idTU;
        this.nombreTU = nombreTU;
        this.descripcionTU = descripcionTU;
    }

    public int getIdTU() {
        return idTU;
    }

    public void setIdTU(int idTU) {
        this.idTU = idTU;
    }

    public String getNombreTU() {
        return nombreTU;
    }

    public void setNombreTU(String nombreTU) {
        this.nombreTU = nombreTU;
    }

    public String getDescripcionTU() {
        return descripcionTU;
    }

    public void setDescripcionTU(String descripcionTU) {
        this.descripcionTU = descripcionTU;
    }
    
    
}
