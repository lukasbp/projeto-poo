package projeto.poo;

public class Endereco {

	private String rua;
	private int numero;
	private String cep, cidade, estado;

	public Endereco(String rua, int numero, String cep, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	public static Endereco criar() {
		String rua, cep, cidade, estado;
		int numero;
		System.out.println("Digite a rua:");
		rua = Leitura.lerString();
		System.out.println("Digite o número:");
		numero = Leitura.lerInt();
		System.out.println("Digite o CEP: (Ex: 00000-000)");
		cep = Leitura.lerString();
		if (!Utilitaria.validarCep(cep)) {
			System.out.println("CEP inválido!\nDigite o endereço novamente: \n");
			return criar();
		}
		System.out.println("Digite a cidade:");
		cidade = Leitura.lerString();
		System.out.println("Digite o estado: (Ex: PR)");
		estado = Leitura.lerString();
		if (!Utilitaria.validarEstado(estado)) {
			System.out.println("Estado inválido!\nDigite o endereço novamente: \n");
			return criar();
		}
		return new Endereco(rua, numero, cep, cidade, estado);
	}

	@Override
	public String toString() {
		return "Endereco [\n\t\trua=" + rua + ", \n\t\tnumero=" + numero + ", \n\t\tcep=" + cep + ", \n\t\tcidade="
				+ cidade + ", \n\t\testado=" + estado + "\n\t]";
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
