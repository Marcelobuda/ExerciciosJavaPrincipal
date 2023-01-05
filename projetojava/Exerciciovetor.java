package projetojava;

import java.util.Scanner;

public class Exerciciovetor {
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

}


