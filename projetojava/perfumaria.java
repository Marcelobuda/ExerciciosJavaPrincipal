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
	
	}

