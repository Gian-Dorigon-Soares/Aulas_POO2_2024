package tratamentoDeErros;

import javax.swing.*;

public class Dado {
    int numero;
    public void lerNumero() throws NumberFormatException {
        try {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Escreva um numero"));
        } catch (NumberFormatException e) {
            System.out.println("Desconectando");
            throw e;
        }
    }
}
