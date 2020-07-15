package Pacote;

public class Livro extends Produto{
	
	private int ano;
	private String editora;
	private int paginas;
	private int D3;
	
	public void DescontoLivro () {
		if (valorfinal >=50) {
			valortotal = valorfinal - D3;
			System.err.println("Eba! Voce teve um desconto de R$ " + D3);
		}
		else if (valorfinal < 50 ) {
		valortotal = valorfinal; {
			System.err.println("Que Pena! Acumule R$50,00 e ganhe descontos");
		}
	}
	}
	
	
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}


	public int getD3() {
		return D3;
	}


	public void setD3(int d3) {
		D3 = d3;
	}


	@Override
	public String toString() {
		return "Resumo do Pedido: 1 Livro, Ano=" + ano + ", Editora = " + editora + ", Paginas=" + paginas + ", Valor Total de, R$=" + this.valortotal;
	}
	
	

}