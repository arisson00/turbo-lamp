/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entities;

import conexao.EntidadeBase;
import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TipoDeServico implements Serializable,EntidadeBase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer Id;

	@Column(name = "tipoDeServico")
	private String tipoDeServico;

	@OneToOne
	@JoinColumn(name = "servico_id", referencedColumnName = "id")
	private Servico servico;

	public TipoDeServico() {

	}

	public TipoDeServico(Integer id, String tipoDeServico, Servico servico) {
		super();
		Id = id;
		this.tipoDeServico = tipoDeServico;
		this.servico = servico;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

        @Override
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTipoDeServico() {
		return tipoDeServico;
	}

	public void setTipoDeServico(String tipoDeServico) {
		this.tipoDeServico = tipoDeServico;
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
		TipoDeServico other = (TipoDeServico) obj;
		return Objects.equals(Id, other.Id);
	}

	@Override
	public String toString() {
		return "TiposDeServico [Id=" + Id + ", tipoDeServico=" + tipoDeServico + "]";
	}

}
