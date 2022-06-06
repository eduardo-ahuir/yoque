package Entidades2;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OperacioneId implements Serializable {
    private static final long serialVersionUID = 1251298507701357078L;
    @Column(name = "idOperaciones", nullable = false)
    private Integer idOperaciones;

    @Column(name = "`clientes vip_idclientes vip`", nullable = false)
    private Integer clientesVipIdclientesVip;

    public Integer getIdOperaciones() {
        return idOperaciones;
    }

    public void setIdOperaciones(Integer idOperaciones) {
        this.idOperaciones = idOperaciones;
    }

    public Integer getClientesVipIdclientesVip() {
        return clientesVipIdclientesVip;
    }

    public void setClientesVipIdclientesVip(Integer clientesVipIdclientesVip) {
        this.clientesVipIdclientesVip = clientesVipIdclientesVip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperacioneId entity = (OperacioneId) o;
        return Objects.equals(this.clientesVipIdclientesVip, entity.clientesVipIdclientesVip) &&
                Objects.equals(this.idOperaciones, entity.idOperaciones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientesVipIdclientesVip, idOperaciones);
    }

}