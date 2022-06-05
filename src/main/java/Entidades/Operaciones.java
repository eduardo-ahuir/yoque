/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pc
 */
@Entity
@Table(name = "operaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operaciones.findAll", query = "SELECT o FROM Operaciones o"),
    @NamedQuery(name = "Operaciones.findByIdOperaciones", query = "SELECT o FROM Operaciones o WHERE o.operacionesPK.idOperaciones = :idOperaciones"),
    @NamedQuery(name = "Operaciones.findByCantidad", query = "SELECT o FROM Operaciones o WHERE o.cantidad = :cantidad"),
    @NamedQuery(name = "Operaciones.findByFecha", query = "SELECT o FROM Operaciones o WHERE o.fecha = :fecha"),
    @NamedQuery(name = "Operaciones.findByClientesIdclientes", query = "SELECT o FROM Operaciones o WHERE o.operacionesPK.clientesIdclientes = :clientesIdclientes")})
public class Operaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OperacionesPK operacionesPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Fecha")
    private String fecha;
    @JoinColumn(name = "clientes_idclientes", referencedColumnName = "idclientes", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Clientes clientes;

    public Operaciones() {
    }

    public Operaciones(OperacionesPK operacionesPK) {
        this.operacionesPK = operacionesPK;
    }

    public Operaciones(OperacionesPK operacionesPK, int cantidad, String fecha) {
        this.operacionesPK = operacionesPK;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Operaciones(int idOperaciones, int clientesIdclientes) {
        this.operacionesPK = new OperacionesPK(idOperaciones, clientesIdclientes);
    }

    public OperacionesPK getOperacionesPK() {
        return operacionesPK;
    }

    public void setOperacionesPK(OperacionesPK operacionesPK) {
        this.operacionesPK = operacionesPK;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (operacionesPK != null ? operacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operaciones)) {
            return false;
        }
        Operaciones other = (Operaciones) object;
        if ((this.operacionesPK == null && other.operacionesPK != null) || (this.operacionesPK != null && !this.operacionesPK.equals(other.operacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Operaciones[ operacionesPK=" + operacionesPK + " ]";
    }
    
}
