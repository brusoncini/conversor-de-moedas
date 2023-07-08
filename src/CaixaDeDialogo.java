import javax.swing.*;

public class CaixaDeDialogo {

    public static void main(String[] args) {
        Object[] possibilidades = { "Conversor de moedas", "Outro conversor"};

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha uma opção: ", "Menu",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibilidades, possibilidades[0]);
    }
}


