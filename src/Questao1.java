import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o 1ª numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o 2ª numero: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior numero e " + num1);
        }else {
            System.out.println("O maior o numero e " + num2);
        }
    }
}
