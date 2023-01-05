package projetojava;

import java.util.Scanner;

public class exerciciomatriz {
	
public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		int numeros[][] = new int[2][3];
		
		
		int linha,coluna,somaNumeros=0;
		
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


			