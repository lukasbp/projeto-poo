package projeto.poo.automovel;

import projeto.poo.Leitura;

public class Executivo extends Automovel {

	private double vlOpcionais;

	public Executivo(int automovelID, String placa, String cor, int nroPortas, char tipoCombustivel, long quilometragem,
			double custo, double vlOpcionais) {
		super(automovelID, placa, cor, nroPortas, tipoCombustivel, quilometragem, custo);
		this.vlOpcionais = vlOpcionais;
	}

	public Executivo(Automovel a, double vlOpcionais) {
		super(a.getAutomovelID(), a.getPlaca(), a.getCor(), a.getNroPortas(), a.getTipoCombustivel(),
				a.getQuilometragem(), a.getCusto());
		this.vlOpcionais = vlOpcionais;
	}

	public static Executivo criar() {
		Automovel a = Automovel.criar();
		double vlOpcionais;
		System.out.println("Digite o valor opcional:");
		vlOpcionais = Leitura.lerDouble();
		return new Executivo(a, vlOpcionais);
	}

	@Override
	public String toString() {
		return "Executivo [\n\tvlOpcionais=" + vlOpcionais + super.toString() + "]";
	}

	public double calcularCustos() {
		return super.getCusto(); // Provisório
	}

	public double getVlOpcionais() {
		return vlOpcionais;
	}

	public void setVlOpcionais(double vlOpcionais) {
		this.vlOpcionais = vlOpcionais;
	}

}
