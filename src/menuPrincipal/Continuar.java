package menuPrincipal;

import javax.swing.*;

public class Continuar {
    static int continuar = JOptionPane.showConfirmDialog(null,
            "Deseja continuar?", "menuPrincipal.Continuar",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
}
