import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto e o seu salario? ");
        double salarioAtual = scanner.nextDouble();
        double percentualAumento = 0;

        if (salarioAtual <= 280) {
            percentualAumento = 20;
        } else if (salarioAtual >= 280 && salarioAtual <= 700) {
            percentualAumento = 15;
        } else if (salarioAtual >= 700 && salarioAtual <= 1500) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }
        double aumento = salarioAtual * (percentualAumento / 100);
        double novoSalario = salarioAtual + aumento;

        System.out.println("Salario antes do reajuste R$ " + salarioAtual);
        System.out.println("O percentual de aumento que foi aplicado foi de " + percentualAumento + "%");
        System.out.println("O aumento foi de RS " + aumento);
        System.out.println("O novo salario, apos o aumento foi de R$ " + novoSalario);
    }
}
