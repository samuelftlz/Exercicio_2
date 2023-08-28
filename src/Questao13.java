import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();

        double soma = 0.0;
        for (int i = 1; i <= N; i++) {
            soma += 1.0 / i;
        }

        System.out.println("O valor de H com " + N + " termos é: " + soma);
    }
}
