package variaveis;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Tipo Primitivos
        //Estude a classe String que representa texto na aplicação

        String meuNome = "Amauri Filho";

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
    
        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;

        System.out.println(numeroCurto2);
        System.out.println(meuNome);
        System.out.println(salarioMinimo);
        System.out.println("Valor de PI é: " + VALOR_DE_PI);
    }
}
