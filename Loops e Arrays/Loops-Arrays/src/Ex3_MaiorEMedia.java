import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        int maior = 0;

        int media = 0;

        int count = 0;

        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            if (numero > maior) maior = numero;
                
            count = count + 1;
            media = (media + numero);


        } while(count < 5);
        
        System.out.println("maior: " + maior);
        System.out.println("média: " + media/count);


    }

}
