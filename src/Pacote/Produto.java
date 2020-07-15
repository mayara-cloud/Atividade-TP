package Pacote;

public class Produto {

	//classe principal
			
			private String nome;
			private int codbarras;
			protected float valor;
			protected float valorfinal;
			protected int quantidade;
			protected float valortotal;
			
		//METODOS				
			public void ComprarProduto() {
				System.out.println("Compra de " + this.nome + ", no valor de R$" + this.valor + ", Cod de Barras ["+ this.codbarras + "], " + this.quantidade + " unidade(s)");	
			}
			
			public void SomaQuantidade() {
					valorfinal = valor*quantidade;
				}
			
			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public int getCodbarras() {
				return codbarras;
			}

			public void setCodbarras(int codbarras) {
				this.codbarras = codbarras;
			}

			public float getValor() {
				return valor;
			}

			public void setValor(float valor) {
				this.valor = valor;
			}
			
			
			public float getValorfinal() {
				return valorfinal;
			}

			public void setValorfinal(float valorfinal) {
				this.valorfinal = valorfinal;
			}

			public int getQuantidade() {
				return quantidade;
			}

			public void setQuantidade(int quantidade) {
				this.quantidade = quantidade;
			}

			
	}