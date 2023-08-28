import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima? ");
        perguntas.add("Esteve no local do crime? ");
        perguntas.add("Mora perto da vitima? ");
        perguntas.add("Devia para a vitima? ");
        perguntas.add("Ja trabalhou para a vitima? ");

        int respostaPositivas = 0;

        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println(perguntas.get(i));
            System.out.print("Responda 'sim' ou 'nao':  ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("sim")) {
                respostaPositivas++;
            }
        }
        scanner.close();

        if (respostaPositivas == 2) {
            System.out.println("Suspeito");
        } else if (respostaPositivas >= 3 && respostaPositivas <= 4) {
            System.out.println("Cumplice");
        } else if (respostaPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}
