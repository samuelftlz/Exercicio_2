public class Questao3 {
    public static void main(String[] args) {
        double nota1 = 10;
        double nota2 = 10;
        double soma = nota1 + nota2;
        double divi = soma /2;
        double result = divi;

        if (result >= 7 && result < 10) {
            System.out.println("Aluno aprovado!");
        } else if (result == 10) {
            System.out.println("Aluno aprovado com distincao!");
        }else {
            System.out.println("Aluno reprovado!");
        }
    }
}
