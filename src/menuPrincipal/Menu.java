package menuPrincipal;

import ConversorMoedas.ConverteMoeda;
import ConversorMoedas.MenuMoedas;

import javax.swing.*;

public class Menu {

    public static void main(String[] args) {
        boolean iniciarPrograma = true;
        MenuMoedas moedas = new MenuMoedas();

        while (iniciarPrograma) {
            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "menuPrincipal.Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Outro conversor"}, "Escolha").toString();

            switch (opcao) {
                case "Conversor de Moeda":
                    double inputValor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
                    moedas.converterMoeda(inputValor);

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

                case "Outro conversor":
                    iniciarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Em construção", "Opção inválida", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}


