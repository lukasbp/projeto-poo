package projeto.poo.automovel;

import projeto.poo.Leitura;

public class Automovel {
	private int automovelID, nroPortas;
	private String placa, cor;
	private char tipoCombustivel;
	private long quilometragem;
	private double custo;

	public Automovel(int automovelID, String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem,
			double custo) {
		this.automovelID = automovelID;
		this.placa = placa;
		this.cor = cor;
		this.nroPortas = nroPortas;
		this.tipoCombustivel = tipoCombustivel;
		this.quilometragem = quilometragem;
		this.custo = custo;
	}

	public static Automovel criar() {
		int automovelID = 0, nroPortas;
		String placa, cor;
		char tipoCombustivel;
		long quilometragem;
		double custo;
		// automovelID = Main.automovelID++;
		System.out.println("Digite a placa:");
		placa = Leitura.lerString();
		System.out.println("Digite a cor:");
		cor = Leitura.lerString();
		System.out.println("Digite o número de portas:");
		nroPortas = Leitura.lerInt();
		System.out.println("Digite o tipo de combustível: (G/A/D/E)");
		tipoCombustivel = Leitura.lerString().toUpperCase().charAt(0);
		if (!(tipoCombustivel == 'G' || tipoCombustivel == 'A' || tipoCombustivel == 'D' || tipoCombustivel == 'E')) {
			System.out.println("Combustível inválido!\nDigite os dados do veículo novamente:");
			return criar();
		}
		System.out.println("Digite a quilometragem:");
		quilometragem = (long) Leitura.lerInt();
		System.out.println("Digite o custo:");
		custo = (long) Leitura.lerDouble();
		return new Automovel(automovelID, placa, cor, nroPortas, tipoCombustivel, quilometragem, custo);
	}

	public double calcularCustos() {
		return this.custo; // Provisório
	}

	@Override
	public String toString() {
		return "\n\tautomovelID=" + automovelID + ", \n\tplaca=" + placa + ", \n\tcor=" + cor + ", \n\tnroPortas="
				+ nroPortas + ", \n\ttipoCombustivel=" + tipoCombustivel + ", \n\tquilometragem=" + quilometragem
				+ ", \n\tcusto=" + custo + "\n";
	}

	public int getAutomovelID() {
		return automovelID;
	}

	public void setAutomovelID(int automovelID) {
		this.automovelID = automovelID;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNroPortas() {
		return nroPortas;
	}

	public void setNroPortas(int nroPortas) {
		this.nroPortas = nroPortas;
	}

	public char getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(char tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public long getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(long quilometragem) {
		this.quilometragem = quilometragem;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

}