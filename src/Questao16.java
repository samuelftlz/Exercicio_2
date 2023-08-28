import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o " + i + "ª numero: ");
            double numero = scanner.nextDouble();
            soma += numero;
        }
        System.out.println("A soma dos tres numeros é " + soma);
    }
}
