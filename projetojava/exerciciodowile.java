package projetojava;

import java.util.Scanner;

public class exerciciodowile {
	Scanner ler = new Scanner(System.in);
    int numero,positivo=0,soma=0;
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

