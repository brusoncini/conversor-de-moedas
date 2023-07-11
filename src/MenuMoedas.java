import javax.swing.*;

public class MenuMoedas {
    static Object[] opcoesMoedas = {"de reais a dólares",
            "de reais a euros",
            "de reais a libras",
            "de reais a ienes",
            "de reais a won coreano",
            "de dólares a reais",
            "de euros a reais",
            "de libras a reais",
            "de ienes a reais",
            "de won coreano a reais"};

    static Object moedas = JOptionPane.showInputDialog(null,
            "Escolha a moeda a converter:", "Moedas",
            JOptionPane.INFORMATION_MESSAGE, null,
            opcoesMoedas, opcoesMoedas[0]);
}
