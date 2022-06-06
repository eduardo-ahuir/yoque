package Entidades2;

import javax.persistence.*;

@Entity
@Table(name = "relacion cliente gestor")
public class RelacionClienteGestor {
    @EmbeddedId
    private RelacionClienteGestorId id;

    @MapsId("clientesVipIdclientesVip")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "`clientes vip_idclientes vip`", nullable = false, referencedColumnName = "idclientes vip")
    private ClientesVip clientesVipIdclientesVip;

    @MapsId("gestoresIdgestores")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Gestores_idGestores", nullable = false)
    private Gestor gestoresIdgestores;

    public RelacionClienteGestorId getId() {
        return id;
    }

    public void setId(RelacionClienteGestorId id) {
        this.id = id;
    }

    public ClientesVip getClientesVipIdclientesVip() {
        return clientesVipIdclientesVip;
    }

    public void setClientesVipIdclientesVip(ClientesVip clientesVipIdclientesVip) {
        this.clientesVipIdclientesVip = clientesVipIdclientesVip;
    }

    public Gestor getGestoresIdgestores() {
        return gestoresIdgestores;
    }

    public void setGestoresIdgestores(Gestor gestoresIdgestores) {
        this.gestoresIdgestores = gestoresIdgestores;
    }

}