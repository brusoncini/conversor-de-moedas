import javax.swing.*;

public class Menu {

    public static void main(String[] args) {
        Object[] opcoes = {"Conversor de moedas", "Outro conversor"};

        Object conversorSelecionado = JOptionPane.showInputDialog(null,
                "Escolha uma opção: ", "Menu",
                JOptionPane.INFORMATION_MESSAGE, null,
                opcoes, opcoes[0]);

        if (conversorSelecionado == opcoes[0]) {
            Object[] opcoesMoedas = {"de reais a dólares",
                    "de reais a euros",
                    "de reais a libras",
                    "de reais a ienes",
                    "de reais a won coreano",
                    "de dólares a reais",
                    "de euros a reais",
                    "de libras a reais",
                    "de ienes a reais",
                    "de won coreano a reais"};

            Object moedas = JOptionPane.showInputDialog(null,
                    "Escolha a moeda a converter:", "Moedas",
                    JOptionPane.INFORMATION_MESSAGE, null,
                    opcoesMoedas, opcoesMoedas[0]);

            // dados de 09/07/2023
            Double cotacaoDolar = 4.88;
            Double cotacaoEuros = 5.36;
            Double cotacaoLibras = 6.27;
            Double cotacaoIenes = 0.034;
            Double cotacaoWonCoreano = 0.0038;

            Double inputValor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));

            if (moedas == opcoesMoedas[0]) {
                double conversao = inputValor / cotacaoDolar;
                JOptionPane.showMessageDialog(null,
                        "O valor convertido é de $ " + conversao,
                        "Conversão",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (moedas == opcoesMoedas[1]) {
                double conversao = inputValor / cotacaoEuros;
                JOptionPane.showMessageDialog(null,
                        "O valor convertido é de € " + conversao,
                        "Conversão",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (moedas == opcoesMoedas[2]) {
                double conversao = inputValor / cotacaoLibras;
                JOptionPane.showMessageDialog(null,
                        "O valor convertido é de £ " + conversao,
                        "Conversão",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (moedas == opcoesMoedas[3]) {
                double conversao = inputValor / cotacaoIenes;
                JOptionPane.showMessageDialog(null,
                        "O valor convertido é de ¥ " + conversao,
                        "Conversão",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (moedas == opcoesMoedas[4]) {
                double conversao = inputValor / cotacaoWonCoreano;
                JOptionPane.showMessageDialog(null,
                        "O valor convertido é de ₩ " + conversao,
                        "Conversão",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (moedas == opcoesMoedas[5]) {
                double conversao = inputValor * cotacaoDolar;
                JOptionPane.showMessageDialog(null,
                        "O valor convertido é de R$ " + conversao,
                        "Conversão",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (moedas == opcoesMoedas[6]) {
                double conversao = inputValor * cotacaoEuros;
                JOptionPane.showMessageDialog(null,
                        "O valor convertido é de R$ " + conversao,
                        "Conversão",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (moedas == opcoesMoedas[7]) {
                double conversao = inputValor * cotacaoLibras;
                JOptionPane.showMessageDialog(null,
                        "O valor convertido é de R$ " + conversao,
                        "Conversão",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (moedas == opcoesMoedas[8]) {
                double conversao = inputValor * cotacaoIenes;
                JOptionPane.showMessageDialog(null,
                        "O valor convertido é de R$ " + conversao,
                        "Conversão",
                        JOptionPane.INFORMATION_MESSAGE);
            } else if (moedas == opcoesMoedas[9]) {
                double conversao = inputValor * cotacaoWonCoreano;
                JOptionPane.showMessageDialog(null,
                        "O valor convertido é de R$ " + conversao,
                        "Conversão",
                        JOptionPane.INFORMATION_MESSAGE);
            }


        } else if (conversorSelecionado == opcoes[1]) {
            JOptionPane.showMessageDialog(null, "Em construção", "Opção inválida", JOptionPane.ERROR_MESSAGE);
            new OpcoesConversor();
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida", "Opção inválida", JOptionPane.ERROR_MESSAGE);
            new OpcoesConversor();
        }
    }
}


