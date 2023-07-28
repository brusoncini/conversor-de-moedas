package conversorTemperaturas;

import javax.swing.*;

public class MenuTemperaturas {
    ConverteTemperatura temperatura = new ConverteTemperatura();

    public void converterMoeda(double valorRecebido) {
        String opcao = (JOptionPane.showInputDialog(null, "Escolha a conversão desejada: ", "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahrenheit a Celsius", "De Kelvin a Celsius"}, "Escolha")).toString();

        switch (opcao) {
            case "De Celsius a Fahrenheit":
                temperatura.celsiusParaFahrenheit(valorRecebido);
                break;
            case "De Celsius a Kelvin":
                temperatura.celsiusParaKelvin(valorRecebido);
                break;
            case "De Fahrenheit a Celsius":
                temperatura.fahrenheitParaCelsius(valorRecebido);
                break;
            case "De Kelvin a Celsius":
                temperatura.kelvinParaCelsius(valorRecebido);
                break;
        }

    }
}
