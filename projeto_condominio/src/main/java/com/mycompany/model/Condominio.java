/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ariss
 */
@Entity
@Table(name = "condominio")
@NamedQueries({
    @NamedQuery(name = "Condominio.findAll", query = "SELECT c FROM Condominio c")})
public class Condominio implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CondominioPK condominioPK;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "condominio")
    private Collection<Serviço> serviçoCollection;

    public Condominio() {
    }

    public Condominio(CondominioPK condominioPK) {
        this.condominioPK = condominioPK;
    }

    public Condominio(int id, String nome) {
        this.condominioPK = new CondominioPK(id, nome);
    }

    public CondominioPK getCondominioPK() {
        return condominioPK;
    }

    public void setCondominioPK(CondominioPK condominioPK) {
        this.condominioPK = condominioPK;
    }

    public Collection<Serviço> getServiçoCollection() {
        return serviçoCollection;
    }

    public void setServiçoCollection(Collection<Serviço> serviçoCollection) {
        this.serviçoCollection = serviçoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (condominioPK != null ? condominioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condominio)) {
            return false;
        }
        Condominio other = (Condominio) object;
        if ((this.condominioPK == null && other.condominioPK != null) || (this.condominioPK != null && !this.condominioPK.equals(other.condominioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.model.Condominio[ condominioPK=" + condominioPK + " ]";
    }
    
}
