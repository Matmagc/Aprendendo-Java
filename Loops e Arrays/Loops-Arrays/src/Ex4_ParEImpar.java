import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantnumeros;
        int numero;
        int quantpares = 0;
        int quantimpares = 0;

        System.out.println("quantidade de numeros: ");
        quantnumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            count = count + 1 ;

            if (numero % 2 == 0) quantpares++;
            else quantimpares++;

        

        } while(count < quantnumeros);

        System.out.println("pares: " + quantpares);
        System.out.println("impares: " + quantimpares);


    }
}