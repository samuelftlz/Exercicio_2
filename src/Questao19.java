import java.util.ArrayList;
import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite as notas (digite -1 para encerrar):");
        double nota;
        while (true) {
            nota = scanner.nextDouble();
            if (nota == -1) {
                break;
            }
            notas.add(nota);
        }

        System.out.println("Quantidade de valores lidos: " + notas.size());

        System.out.print("Valores informados: ");
        for (int i = 0; i < notas.size(); i++) {
            System.out.print(notas.get(i) + " ");
        }
        System.out.println();

        System.out.println("Valores informados em ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        double soma = 0;
        for (int i = 0; i < notas.size(); i++) {
            soma += notas.get(i);
        }
        System.out.println("Soma dos valores: " + soma);

        double media = soma / notas.size();
        System.out.println("Média dos valores: " + media);

        int acimaDaMedia = 0;
        int abaixoDeSete = 0;
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) > media) {
                acimaDaMedia++;
            }
            if (notas.get(i) < 7) {
                abaixoDeSete++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaDaMedia);
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoDeSete);

        System.out.println("Programa encerrado.");
    }
}
