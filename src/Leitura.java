import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o filme: ");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDelançamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme");
        double avaliação = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDelançamento);
        System.out.println(avaliação);


    }
}
