/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ariss
 */
@Entity
@Table(name = "servi\u00e7o")
@NamedQueries({
    @NamedQuery(name = "Servi\u00e7o.findAll", query = "SELECT s FROM Servi\u00e7o s")})
public class Serviço implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ServiçoPK serviçoPK;
    @JoinColumns({
        @JoinColumn(name = "condominio_id", referencedColumnName = "id"),
        @JoinColumn(name = "condominio_nome", referencedColumnName = "nome")})
    @ManyToOne(optional = false)
    private Condominio condominio;

    public Serviço() {
    }

    public Serviço(ServiçoPK serviçoPK) {
        this.serviçoPK = serviçoPK;
    }

    public Serviço(int id, String tipo) {
        this.serviçoPK = new ServiçoPK(id, tipo);
    }

    public ServiçoPK getServiçoPK() {
        return serviçoPK;
    }

    public void setServiçoPK(ServiçoPK serviçoPK) {
        this.serviçoPK = serviçoPK;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviçoPK != null ? serviçoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Serviço)) {
            return false;
        }
        Serviço other = (Serviço) object;
        if ((this.serviçoPK == null && other.serviçoPK != null) || (this.serviçoPK != null && !this.serviçoPK.equals(other.serviçoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.model.Servi\u00e7o[ servi\u00e7oPK=" + serviçoPK + " ]";
    }
    
}
