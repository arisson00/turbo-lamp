/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import conexao.EntidadeBase;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Servico implements Serializable,EntidadeBase{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer Id;
	
	@Column(name = "data")
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date data;
	
	@Column(name = "preco")
	private Double preco;
	
	@OneToOne(mappedBy="servico")
	private Status status;	
	
	@OneToOne(mappedBy="servico")
	private Empresa empresa;
	
	@OneToOne(mappedBy="servico")
	private TipoDeServico tipo;
	
	
	
	public Servico() {
		
	}


	public Servico(Integer id, Date data, Double preco, Status status, Empresa empresa, TipoDeServico tipo) {
		super();
		Id = id;
		this.data = data;
		this.preco = preco;
		this.status = status;
		this.empresa = empresa;
		this.tipo = tipo;
	}




        @Override
	public Integer getId() {
		return Id;
	}

	public TipoDeServico getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeServico tipo) {
		this.tipo = tipo;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "Servico [Id=" + Id + ", empresa=" + empresa + ", data=" + data + ", preco=" + preco + ", status="
				+ status + ", tipo=" + tipo + "]";
	}

    public void setNome(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


	
}

