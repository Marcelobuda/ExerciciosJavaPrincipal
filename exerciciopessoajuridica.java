package projetojava;

public class exerciciopessoajuridica {
	package projetojava;

	public class Cliente {
	    private static final java.lang.String String = null;
		private java.lang.String nome;
	    private int cpf;
	    
	    public Cliente (Pessoajuridica jJP, int cpf)
	    {
	     this.nome = (String);
	     
	     this.cpf = cpf;
	     
	    }

		public Cliente(java.lang.String string2, int cpf2) {
			// TODO Auto-generated constructor stub
		}

		public Object getNome() {
			return nome;
		}

		public void setNome(String String2) {
			this.nome = String2;
		}

		public int getCpf() {
			return cpf;
		}

		public void setCpf(int cpf) {
			this.cpf = cpf;
		}

	     
	}
	package projetojava;

	public class Pessoafisica extends Cliente{
		private String profissão;
		
		public Pessoafisica(String nome,int cpf, String profissão){
		
		
			super(nome,cpf);
			this.profissão = profissão;}
			
			
		
		public String getProfissão() {
			return profissão;
		}
		public void setProfissão(String profissão) {
			this.profissão = profissão;
		}
								
	    
	}
	public class Pessoajuridica extends Cliente{
		public Pessoajuridica(Pessoajuridica JJP, int cpf) {
			super(JJP, cpf);
			// TODO Auto-generated constructor stub
		}
		private String ramoAtividade;
		private long cnpj;
		
		
		
			
			
		public long getCnpj() {
			return cnpj;
		}
		public void setCnpj(long cnpj) {
			this.cnpj = cnpj;
			
		
			
		}

		public String getRamoAtividade() {
			return ramoAtividade;
		}

		public void setRamoAtividade(String ramoAtividade) {
			this.ramoAtividade = ramoAtividade;
		}
		{

		}
		}   

	public class TesteCliente {
		   private static final Pessoajuridica JJP = null;

		public static void main (String args[])
		   {
			   Cliente marcelo = new Cliente("Marcelo",123456789 );
			   
				Pessoafisica pedro = new Pessoafisica ("Pedro",023344657,"motoboy" );
				
				Pessoajuridica IBM = new Pessoajuridica(JJP, 0);
				
				marcelo.setNome("Marcelo");
				marcelo.setCpf(123456789);
				System.out.println(marcelo.getNome());

				System.out.println(pedro.getProfissão());
				System.out.println(IBM.getRamoAtividade());
				System.out.println(marcelo.getCpf());
				
		   }
		}

