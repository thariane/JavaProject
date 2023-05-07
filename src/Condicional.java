public class Condicional {
    public static void main(String[] args) {
        int anoDeLançamento = 1998;
        boolean inclusoNoPlano = true;
        double IMDb = 7.2;
        String tipoPlano = "plus";

        if (anoDeLançamento >= 2022) {
            System.out.println("LANÇAMENTOS DO MOMENTO");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (inclusoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Realize sua assinatura agora mesmo!");
        }



        }
    }
