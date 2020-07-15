package Pacote;

public class Principal {

	// meu programa principal
	// se o capiroto fala algum idioma, com certeza ele fala em JAVA
	// compras acima de 50,00 ganha desconto
		
		public static void main(String[] args) {
			
			Livro p1 = new Livro();
			CD p2 = new CD();
			Camiseta p3 = new Camiseta();
		
			// PARA ALTERAR OS SETS DAS VARIAVEIS - MODIFIQUE OS VALORES ENTRE PARATENSES)
			// retire as barras para executar os sets
			// utilize um produto por vez - nao execute todos de uma vez
			
			//LIVRO
			/*p1.setNome("Harry Styles Biografia");
			p1.setValor(30);
			p1.setD3(10);
			p1.setCodbarras(123456);
			p1.setAno(2020);
			p1.setEditora("Mayara Publi");
			p1.setPaginas(180);
			p1.setQuantidade(1);
			p1.ComprarProduto();
			p1.SomaQuantidade();
			p1.DescontoLivro();*/
			
			
			
		   //CD
			/*p2.setNome("Harry Styles - Fine Line");
			p2.setValor(30);
			p2.setD2(10);
			p2.setGravadora("Larry Inc");
			p2.setCodbarras(23456);
			p2.setQtdmusicas(15);
			p2.setAnolancamento(2020);
			p2.setQuantidade(3);
			p2.ComprarProduto();
			p2.SomaQuantidade();
			p2.DescontoCD();*/
			
			// CAMISETA
			p3.setNome("H Styles Tour 2020");
			p3.setValor(40);
			p3.setD1(10);;
			p3.setCodbarras(78889);
			p3.setTamanho("M");
			p3.setCor("ROSA");
			p3.setQuantidade(4);
			p3.ComprarProduto();
			p3.SomaQuantidade();
			p3.DescontoCamiseta();
			
			
					
			// nao esqueca de retirar as barras de acordo com o produto que vc quer executar
			
			//System.out.println(p1.toString());
			//System.out.println(p2.toString());
			System.out.println(p3.toString());
			
			
			
		}
	}

