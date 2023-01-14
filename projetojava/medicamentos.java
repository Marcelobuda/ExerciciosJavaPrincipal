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



