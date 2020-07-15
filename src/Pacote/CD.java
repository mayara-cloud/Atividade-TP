package Pacote;

public class CD extends Produto {

	private int qtdmusicas;
	private String gravadora;
	private int D2;
	private int anolancamento;
	
	public void DescontoCD () {
		if (valorfinal >=50) {
			valortotal = valorfinal - D2;
			System.err.println("Eba! Voce teve um desconto de R$ " + D2);
		}
		else if (valorfinal < 50 ) {
		valortotal = valorfinal; {
			System.err.println("Que Pena! Acumule R$50,00 e ganhe descontos");
		}
	}
	}
	
	
	public int getQtdmusicas() {
		return qtdmusicas;
	}
	public void setQtdmusicas(int qtdmusicas) {
		this.qtdmusicas = qtdmusicas;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public int getD2() {
		return D2;
	}

	public void setD2(int d2) {
		D2 = d2;
	}

	public int getAnolancamento() {
		return anolancamento;
	}


	public void setAnolancamento(int anolancamento) {
		this.anolancamento = anolancamento;
	}


	public String toString() {
		return "Resumo do Pedido 1 CD com :" + qtdmusicas + " musicas, Gravadora " + gravadora + ", Ano de Lançamento "+ anolancamento + ", Valor Total R$" + this.valortotal;
	}


}
