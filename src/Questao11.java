import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        System.out.print("Digita o numero que ira comecar entre (1 a 10): ");
        int valorEntrada = scanner.nextInt();
        System.out.print("Digite o numero que vai terminar entre (1 e 10):  ");
        int valorSaida = scanner.nextInt();

        if (valorEntrada > valorSaida){
            System.out.println("Erro, o numero inicial nao poder ser maior que o final!");
        }

        System.out.println("Tabuada do " + numero + " no intervalo de " + valorEntrada + " a " + valorSaida);

        for (int i = valorEntrada; i <= valorSaida; i++) {
            int resultado = numero * i;
            System.out.println(numero  + " x " + i + " = " + resultado);
        }
    }
}
