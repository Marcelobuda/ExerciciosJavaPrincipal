package projetojava;

import java.util.Scanner;

public class exerciciofor {
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
        }
}

