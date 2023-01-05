package projetojava;
import java.util.Scanner;

public class exerciciovetormatriz {
	
	
	public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			float media[] = new float[4];
			
			
			float n1,n2,n3,somaMedia=0,mediaGeral;
			int x;
			
			for(x=0;x<4;x++) {
				
				System.out.println("\nAlune "+(x+1)+":");
				System.out.println("\nEntre com a primeira nota: ");
				n1 = leia.nextFloat();
				System.out.println("\nEntre com a segunda nota: ");
				n2 = leia.nextFloat();
				System.out.println("\nEntre com a terceira nota: ");
				n3 = leia.nextFloat();
				
				media[x] = (n1+n2+n3)/3;
				
				somaMedia += media[x];
			}
			
			for(x=0;x<4;x++) {
				System.out.println("\nMédia Alune "+(x+1)+":"+media[x]);
			}
			mediaGeral = somaMedia / 4;
			System.out.printf("\nMédia geral da turma foi de: %.2f",mediaGeral);

		

	}	
	
	
	int numeros[][] = new int[2][3];
	
	
	int linha,coluna,somaNumeros=0;
	
	Scanner leitura = new Scanner(System.in);
	{
	
	for(linha=0;linha<2;linha++) {
		for(coluna=0;coluna<3;coluna++) {
			System.out.println("\nEntre com um número qualquer: ");
			numeros[linha][coluna] = leitura.nextInt();
			somaNumeros += numeros[linha][coluna];
		}
	}
	System.out.println("\nSomatório dos números foi de: "+somaNumeros);
	
	for(linha=0;linha<2;linha++) {
		System.out.println("\n");
		for(coluna=0;coluna<3;coluna++) {
			System.out.printf("%d , ",numeros[linha][coluna]);
		}
	}
}
}










