/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author pc
 */
@Embeddable
public class OperacionesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idOperaciones")
    private int idOperaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "clientes_idclientes")
    private int clientesIdclientes;

    public OperacionesPK() {
    }

    public OperacionesPK(int idOperaciones, int clientesIdclientes) {
        this.idOperaciones = idOperaciones;
        this.clientesIdclientes = clientesIdclientes;
    }

    public int getIdOperaciones() {
        return idOperaciones;
    }

    public void setIdOperaciones(int idOperaciones) {
        this.idOperaciones = idOperaciones;
    }

    public int getClientesIdclientes() {
        return clientesIdclientes;
    }

    public void setClientesIdclientes(int clientesIdclientes) {
        this.clientesIdclientes = clientesIdclientes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idOperaciones;
        hash += (int) clientesIdclientes;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OperacionesPK)) {
            return false;
        }
        OperacionesPK other = (OperacionesPK) object;
        if (this.idOperaciones != other.idOperaciones) {
            return false;
        }
        if (this.clientesIdclientes != other.clientesIdclientes) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.OperacionesPK[ idOperaciones=" + idOperaciones + ", clientesIdclientes=" + clientesIdclientes + " ]";
    }
    
}
