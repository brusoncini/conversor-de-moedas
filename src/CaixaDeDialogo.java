import javax.swing.*;

public class CaixaDeDialogo {

    public static void main(String[] args) {
        Object[] opcoes = {"Conversor de moedas", "Outro conversor"};

        Object valorSelecionado = JOptionPane.showInputDialog(null,
                "Escolha uma opção: ", "Menu",
                JOptionPane.INFORMATION_MESSAGE, null,
                opcoes, opcoes[0]);

        if (valorSelecionado == opcoes[0]) {
            int inputValor = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));

        } else if (valorSelecionado == opcoes[1]) {
            JOptionPane.showMessageDialog(null, "Em construção", "Opção inválida", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida", "Opção inválida", JOptionPane.ERROR_MESSAGE);
        }
    }
}


