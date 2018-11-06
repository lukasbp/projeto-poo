package aula;

import java.util.Calendar;
import java.util.Scanner;

public class Locacao {
	private Cliente cliente;
	private Calendar dtLocacao, dtDevolucao, dtDevolucaoPrevista;
	private long kmLocacao, kmDevolucao;
	private double valorCaucao, valorLocacao;
	private int locacaoID;
	private boolean paga;

	public Locacao(Cliente cliente, Calendar dtLocacao, Calendar dtDevolucao, Calendar dtDevolucaoPrevista,
			long kmLocacao, long kmDevolucao, double valorCaucao, double valorLocacao, boolean paga) {
		this.cliente = cliente;
		this.dtLocacao = dtLocacao;
		this.dtDevolucao = dtDevolucao;
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
		this.kmLocacao = kmLocacao;
		this.kmDevolucao = kmDevolucao;
		this.valorCaucao = valorCaucao;
		this.valorLocacao = valorLocacao;
		this.paga = paga;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Calendar getDtLocacao() {
		return dtLocacao;
	}

	public void setDtLocacao(Calendar dtLocacao) {
		this.dtLocacao = dtLocacao;
	}

	public Calendar getDtDevolucao() {
		return dtDevolucao;
	}

	public void setDtDevolucao(Calendar dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}

	public Calendar getDtDevolucaoPrevista() {
		return dtDevolucaoPrevista;
	}

	public void setDtDevolucaoPrevista(Calendar dtDevolucaoPrevista) {
		this.dtDevolucaoPrevista = dtDevolucaoPrevista;
	}

	public long getKmLocacao() {
		return kmLocacao;
	}

	public void setKmLocacao(long kmLocacao) {
		this.kmLocacao = kmLocacao;
	}

	public long getKmDevolucao() {
		return kmDevolucao;
	}

	public void setKmDevolucao(long kmDevolucao) {
		this.kmDevolucao = kmDevolucao;
	}

	public double getValorCaucao() {
		return valorCaucao;
	}

	public void setValorCaucao(double valorCaucao) {
		this.valorCaucao = valorCaucao;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public int getLocacaoID() {
		return locacaoID;
	}

	public void setLocacaoID(int locacaoID) {
		this.locacaoID = locacaoID;
	}

	public boolean isPaga() {
		return paga;
	}

	public void setPaga(boolean paga) {
		this.paga = paga;
	}

	public static Locacao criar() {
		Scanner sc = new Scanner(System.in);
		Cliente cliente;
		int cli;
		Calendar dtLocacao, dtDevolucao, dtDevolucaoPrevista;
		long kmLocacao, kmDevolucao;
		double valorCaucao, valorLocacao;
		boolean paga;
		System.out.println("Cliente pf ou pj, digite 1 para pf e 2 para pj.");
		cli = Leitura.lerInt(); 
		if(cli == 1) {
			cliente = ClientePF.criar();
		}
		else if(cli == 2) {
			cliente = ClientePJ.criar();
		}
		else {
			System.out.println("digite um dos dois numeros propostos.");//Provisório
			return criar();
		}
		System.out.println("data de locacao do veiculo");//atributos calendar para implementar
		System.out.println("data de devolucao:");
		System.out.println("data prevista para devolucao:");
		System.out.println("insira o km de locacao do veiculo:");
		kmLocacao = (long) Leitura.lerInt();
		System.out.println("insira a quilometragem que foi devolvido o veiculo");
		kmDevolucao = (long) Leitura.LerInt();
		System.out.println("insira o valor de caucao:");
		valorCaucao = Leitura.lerDouble();
		System.out.println("insira o valor de locacao do veiculo:");
		valorLocacao = Leitura.lerDouble();
		System.out.println("a locacao foi paga? digite 1 para sim, e 2 para nao.");
		paga = Boolean.getBoolean (Leitura.lerString());
		Locacao lc = new Locacao(cliente, dtLocacao, dtDevolucao, dtDevolucaoPrevista, kmLocacao, kmDevolucao, valorCaucao,
				valorLocacao, paga);
		return lc;
	}

	@Override
	public String toString() {
		return "Locacao [dtLocacao=" + dtLocacao + ", dtDevolucao=" + dtDevolucao + ", dtDevolucaoPrevista="
				+ dtDevolucaoPrevista + ", kmLocacao=" + kmLocacao + ", kmDevolucao=" + kmDevolucao + ", valorCaucao="
				+ valorCaucao + ", valorLocacao=" + valorLocacao + ", locacaoID=" + locacaoID + ", paga=" + paga + "]";
	}

	
	

}