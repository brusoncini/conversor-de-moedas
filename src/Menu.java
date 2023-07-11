import javax.swing.*;

public class Menu {

    public static void main(String[] args) {
        boolean iniciarPrograma = true;

        while (iniciarPrograma) {
            new MenuOpcoes();

            if (MenuOpcoes.conversorSelecionado == MenuOpcoes.opcoes[0]) {
                new MenuMoedas();
                double inputValor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));

                if (MenuMoedas.moedas == MenuMoedas.opcoesMoedas[0]) {
                    double conversao = CalculosMoedas.reaisParaMoeda(inputValor, Cotacoes.cotacaoDolar);
                    JOptionPane.showMessageDialog(null,
                            "O valor convertido é de $ " + conversao,
                            "Conversão",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuMoedas.moedas == MenuMoedas.opcoesMoedas[1]) {
                    double conversao = CalculosMoedas.reaisParaMoeda(inputValor, Cotacoes.cotacaoEuros);
                    JOptionPane.showMessageDialog(null,
                            "O valor convertido é de € " + conversao,
                            "Conversão",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuMoedas.moedas == MenuMoedas.opcoesMoedas[2]) {
                    double conversao = CalculosMoedas.reaisParaMoeda(inputValor, Cotacoes.cotacaoLibras);
                    JOptionPane.showMessageDialog(null,
                            "O valor convertido é de £ " + conversao,
                            "Conversão",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuMoedas.moedas == MenuMoedas.opcoesMoedas[3]) {
                    double conversao = CalculosMoedas.reaisParaMoeda(inputValor, Cotacoes.cotacaoIenes);
                    JOptionPane.showMessageDialog(null,
                            "O valor convertido é de ¥ " + conversao,
                            "Conversão",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuMoedas.moedas == MenuMoedas.opcoesMoedas[4]) {
                    double conversao = CalculosMoedas.reaisParaMoeda(inputValor, Cotacoes.cotacaoWonCoreano);
                    JOptionPane.showMessageDialog(null,
                            "O valor convertido é de ₩ " + conversao,
                            "Conversão",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuMoedas.moedas == MenuMoedas.opcoesMoedas[5]) {
                    double conversao = CalculosMoedas.moedaParaReais(inputValor, Cotacoes.cotacaoDolar);
                    JOptionPane.showMessageDialog(null,
                            "O valor convertido é de R$ " + conversao,
                            "Conversão",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuMoedas.moedas == MenuMoedas.opcoesMoedas[6]) {
                    double conversao = CalculosMoedas.moedaParaReais(inputValor, Cotacoes.cotacaoEuros);
                    JOptionPane.showMessageDialog(null,
                            "O valor convertido é de R$ " + conversao,
                            "Conversão",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuMoedas.moedas == MenuMoedas.opcoesMoedas[7]) {
                    double conversao = CalculosMoedas.moedaParaReais(inputValor, Cotacoes.cotacaoLibras);
                    JOptionPane.showMessageDialog(null,
                            "O valor convertido é de R$ " + conversao,
                            "Conversão",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuMoedas.moedas == MenuMoedas.opcoesMoedas[8]) {
                    double conversao = CalculosMoedas.moedaParaReais(inputValor, Cotacoes.cotacaoIenes);
                    JOptionPane.showMessageDialog(null,
                            "O valor convertido é de R$ " + conversao,
                            "Conversão",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (MenuMoedas.moedas == MenuMoedas.opcoesMoedas[9]) {
                    double conversao = CalculosMoedas.moedaParaReais(inputValor, Cotacoes.cotacaoWonCoreano);
                    JOptionPane.showMessageDialog(null,
                            "O valor convertido é de R$ " + conversao,
                            "Conversão",
                            JOptionPane.INFORMATION_MESSAGE);
                }

                new Continuar();

                if (Continuar.continuar == JOptionPane.YES_OPTION) {
                    iniciarPrograma = true;
                } else if (Continuar.continuar == JOptionPane.NO_OPTION) {
                    iniciarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa finalizado!", "Fim", JOptionPane.INFORMATION_MESSAGE);
                } else if (Continuar.continuar == JOptionPane.CANCEL_OPTION) {
                    iniciarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa concluído!", "Fim", JOptionPane.INFORMATION_MESSAGE);
                }

            } else if (MenuOpcoes.conversorSelecionado == MenuOpcoes.opcoes[1]) {
                iniciarPrograma = false;
                JOptionPane.showMessageDialog(null, "Em construção", "Opção inválida", JOptionPane.ERROR_MESSAGE);
            } else {
                iniciarPrograma = false;
                JOptionPane.showMessageDialog(null, "Opção inválida", "Opção inválida", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}


