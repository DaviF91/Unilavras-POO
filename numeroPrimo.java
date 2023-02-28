// Atividade 2

// Escreva um programa em Java que leia um número inteiro e verifique se ele é primo ou não utilizando estruturas condicionais e de repetição. Faça o código comentado linha a linha.

import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

public class numeroPrimo {

  public static void main(String[] args) {
    try (// Cria um objeto da classe Scanner para ler os dados
        Scanner input = new Scanner(System.in)) {
      System.out.print("Digite um número inteiro: ");

      // Lê o número digitado
      int numero = input.nextInt();

      // Assume que o número é primo
      boolean primo = true;

      // Verifica se o número é menor que 2 (números menores que 2 não são primos)
      if (numero < 2) {
        primo = false;
      } else {
        // Loop para verificar se o número é divisível por outro número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
          // Se o número for divisível por algum ele não é primo
          if (numero % i == 0) {
            primo = false;
            // Sai do loop
            break;
          }
        }
      }
      if (primo) { // Verifica se o número é primo e exibe a mensagem para o usuário
        System.out.println(" O número é primo.");
      } else {
        System.out.println(" O número não é primo.");
      }
    }
  }

}