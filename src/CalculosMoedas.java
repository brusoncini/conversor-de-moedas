public class CalculosMoedas {

    public static double reaisParaMoeda(double valor, double cotacao) {
        double conversao = valor / cotacao;
        return conversao;
    }

    public static double moedaParaReais(double valor, double cotacao) {
        double conversao = valor * cotacao;
        return conversao;
    }

}
