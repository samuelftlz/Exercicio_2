import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "ª numero: ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior numero é " + maior);
    }
}