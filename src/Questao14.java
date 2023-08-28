import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}