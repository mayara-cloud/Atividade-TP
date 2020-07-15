package Pacote;

public class Camiseta extends Produto {
	// herda herança de produto
	
		private String tamanho;
		private String cor;
		private int D1;
		
		//METODOS
		public void DescontoCamiseta() {
			if (valorfinal >=50) {
				valortotal = valorfinal - D1;
				System.err.println("Eba! Voce teve um desconto de R$ " + D1);
			}
			else if (valorfinal < 50 ) {
			valortotal = valorfinal; {
				System.err.println("Que Pena! Acumule R$50,00 e ganhe descontos");
			}
		}
		}
		
		public String getTamanho() {
			return tamanho;
		}
		public void setTamanho(String tamanho) {
			this.tamanho = tamanho;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}

		public int getD1() {
			return D1;
		}

		public void setD1(int d1) {
			D1 = d1;
		}

		
		public String toString() {
			return "Resumo do Pedido: 1 Camiseta no Tamanho = " + tamanho + ", Cor = " + cor + ", Valor Total de R$" + this.valortotal;
		}
		
		
		
		
	}
