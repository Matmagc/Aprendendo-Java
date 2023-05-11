// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class IdadePlanetaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double idadeTerrestre = scanner.nextDouble();
    String planeta = scanner.next();

    //TODO: Crie as condições para calcular a idade equivalente de cada planeta.
    
    //TODO: Imprima a saída conforme descrito neste desafio.

    double idadeJupiter = (idadeTerrestre/11.86);
    double idadeMarte = (idadeTerrestre/1.88);
    double idadeVenus = (idadeTerrestre/0.62);

    if (planeta.equals ("Marte") ) {
        System.out.printf("Idade equivalente em Marte: %.2f anos", idadeMarte);
    }else if (planeta.equals ("Jupiter") ) {
        System.out.printf("Idade equivalente em Jupiter: %.2f anos", idadeJupiter);
    }else if (planeta.equals ("Venus") ) {
        System.out.printf("Idade equivalente em Venus: %.2f anos", idadeVenus);
    }else {
        System.out.println("Planeta invalido.");
    }
    scanner.close();
  }
}