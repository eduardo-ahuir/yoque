package Entidades2;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ClientesVipId implements Serializable {
    private static final long serialVersionUID = -1673916218414052039L;
    @Column(name = "`idclientes vip`", nullable = false)
    private Integer idclientesVip;

    @Column(name = "`clientes potenciales_idClientes potenciales`", nullable = false)
    private Integer clientesPotencialesIdclientesPotenciales;

    public Integer getIdclientesVip() {
        return idclientesVip;
    }

    public void setIdclientesVip(Integer idclientesVip) {
        this.idclientesVip = idclientesVip;
    }

    public Integer getClientesPotencialesIdclientesPotenciales() {
        return clientesPotencialesIdclientesPotenciales;
    }

    public void setClientesPotencialesIdclientesPotenciales(Integer clientesPotencialesIdclientesPotenciales) {
        this.clientesPotencialesIdclientesPotenciales = clientesPotencialesIdclientesPotenciales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientesVipId entity = (ClientesVipId) o;
        return Objects.equals(this.clientesPotencialesIdclientesPotenciales, entity.clientesPotencialesIdclientesPotenciales) &&
                Objects.equals(this.idclientesVip, entity.idclientesVip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientesPotencialesIdclientesPotenciales, idclientesVip);
    }

}