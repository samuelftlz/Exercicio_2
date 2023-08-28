import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        int valor = scanner.nextInt();

        if (valor >= 0) {
            System.out.println("O numero " + valor + " e positivo");
        }else {
            System.out.println("O numero " + valor + " e negativo");
        }
    }
}
