package conversorTemperaturas;

import javax.swing.*;

public class ConverteTemperatura {
    public void celsiusParaFahrenheit(double valor) {
        double grausFahrenheit = (valor * 9/5) + 32;
        JOptionPane.showMessageDialog(null, "Está fazendo " + grausFahrenheit + " Graus Fahrenheit.");
    }
    public void celsiusParaKelvin(double valor) {
        double grausKelvin = valor + 273.15;
        JOptionPane.showMessageDialog(null, "Está fazendo " + grausKelvin + " Graus Kelvin.");
    }
    public void fahrenheitParaCelsius(double valor) {
        double grausFahrenheit = (valor - 32) * 5/9;
        JOptionPane.showMessageDialog(null, "Está fazendo " + grausFahrenheit + " Graus Fahrenheit.");
    }
    public void kelvinParaCelsius(double valor) {
        double grausKelvin = valor - 273.15;
        JOptionPane.showMessageDialog(null, "Está fazendo " + grausKelvin  + " Graus Fahrenheit.");
    }
}
