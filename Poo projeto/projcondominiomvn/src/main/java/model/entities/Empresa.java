package model.entities;

import conexao.EntidadeBase;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Empresa implements Serializable,EntidadeBase {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer Id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cnpj")
	private String cnpj;

	@OneToOne
	@JoinColumn(name = "servico_id", referencedColumnName = "id")
	private Servico servico;


	@OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Telefone> telefones;

	public Empresa() {

	}

	public Empresa(Integer id, String nome, String cnpj, Servico servico, List<Telefone> telefones) {
		super();
		Id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.servico = servico;
		this.telefones = telefones;
	}

	
	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public void addTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

	
	public List<Telefone> getTelefone() {
		return telefones;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefones = telefone;
	}

        @Override
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
		Empresa other = (Empresa) obj;
		return Objects.equals(Id, other.Id);
	}

}
