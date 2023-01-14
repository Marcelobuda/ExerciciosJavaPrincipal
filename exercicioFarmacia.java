package exercicioPoo;

public class exercicioFarmacia {
	public class farmacia {
		private String preço;
		private String nomeProduto;
		private String promoção;

		
		public farmacia(String preço, String nomeProduto, String promoção) {
			super();
			this.preço = preço;
			this.nomeProduto = nomeProduto;
			this.promoção = promoção;
			
		}


		public String getPreço() {
			return preço;
		}


		public void setPreço(String preço) {
			this.preço = preço;
		}


		public String getNomeProduto() {
			return nomeProduto;
		}


		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}


		public String getPromoção() {
			return promoção;
		}


		public void setPromoção(String promoção) {
			this.promoção = promoção;
		}


		public void visualizar(){
			
			System.out.println("\nOlá Seja Bem Vindes a minha Farmacia");
	        System.out.println("\nOs melhores perfumes estão aqui!" );
	        System.out.println("\nTemos Promoções de Perfume : " +getNomeProduto() );
			
		}
	}
	package exercicioPoo;

	public class perfumaria extends farmacia{
		private String marca;

		public perfumaria(String preço, String nomeProduto, String promoção, String marca) {
		super(preço, nomeProduto, promoção);
		this.marca = marca;
		
	}
		
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public void imprimirInfo() {
			
		     System.out.println("\nTemos as Melhores Marcas: "+getMarca());
		        System.out.println("\nMelhores Preços: R$" +getPreço());

		    }
		
		package exercicioPoo;

		public class medicamentos extends farmacia {
			
			private String validade;

			public medicamentos(String preço, String nomeProduto, String promoção, String validade) {
				super(preço, nomeProduto, promoção);
				this.validade = validade;
			}

			public String getValidade() {
				return validade;
			}

			public void setValidade(String validade) {
				this.validade = validade;
			}
			public void imprimirInfo() {
				
			
			System.out.println("Melhores Medicamentos:" +getNomeProduto());
		    System.out.println("Com validade até:" +getValidade());
			}
		}

		package exercicioPoo;

		public class farmaciaTeste {
			public static void main(String[] args) { 
				farmacia far = new farmacia ("15,90","Kaiak","Cosmedicos");
		        far.visualizar();

		        perfumaria per = new perfumaria ("20,50","MAC","Avon","Natura");
		        per.imprimirInfo();
			
			System.out.println("\nMelhores Ofertas :R$");
			System.out.printf("\n15,90","kaiak" ,"cosmeticos " );
			far.getNomeProduto();
			
			
			
}
