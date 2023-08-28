import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do atleta: ");
        String nomeAtleta = scanner.nextLine();

        ArrayList<Double> saltos = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            System.out.print("Digite a distancia do " + i + "ª salto: ");
            double distancia = scanner.nextDouble();
            saltos.add(distancia);
        }
        double maiorSalto = Collections.max(saltos);
        double menorSalto = Collections.min(saltos);

        saltos.remove(maiorSalto);
        saltos.remove(menorSalto);

        double somaSaltos = 0;
        for (int i = 0; i < saltos.size(); i++) {
            double salto = saltos.get(i);
            somaSaltos += salto;
        }
        double mediaSaltos = somaSaltos / saltos.size();

        System.out.println("Resultado final para o atleta " + nomeAtleta + ":");
        System.out.println("Melhor salto: " + maiorSalto + "m");
        System.out.println("Pior salto: " + menorSalto + "m");
        System.out.println("Média dos saltos: " + mediaSaltos + "m");

        scanner.close();
    }
}
