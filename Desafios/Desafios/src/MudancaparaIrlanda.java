// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class MudancaparaIrlanda {
  
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        // Leitura do salário e dos benefícios
        double salarioBruto = input.nextDouble();
        double beneficios = input.nextDouble();
        
        double imposto = 0;
        //TODO: Implemente as regras para o cálculo do imposto.
        
        // Cálculo do salário líquido
        double salarioLiquido = salarioBruto - imposto + beneficios;
        
        //TODO: Imprimir o salário líquido com 2 casas decimais.

        if(salarioBruto < 1100.00 ) {
            imposto = (salarioBruto * 0.05);
            salarioLiquido = salarioBruto - imposto + beneficios;
            System.out.printf("%.2f" , salarioLiquido);

        }else if (salarioBruto > 2500) {
            imposto = ( salarioBruto * .15 );
            salarioLiquido = salarioBruto - imposto + beneficios;
            System.out.printf("%.2f" , salarioLiquido);
        }else {
            imposto = ( salarioBruto * .10 );
            salarioLiquido = salarioBruto - imposto + beneficios;
            System.out.printf("%.2f" , salarioLiquido); 
        }
    }
  }
}