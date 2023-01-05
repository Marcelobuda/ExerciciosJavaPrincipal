package projetojava;
import java.util.Scanner;
public class exerciciosfordowile {
	

	
	    public static void main(String[] args) {
	        Scanner leia = new Scanner(System.in);

	        int num,contPar=0,contImpar=0,x;


	        for (x=1;x<=10;x++)
	        {
	            System.out.println("\nEntre com um número: ");
	            num = leia.nextInt();
	            if (num % 2 == 0)
	            {
	               contPar++; 
	            }
	            else

	                {
	                    contImpar++;
	                }

	            }
	            System.out.printf("\nTemos: "+contPar+" números pares...");
	            System.out.printf ("\nTemos: "+contImpar+" números ímpares...");
	        
	    Scanner ler = new Scanner(System.in);
	    int numero,positivo=0,soma=0;
	    {
	    System.out.println("\nDigite um número: ");
	    numero = ler.nextInt();
	    do
	    {
	        if(numero>=1) {
	            soma = numero + soma;
	            positivo++;
	        }
	        System.out.println("Digite um número: ");
	        numero = ler.nextInt();
	    }while(numero!=0);
	    System.out.println("A soma dos números positivos é: "+soma);

	    }
	    }


		int idade,maiores=0,menores=0;
		 Scanner ler = new Scanner(System.in);
		{
		System.out.println("\nDigite uma idade: ");
		idade = ler.nextInt();
		
		while (idade>=1) {
		
		    if(idade<=21) {
		        menores++;
		    }
		    else if(idade>=50) {
		        maiores++;
		    }
		    System.out.println("Digite uma idade: ");
		    idade = ler.nextInt();
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: "+menores);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+maiores);
		}
		}

	



