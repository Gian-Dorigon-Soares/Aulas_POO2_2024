package exercicio_file;

import javax.swing.*;
import java.io.File;

public class ExemploFile {
    public static void main(String[] args) {
        String menu = "1 Listar\n" +
                "2 Apagar Todos os arquivos\n\n" +
                "3 Sair";
        int op = 0;
        File[] archives = null;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (op ==1) {
                String dir = JOptionPane.showInputDialog("Path");
                File directory = new File(dir);
                if (directory.isDirectory()) {
                    archives = directory.listFiles();
                    for (File f : archives) {
                        System.out.println(f.getName() + " - "+(f.length()/1024)+" KB");
                    }
                } else {
                    System.out.printf("Caminho invalido");
                }
            }
            if (op == 2) {
                for (File f : archives) {
                    f.delete();
                }
                JOptionPane.showMessageDialog(null, "Operação concluida");
            }
        } while (op != 3);
    }
}
