// Escreva um programa em Java que calcule a média aritmética de três números informados pelo usuário utilizando estruturas de repetição e modularização para separar a lógica de cálculo da lógica de entrada e saída de dados. Faça o código comentado linha a linha.

import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

public class media {

  public static void main(String[] args) {
    // Cria um objeto 
    Scanner input = new Scanner(System.in); 
    // Chama o método lerNumero() para ler para ler os números digitados
    double num1 = lerNumero(input, "Digite o primeiro número: ");
    double num2 = lerNumero(input, "Digite o segundo número: "); 
    double num3 = lerNumero(input, "Digite o terceiro número: "); 

    // Chama o método calcularMedia() para calcular a média
    double media = calcularMedia(num1, num2, num3); 

    // Exibe o resultado
    System.out.printf("A média aritmética é %.2f", media); 
  }

  public static double lerNumero(Scanner input, String mensagem) {
    System.out.print(mensagem);
    // Lê o número digitado 
    double numero = input.nextDouble(); 
    // Retorna o número
    return numero; 
  }

  public static double calcularMedia(double num1, double num2, double num3) {
    // Calcula a soma dos números
    double soma = num1 + num2 + num3; 
    // Calcula a média
    double media = soma / 3.0; 
    // Retorna a média
    return media; 
  }

}

