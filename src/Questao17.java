import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Qual e o valor da prestacao (ou 0 para sair): ");
            double valorPestacao = scanner.nextDouble();

            if (valorPestacao == 0) {
                break;
            }
            System.out.print("Quantos dias de atraso? ");
            int diasAtraso = scanner.nextInt();

            double valorpago = calcularValorPago(valorPestacao, diasAtraso);
            System.out.println("Valor a ser pago R$ " + valorpago);
        }
        System.out.println("Programa encerrado!");
    }
    public static double calcularValorPago(double valorPrestacao, int diasAtraso) {
        if (diasAtraso <= 0) {
            return valorPrestacao;
        } else {
            double multa = valorPrestacao * 0.03;
            double juros = valorPrestacao * (diasAtraso * 0.001);
            return valorPrestacao + multa + juros;
        }
    }
}
