package Entidades2;

import javax.persistence.*;

@Entity
@Table(name = "operaciones")
public class Operacione {
    @EmbeddedId
    private OperacioneId id;

    @MapsId("clientesVipIdclientesVip")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "`clientes vip_idclientes vip`", nullable = false, referencedColumnName = "idclientes vip")
    private ClientesVip clientesVipIdclientesVip;

    @Column(name = "Fecha", nullable = false, length = 45)
    private String fecha;

    @Column(name = "`Cantidad puntos gastados`", nullable = false, length = 45)
    private String cantidadPuntosGastados;

    public OperacioneId getId() {
        return id;
    }

    public void setId(OperacioneId id) {
        this.id = id;
    }

    public ClientesVip getClientesVipIdclientesVip() {
        return clientesVipIdclientesVip;
    }

    public void setClientesVipIdclientesVip(ClientesVip clientesVipIdclientesVip) {
        this.clientesVipIdclientesVip = clientesVipIdclientesVip;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCantidadPuntosGastados() {
        return cantidadPuntosGastados;
    }

    public void setCantidadPuntosGastados(String cantidadPuntosGastados) {
        this.cantidadPuntosGastados = cantidadPuntosGastados;
    }

}