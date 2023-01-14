package exercicioPoo;

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
