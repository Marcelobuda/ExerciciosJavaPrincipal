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
}