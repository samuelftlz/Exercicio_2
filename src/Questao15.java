import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}