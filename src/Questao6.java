import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Em que turno voce estuda? (M-Matutino, V-Vespetino, N-Noturno): ");
        char turno = scanner.next().charAt(0);

        switch (turno) {
            case 'M':
            case 'm':
                System.out.println("Bom dia");
                break;
            case 'V':
            case 'v':
                System.out.println("Boa tarde");
                break;
            case 'N':
            case 'n':
                System.out.println("Boa noite");
                break;
            default:
                System.out.println("Valor invalido!");
        }
    }
}
