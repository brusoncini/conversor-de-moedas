package ConversorMoedas;

import javax.swing.*;

public class ConverteMoeda {
    public void reaisParaDolares(double valor){
        double moedaDolar = valor / 5.13;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Dólares");
    }

    public void reaisParaEuros(double valor){
        double moedaEuro = valor / 10.85;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Euros");
    }

    public void reaisParaLibras(double valor){
        double moedaLibra = valor / 6.33;
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " Libras Esterlinas");
    }

    public void reaisParaPesosArgentinos(double valor){
        double moedaPesoArgentino = valor / 0.039;
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + "Pesos Argentinos");
    }

    public void reaisParaPesosChilenos(double valor){
        double moedaPesoChileno = valor / 0.0040;
        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + " Pesos Chilenos");
    }

    public void dolaresParaReais(double valor){
        double moedaDolar = valor * 5.13;
        moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Reais");
    }

    public void eurosParaReais(double valor){
        double moedaEuro = valor * 10.85;
        moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Reais");
    }

    public void librasParaReais(double valor){
        double moedaLibra = valor * 6.33;
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " Reais");
    }
    public void pesosArgentinosParaReais(double valor){
        double moedaPesoArgentino = valor * 0.039;
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoArgentino + " Reais");
    }

    public void pesosChilenosParaReais(double valor){
        double moedaPesoChileno = valor * 0.0040;
        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $" + moedaPesoChileno + " Reais");
    }
}
