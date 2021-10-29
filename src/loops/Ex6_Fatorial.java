package loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de numero inteiro.
ex: 5! = 120
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.print(multiplicacao);
    }
}
