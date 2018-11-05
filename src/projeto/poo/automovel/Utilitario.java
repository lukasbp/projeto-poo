package projeto.poo.automovel;

import projeto.poo.Leitura;

public class Utilitario extends Automovel {

	private int capacidadeCarga, nroEixos;
	private boolean escolta;

	public Utilitario(int automovelID, String placa, String cor, int nroPortas, char tipoCombustivel,
			long quilometragem, double custo, int capacidadeCarga, int nroEixos, boolean escolta) {
		super(automovelID, placa, cor, nroPortas, tipoCombustivel, quilometragem, custo);
		this.capacidadeCarga = capacidadeCarga;
		this.nroEixos = nroEixos;
		this.escolta = escolta;
	}

	public Utilitario(Automovel a, int capacidadeCarga, int nroEixos, boolean escolta) {
		super(a.getAutomovelID(), a.getPlaca(), a.getCor(), a.getNroPortas(), a.getTipoCombustivel(),
				a.getQuilometragem(), a.getCusto());
		this.capacidadeCarga = capacidadeCarga;
		this.nroEixos = nroEixos;
		this.escolta = escolta;
	}

	public static Utilitario criar() {
		Automovel a = Automovel.criar();
		int capacidadeCarga, nroEixos;
		boolean escolta;
		System.out.println("Digite a capacidade de carga:");
		capacidadeCarga = Leitura.lerInt();
		System.out.println("Digite o número de eixos:");
		nroEixos = Leitura.lerInt();
		System.out.println("O veículo possui escolta? (1 - sim | 2 - não)");
		escolta = Boolean.getBoolean(Leitura.lerString());
		return new Utilitario(a, capacidadeCarga, nroEixos, escolta);
	}

	@Override
	public String toString() {
		return "Executivo [\n\tcapacidadeCarga=" + capacidadeCarga + "\n\tnroEixos=" + nroEixos + "\n\tescolta="
				+ escolta + super.toString() + "]";
	}

	public double calcularCustos() {
		return super.getCusto(); // Provisório
	}

	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getNroEixos() {
		return nroEixos;
	}

	public void setNroEixos(int nroEixos) {
		this.nroEixos = nroEixos;
	}

	public boolean isEscolta() {
		return escolta;
	}

	public void setEscolta(boolean escolta) {
		this.escolta = escolta;
	}

}
