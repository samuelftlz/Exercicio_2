import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto custa sua hora? ");
        double valor = scanner.nextDouble();
        System.out.print("Quantas horas voce trabalha por mes? ");
        double horas = scanner.nextDouble();
        double salarioBruto = valor * horas;
        double descontoIr = 0;
        double inss = 0.1;
        double fgts = 0.11;

        if (salarioBruto <= 900) {
            System.out.println("Isento");
        } else if (salarioBruto <= 1500) {
            descontoIr = 0.05;
        } else if (salarioBruto <= 2500) {
            descontoIr = 0.1;
            }else {
            descontoIr = 0.2;
        }
        double calculoIr = salarioBruto * descontoIr;
        double calculoInss = salarioBruto * inss;
        double salarioLiquido = salarioBruto - calculoIr - calculoInss;
        double totalDesconto = calculoIr + calculoInss;
        double empresaDeposita = salarioBruto * fgts;

        System.out.println("O salario bruto é R$ " + salarioBruto);
        System.out.println("O valor descontado do Imposto de Renda é R$ " + calculoIr);
        System.out.println("O valor descontado do INSS é R$ " + calculoInss);
        System.out.println("O valor do FGTS que a empresa deposita é R$ " + empresaDeposita);
        System.out.println("O Total de desconto é R$ " + totalDesconto);
        System.out.println("O Seu salário líquido é R$ " + salarioLiquido);
    }
}
