package projeto.poo.automovel;

import projeto.poo.Leitura;

public class Onibus extends Automovel {

	private int nroPassageiros;
	private double vlSeguroPassageiro;

	public Onibus(int automovelID, String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem,
			double custo, int nroPassageiros, double vlSeguroPassageiro) {
		super(automovelID, placa, cor, nroPortas, tipoCombustivel, quilometragem, custo);
		this.nroPassageiros = nroPassageiros;
		this.vlSeguroPassageiro = vlSeguroPassageiro;
	}

	public Onibus(Automovel a, int nroPassageiros, double vlSeguroPassageiro) {
		super(a.getAutomovelID(), a.getPlaca(), a.getCor(), a.getNroPortas(), a.getTipoCombustivel(),
				a.getQuilometragem(), a.getCusto());
		this.nroPassageiros = nroPassageiros;
		this.vlSeguroPassageiro = vlSeguroPassageiro;
	}

	public static Onibus criar() {
		Automovel a = Automovel.criar();
		double vlSeguroPassageiro;
		int nroPassageiros;
		System.out.println("Digite o número de passageiros:");
		nroPassageiros = Leitura.lerInt();
		System.out.println("Digite o valor do seguro por passageiro:");
		vlSeguroPassageiro = Leitura.lerDouble();
		return new Onibus(a, nroPassageiros, vlSeguroPassageiro);
	}

	@Override
	public String toString() {
		return "Executivo [\n\tnroPassageiros=" + nroPassageiros + "\n\tvlSeguroPassageiro=" + vlSeguroPassageiro
				+ super.toString() + "]";
	}

	public double calcularCustos() {
		return super.getCusto(); // Provisório
	}

	public int getNroPassageiros() {
		return nroPassageiros;
	}

	public void setNroPassageiros(int nroPassageiros) {
		this.nroPassageiros = nroPassageiros;
	}

	public double getVlSeguroPassageiro() {
		return vlSeguroPassageiro;
	}

	public void setVlSeguroPassageiro(double vlSeguroPassageiro) {
		this.vlSeguroPassageiro = vlSeguroPassageiro;
	}

}
