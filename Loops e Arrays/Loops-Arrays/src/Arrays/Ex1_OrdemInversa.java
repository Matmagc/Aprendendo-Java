package Arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        //int count = 0;

        System.out.println("!vetor: ");


        /*
        while (count < (vetor.length)){
            System.out.println(vetor[count]+ " ");
            count++;
        } */

        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }

}