package projeto.poo.cliente;

import projeto.poo.Endereco;

public class Cliente {

	private String nome, fone;
	private Endereco endereco;

	public Cliente(String nome, String fone, Endereco endereco) {
		this.nome = nome;
		this.fone = fone;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\n\tnome=" + nome + ", \n\tfone=" + fone + ", \n\tendereco=" + endereco+"\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
