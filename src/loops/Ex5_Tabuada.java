package loops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer numero inteiro entre 1 e 10
O usuario deve informar de qual número ele deseja ver a tabuada.
 */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count;

        System.out.println("Digite um número de 1 a 10: ");
        numero = scan.nextInt();

        System.out.println("Tabuada do " + numero);

        for (count = 1; count <= 10; count++) {
            int multiplicacao = numero * count;
            System.out.println(numero + " x " + count + " = " + multiplicacao);
        }
    }
}

