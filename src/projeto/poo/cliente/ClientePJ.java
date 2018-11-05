package projeto.poo.cliente;

import projeto.poo.Endereco;
import projeto.poo.Leitura;
import projeto.poo.Utilitaria;

public class ClientePJ extends Cliente {

	private String cnpj, motorista;

	public ClientePJ(String nome, String cnpj, String motorista, String fone, Endereco endereco) {
		super(nome, fone, endereco);
		this.cnpj = cnpj;
		this.motorista = motorista;
	}

	public static ClientePJ criar() {
		String nome, cnpj, motorista, fone;
		Endereco e;
		System.out.println("Digite o nome da empresa:");
		nome = Leitura.lerString();
		System.out.println("Digite o CNPJ: (Ex: 00.000.000/0000-00)");
		cnpj = Leitura.lerString();
		if (!Utilitaria.validarCnpj(cnpj)) {
			System.out.println("CNPJ inv�lido!\nDigite o cliente novamente:\n");
			return criar();
		}
		System.out.println("Digite o nome do motorista:");
		motorista = Leitura.lerString();
		System.out.println("Digite o telefone:");
		fone = Leitura.lerString();
		e = Endereco.criar();
		return new ClientePJ(nome, cnpj, motorista, fone, e);
	}

	@Override
	public String toString() {
		return "ClientePJ [\n\tcnpj=" + cnpj + ", \n\tmotorista=" + motorista + super.toString() + "]";
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getMotorista() {
		return motorista;
	}

	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}

}
