import java.util.Scanner;

public class ParOuImpar {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verifica se o resto da divisão do número por 2 é igual a zero (número par)
        if(numero %2 == 0){
            System.out.println("O número " + numero + " é PAR");

            // Caso contrário (resto diferente de 0), o número é ímpar
        }else{
            // Junta os textos fixos com o valor da variável 'numero' e exibe o resultado na tela
            System.out.println("O número " + numero + " é IMPAR");
        }

        scanner.close();
    }
}
