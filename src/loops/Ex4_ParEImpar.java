package loops;

import java.util.Scanner;

/*
Faça um programa que peça N numeros inteiros
calcule e mostre a quantidade de numeros pares
e quantidade de numeros ímpares
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int quantidadeDeNumeros;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Digite a quantidade de números: ");
        quantidadeDeNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.print("Número: ");
            numero = scan.nextInt();

                if (numero % 2 == 0) quantidadePares++;
                else quantidadeImpares++;

            count++;
        } while(count < quantidadeDeNumeros);

        System.out.println("Quantidade pares: " + quantidadePares);

        System.out.println("Quantidade ímpares: " + quantidadeImpares);
    }
}
