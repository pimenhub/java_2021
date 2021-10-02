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
public class UsuarioVO {
    
    private int idU;
    private String nombreU;
    private String apellidoU;
    private String correoU;
    private String nickU;
    private String contraseniaU;
    private int tipoUsuarioU;

    public UsuarioVO() {
    }

    public UsuarioVO(int idU, String nombreU, String apellidoU, String correoU, String nickU, int tipoUsuarioU) {
        this.idU = idU;
        this.nombreU = nombreU;
        this.apellidoU = apellidoU;
        this.correoU = correoU;
        this.nickU = nickU;
        this.tipoUsuarioU = tipoUsuarioU;
    }

    public int getIdU() {
        return idU;
    }

    public void setIdU(int idU) {
        this.idU = idU;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getApellidoU() {
        return apellidoU;
    }

    public void setApellidoU(String apellidoU) {
        this.apellidoU = apellidoU;
    }

    public String getCorreoU() {
        return correoU;
    }

    public void setCorreoU(String correoU) {
        this.correoU = correoU;
    }

    public String getNickU() {
        return nickU;
    }

    public void setNickU(String nickU) {
        this.nickU = nickU;
    }
    
    public String getContraseniaU() {
        return contraseniaU;
    }

    public void setContraseniaU(String contraseniaU) {
        this.contraseniaU = contraseniaU;
    }

    public int getTipoUsuarioU() {
        return tipoUsuarioU;
    }

    public void setTipoUsuarioU(int tipoUsuarioU) {
        this.tipoUsuarioU = tipoUsuarioU;
    }      
    
    
}
