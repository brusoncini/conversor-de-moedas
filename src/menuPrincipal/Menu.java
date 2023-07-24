package menuPrincipal;

import conversorMoedas.MenuMoedas;

import javax.swing.*;

public class Menu {

    public static void main(String[] args) {
        MenuMoedas moedas = new MenuMoedas();

        while (true) {
            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "menuPrincipal.Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Outro conversor"}, "Escolha").toString();

            switch (opcao) {
                case "Conversor de Moeda":
                    double inputValor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor"));
                    moedas.converterMoeda(inputValor);

                    int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
                    if (JOptionPane.YES_OPTION == continuar) {
                        System.out.println("Continuar programa");
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado!");
                        break;
                    }

                case "Outro conversor":
                    break;
            }

        }

    }
}


