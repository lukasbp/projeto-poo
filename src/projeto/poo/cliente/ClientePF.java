package projeto.poo.cliente;

import projeto.poo.Endereco;
import projeto.poo.Leitura;
import projeto.poo.Utilitaria;

public class ClientePF extends Cliente {

	private String cpf;

	public ClientePF(String nome, String cpf, String fone, Endereco endereco) {
		super(nome, fone, endereco);
		this.cpf = cpf;
	}
	
	public static ClientePF criar() {
		String nome, cpf, fone;
		Endereco e;
		System.out.println("Digite o nome:");
		nome = Leitura.lerString();
		System.out.println("Digite o CPF: (Ex: 000.000.000-00)");
		cpf = Leitura.lerString();
		if (!Utilitaria.validarCpf(cpf)) {
			System.out.println("CPF inv�lido!\nDigite o cliente novamente:\n");
			return criar();
		}
		System.out.println("Digite o telefone:");
		fone = Leitura.lerString();
		e = Endereco.criar();
		return new ClientePF(nome, cpf, fone, e);
	}

	@Override
	public String toString() {
		return "ClientePF [\n\tcpf=" + cpf + super.toString() + "]";
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
