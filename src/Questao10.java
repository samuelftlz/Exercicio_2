import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero de ( 1 a 10): ");
        int verificar = scanner.nextInt();

        if (verificar < 1 || verificar > 10) {
            System.out.println("Valor invalido");
        } else {
            System.out.println("Tabuado do " + verificar);
            for (int i = 1; i <= 10; i++) {
                int resultado = verificar * i;
                System.out.println(verificar + " x " + i + " = " + resultado);
            }
        }
    }
}
