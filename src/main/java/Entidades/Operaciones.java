package Entidades;

import javax.persistence.*;

@Entity
@Table(name = "operaciones")
public class Operaciones {
    @EmbeddedId
    private OperacioneId id;

    @MapsId("clientesIdclientes")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "clientes_idclientes", nullable = false)
    private Clientes clientesIdclientes;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    @Column(name = "Fecha", nullable = false, length = 45)
    private String fecha;

    public OperacioneId getId() {
        return id;
    }

    public void setId(OperacioneId id) {
        this.id = id;
    }

    public Clientes getClientesIdclientes() {
        return clientesIdclientes;
    }

    public void setClientesIdclientes(Clientes clientesIdclientes) {
        this.clientesIdclientes = clientesIdclientes;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}