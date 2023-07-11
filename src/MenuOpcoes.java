import javax.swing.*;

public class MenuOpcoes {
    static Object[] opcoes = {"Conversor de moedas", "Outro conversor"};

    static Object conversorSelecionado = JOptionPane.showInputDialog(null,
            "Escolha uma opção: ", "Menu",
            JOptionPane.INFORMATION_MESSAGE, null,
            opcoes, opcoes[0]);
}
