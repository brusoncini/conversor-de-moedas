package ConversorMoedas;

import javax.swing.*;

public class MenuMoedas {

    ConverteMoeda moeda = new ConverteMoeda();

    public void converterMoeda(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda a converter: ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais"}, "Escolha")).toString();

        switch (opcao) {
            case "De Reais a Dólares":
                moeda.reaisParaDolares(valorRecebido);
                break;
            case "De Reais a Euros":
                moeda.reaisParaEuros(valorRecebido);
                break;
            case "De Reais a Libras":
                moeda.reaisParaLibras(valorRecebido);
                break;
            case "De Reais a Peso Argentino":
                moeda.reaisParaPesosArgentinos(valorRecebido);
                break;
            case "De Reais a Peso Chileno":
                moeda.reaisParaPesosChilenos(valorRecebido);
                break;
            case "De Dólares a Reais":
                moeda.dolaresParaReais(valorRecebido);
                break;
            case "De Euros a Reais":
                moeda.eurosParaReais(valorRecebido);
                break;
            case "De Libras a Reais":
                moeda.librasParaReais(valorRecebido);
                break;
            case "De Peso Argentino a Reais":
                moeda.pesosArgentinosParaReais(valorRecebido);
                break;
            case "De Peso Chileno a Reais":
                moeda.pesosChilenosParaReais(valorRecebido);
                break;
        }

    }
}
